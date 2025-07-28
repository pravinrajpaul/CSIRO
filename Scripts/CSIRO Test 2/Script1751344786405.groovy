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

/*
 * Automate the login process to a web application and verify successful navigation to the dashboard.
 *
 * 1. Open a new browser instance.
 * 2. Navigate to the application URL specified by a global variable.
 * 3. Enter the provided username into the username input field.
 * 4. Enter the provided encrypted password into the password input field.
 * 5. Capture a full-page screenshot as a checkpoint of the login page.
 * 6. Click the login button to submit the credentials.
 * 7. Wait for 3 seconds to allow the page to load.
 * 8. Verify that the dashboard heading text matches the expected value, continuing on failure.
 * 9. Capture a full-page screenshot as a checkpoint of the dashboard page.
 * 10. Close the browser instance.
 */
// Open a new browser instance
WebUI.openBrowser('')

// Navigate to the application URL specified by a global variable
WebUI.navigateToUrl(GlobalVariable.APP_URL)

WebUI.maximizeWindow()

// Enter the provided username into the username input field
WebUI.setText(findTestObject('Page_OrangeHRM/input_Username_username'), username)

// Enter the provided encrypted password into the password input field
WebUI.setEncryptedText(findTestObject('Page_OrangeHRM/input_Password_password'), password)

// Capture a full-page screenshot as a checkpoint of the login page
WebUI.takeFullPageScreenshot()

// Click the login button to submit the credentials
WebUI.click(findTestObject('Page_OrangeHRM/button_Login'))

// Wait for 3 seconds to allow the page to load
WebUI.delay(3)

// Verify that the dashboard heading text matches the expected value, continuing on failure
WebUI.verifyElementText(findTestObject('Page_Dashboard/h6_Dashboard'), dashboard_heading, FailureHandling.CONTINUE_ON_FAILURE)

// Capture a full-page screenshot as a checkpoint of the dashboard page
WebUI.takeFullPageScreenshotAsCheckpoint('DashboardOrangeHR')

// Close the browser instance
WebUI.closeBrowser()

