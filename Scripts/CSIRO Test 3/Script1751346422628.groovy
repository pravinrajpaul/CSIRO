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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

// 1. Open a new browser instance.
WebUI.openBrowser('')

// 2. Navigate to the application URL specified by a global variable.
WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')

// 3. Enter the provided username into the username input field.
WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_username'), 'Admin')

// 4. Enter the provided encrypted password into the password input field.
WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Password_password'), 'admin123')

// 5. Capture a full-page screenshot as a checkpoint of the login page.
WebUI.takeFullPageScreenshotAsCheckpoint('Checkpoint_LoginPage')

// 6. Click the login button to submit the credentials.
WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login'))

// 8. Verify that the dashboard heading text matches the expected value, continuing on failure.
WebUI.verifyElementText(findTestObject('Object Repository/Page_Dashboard/h6_Dashboard'), 'Dashboard', FailureHandling.CONTINUE_ON_FAILURE)

// 9. Capture a full-page screenshot as a checkpoint of the dashboard page.
WebUI.takeFullPageScreenshotAsCheckpoint('Checkpoint_DashboardPage')

// 10. Close the browser instance.
WebUI.closeBrowser()

