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
import com.kms.katalon.core.webservice.keyword.builtin.SendRequestKeyword as SendRequestKeyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WS.sendRequest(findTestObject('Object Repository/agentid'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sit-agent-v2.nextsix.com/')

WebUI.setText(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/Page_The Next Six Agent (SIT)/input_User Name  Email Address_username'), 
    'Ziqh')

WebUI.click(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/Page_The Next Six Agent (SIT)/div_Invalid usernamepassword. Please try ag_0fb4c6'))

WebUI.setEncryptedText(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/Page_The Next Six Agent (SIT)/input_Password_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/Page_The Next Six Agent (SIT)/span_Sign In'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/Page_The Next Six Agent (SIT)/span_My Profile'))


WebUI.verifyElementText(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/Page_The Next Six Agent (SIT)/p_Pro Pack'), 
    'Pro Pack')

WebUI.verifyElementText(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/Page_The Next Six Agent (SIT)/p_The Roof Realty'), 
    'The Roof Realty')

WebUI.verifyElementText(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/Page_The Next Six Agent (SIT)/p_HQ'), 
    'HQ')

WebUI.verifyElementText(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/Page_The Next Six Agent (SIT)/p_Selangor'), 
    'Selangor')

WebUI.verifyElementText(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/Page_The Next Six Agent (SIT)/p_Subang Jaya'), 
    'Subang Jaya')

WebUI.verifyElementText(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/Page_The Next Six Agent (SIT)/p_Alam Impian'), 
    'Alam Impian')

WebUI.verifyElementText(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/Page_The Next Six Agent (SIT)/p_The Condo, The Apartment'), 
    'The Condo, The Apartment')

WebUI.verifyElementText(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/Page_The Next Six Agent (SIT)/input_Ren ID_renId'), 
    'REN123')

//WebUI.verifyElementText(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/Page_The Next Six Agent (SIT)/input_Email Address_Email Address'), 
//    '')
//
//WebUI.verifyElementText(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/Page_The Next Six Agent (SIT)/input_Full Name_Full Name'), 
//    '')
//
//WebUI.verifyElementText(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/Page_The Next Six Agent (SIT)/input_First Name_First Name'), 
//    '')
//
//WebUI.verifyElementText(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/Page_The Next Six Agent (SIT)/input_Last Name_Last Name'), 
//    '')
//
//WebUI.verifyElementText(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/Page_The Next Six Agent (SIT)/input_Nick Name_Nick Name'), 
//    '')
//
//WebUI.verifyElementText(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/Page_The Next Six Agent (SIT)/div_Male'), 
//    'Male')

