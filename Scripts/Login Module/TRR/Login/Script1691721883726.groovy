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
import com.kms.katalon.core.webui.keyword.builtin.NavigateToUrlKeyword as NavigateToUrlKeyword
import com.kms.katalon.core.webui.keyword.builtin.OpenBrowserKeyword as OpenBrowserKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sit-agent-v2.nextsix.com/')

WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_The Next Six Agent (SIT)/label_User Name  Email Address'), 
    'USER NAME / EMAIL ADDRESS')

WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_The Next Six Agent (SIT)/input_User Name  Email Address_username'), 
    '')

WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_The Next Six Agent (SIT)/label_Password'), 'PASSWORD')

WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_The Next Six Agent (SIT)/input_Password_password'), 
    '')

WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_The Next Six Agent (SIT)/button_forgot password'), 
    'forgot password')

WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_The Next Six Agent (SIT)/span_Sign In'), 'Sign In')

WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_The Next Six Agent (SIT)/span_Dont have an account yetRegister here'), 
    'Don\'t have an account yet? Register here')

WebUI.setText(findTestObject('Object Repository/Login/Page_The Next Six Agent (SIT)/input_User Name  Email Address_username'), 
    'Ziqh')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_The Next Six Agent (SIT)/input_Password_password'), 
    'YC0926CP/9Y=')

WebUI.click(findTestObject('Object Repository/Login/Page_The Next Six Agent (SIT)/span_Sign In'))

WebUI.sendKeys(findTestObject('Object Repository/Login/Page_The Next Six Agent (SIT)/input_Password_password'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Login/Page_The Next Six Agent (SIT)/input_Password_password'), Keys.chord(
        Keys.DELETE))

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_The Next Six Agent (SIT)/input_Password_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Login/Page_The Next Six Agent (SIT)/span_Sign In'))

WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_The Next Six Agent (SIT)/p_Ziqh'), 'Ziqh')

WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_The Next Six Agent (SIT)/p_ziqhrugmail.com'), 'ziqhru@gmail.com')

WebUI.click(findTestObject('Object Repository/Login/Page_The Next Six Agent (SIT)/Page_The Next Six Agent (SIT)/span_Logout'))

WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_The Next Six Agent (SIT)/Page_The Next Six Agent (SIT)/span_Sign In'), 'Sign In')