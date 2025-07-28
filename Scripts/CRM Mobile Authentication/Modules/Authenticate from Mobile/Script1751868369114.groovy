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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.delay(20)

twoDigitPin = CustomKeywords.'e2e.Keywords.readExecutionState'('twoDigitToken')

KeywordUtil.logInfo("Two digit pin read : " + twoDigitPin)

Mobile.startExistingApplication('com.azure.authenticator')

Mobile.tap(findTestObject('Object Repository/CRM Mobile Authentication/Mobile Part/android.widget.Button - Use PIN'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/CRM Mobile Authentication/Mobile Part/android.widget.EditText'), mobileUnlockPin, 
    0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('CRM Mobile Authentication/Mobile Part/android.widget.Button - Pin', [('twoDigitPin') : twoDigitPin]), 
    0)

Mobile.tap(findTestObject('Object Repository/CRM Mobile Authentication/Mobile Part/android.widget.Button - APPROVE'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/CRM Mobile Authentication/Mobile Part/android.widget.Button - Use PIN'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/CRM Mobile Authentication/Mobile Part/android.widget.EditText'), mobileUnlockPin, 
    0)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.closeApplication()

WebUI

