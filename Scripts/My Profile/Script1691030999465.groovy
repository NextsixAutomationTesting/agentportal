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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sit-agent-v2.nextsix.com/')

WebUI.setText(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/input_User Name  Email Address_username'), 
    'Ziqh')

WebUI.click(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/div_Invalid usernamepassword. Please try ag_0fb4c6'))

WebUI.setEncryptedText(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/input_Password_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/span_Sign In'))

WebUI.click(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/span_My Profile'))

WebUI.click(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/div_Pro PackPackageThe Roof RealtyCompany N_396039'))

WebUI.click(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/span_Titled Specialist'))

WebUI.click(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/span_My Properties'))

WebUI.click(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/span_New Property Request'))

WebUI.click(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/span_My Properties'))

