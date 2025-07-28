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
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

ResponseObject op_response = WS.sendRequest(findTestObject('API Objects/Postcodes'))

pincode = WS.getElementText(op_response, '[0].PostOffice[1].Pincode')

println(op_response.responseBodyContent)

println(pincode)

ResponseObject op_response1 = WS.sendRequest(findTestObject('API Objects/Postcodes1', [('pin') : pincode]))

println(op_response1.responseBodyContent)

WebUI.callTestCase(findTestCase('CSIRO Test'), [('user_name') : 'Admin', ('passwd') : 'hUKwJTbofgPU9eVlw/CnDQ==', ('dashboard_heading') : 'Dashboard'
        , ('pin') : pincode], FailureHandling.STOP_ON_FAILURE)

