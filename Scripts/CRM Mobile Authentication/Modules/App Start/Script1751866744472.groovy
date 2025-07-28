import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.CRM_URL)

WebUI.setText(findTestObject('Object Repository/CRM Mobile Authentication/Page_Sign in/input_Email or phone number_usernameEntry'), 
    GlobalVariable.CRM_USER)

WebUI.click(findTestObject('Object Repository/CRM Mobile Authentication/Page_Sign in/button_Next'))

twoDigitToken = WebUI.getText(findTestObject('Object Repository/CRM Mobile Authentication/Page_Check your Authenticator app/span_2 Digit Token'), 
    FailureHandling.CONTINUE_ON_FAILURE)

driver = DriverFactory.getWebDriver()

currentUrl = driver.getCurrentUrl()

CustomKeywords.'e2e.Keywords.storeExecutionState'('twoDigitToken', twoDigitToken)

WebUI.waitForElementPresent(findTestObject('Object Repository/CRM Mobile Authentication/Page_Stay signed in/button_Yes'), 
    120)

WebUI.click(findTestObject('Object Repository/CRM Mobile Authentication/Page_Stay signed in/button_Yes'))

WebUI.verifyElementPresent(findTestObject('Object Repository/CRM Mobile Authentication/Page_Microsoft account  Security/h1_Security'), 
    0)

WebUI.closeBrowser()

