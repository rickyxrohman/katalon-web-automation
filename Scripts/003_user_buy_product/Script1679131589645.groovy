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

WebUI.callTestCase(findTestCase('001_login_valid_user'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('btn_add_cart_backpack'))

WebUI.click(findTestObject('btn_shopping_cart'))

WebUI.click(findTestObject('btn_checkout'))

WebUI.setText(findTestObject('input_firstname'), 'Ricky')

WebUI.setText(findTestObject('input_lastname'), 'Rohman')

WebUI.setText(findTestObject('input_postalcode'), '15415')

WebUI.click(findTestObject('btn_continue'))

WebUI.verifyElementPresent(findTestObject('verify_checkout'), 0)

WebUI.click(findTestObject('btn_finish'))

WebUI.verifyElementPresent(findTestObject('verify_complete_order'), 0)

