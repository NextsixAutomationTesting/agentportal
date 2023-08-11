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

WebUI.setText(findTestObject('Object Repository/Login/Page_The Next Six Agent (SIT)/input_User Name  Email Address_username'), 
    'ziqhru@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_The Next Six Agent (SIT)/input_Password_password'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Login/Page_The Next Six Agent (SIT)/Page_The Next Six Agent (SIT)/span_Sign In'))

WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_The Next Six Agent (SIT)/Page_The Next Six Agent (SIT)/div_Invalid usernamepassword. Please try again'), 
    'Invalid username/password. Please try again')

WebUI.sendKeys(findTestObject('Object Repository/Login/Page_The Next Six Agent (SIT)/input_Password_password'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Login/Page_The Next Six Agent (SIT)/input_Password_password'), Keys.chord(
        Keys.DELETE))

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_The Next Six Agent (SIT)/input_Password_password'), 
    'HeCM15nHKBI=')

WebUI.click(findTestObject('Object Repository/Login/Page_The Next Six Agent (SIT)/Page_The Next Six Agent (SIT)/span_Sign In'))

WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_The Next Six Agent (SIT)/Page_The Next Six Agent (SIT)/p_ziqhrugmail.com'), 
    'ziqhru@gmail.com')

WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_The Next Six Agent (SIT)/Page_The Next Six Agent (SIT)/img_Copyright  2020-2023. The Next Six Sdn._2664f6'), 
    0)

WebUI.click(findTestObject('Object Repository/Login/Page_The Next Six Agent (SIT)/Page_The Next Six Agent (SIT)/span_Logout'))

WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_The Next Six Agent (SIT)/Page_The Next Six Agent (SIT)/span_Sign In'), 
    'Sign In')

