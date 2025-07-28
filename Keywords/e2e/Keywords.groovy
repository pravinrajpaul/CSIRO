package e2e

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

import org.openqa.selenium.WebDriver

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Keywords {

	@Keyword
	def getURLWindow(String url) {

		WebDriver driver = DriverFactory.getWebDriver()

		boolean found = false
		for (String handle : driver.getWindowHandles()) {
			if (driver.getCurrentUrl().contains(url)) {
				driver.switchTo().window(handle)
				println "✅ Switched to matching window: ${driver.getCurrentUrl()}"
				found = true
				break
			}
		}

		if (!found) {
			println "❌ No matching window found for URL: ${url}"
		}
	}

	@Keyword
	def storeExecutionState(String property, String value) {



		Path dirPath = Paths.get("Resources/ExecutionState")
		Path filePath = dirPath.resolve("State")

		if (!Files.exists(dirPath)) {
			Files.createDirectories(dirPath)
		}

		if (!Files.exists(filePath)) {
			Files.createFile(filePath)
		}

		def props = [:]
		filePath.toFile().eachLine { line ->
			if (line.contains('=')) {
				def (k, v) = line.split('=', 2)
				props[k.trim()] = v.trim()
			}
		}

		props[property] = value

		def builder = new StringBuilder()
		props.each { k, v -> builder << "${k}=${v}\n" }
		Files.write(filePath, builder.toString().getBytes("UTF-8"))

		println "✅ Saved: ${property} = ${value}"
	}

	@Keyword
	def String readExecutionState(String property) {
		Path filePath = Paths.get("Resources/ExecutionState/", "State")

		if (!Files.exists(filePath)) {
			println "❌ File not found: $filePath"
			return null
		}

		String val = null

		filePath.toFile().eachLine { line ->
			if (line.contains('=')) {
				def (k, v) = line.split('=', 2)
				if (k.trim() == property) val = v.trim()
			}
		}

		if (val == null) {
			println "⚠️ Key not found: $property"
			return null
		}
		else {
			println "✅ Loaded**: ${property} = ${val}"
			return val
		}
	}
}
