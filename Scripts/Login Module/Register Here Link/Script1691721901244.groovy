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

//WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_The Next Six Agent (SIT)/span_Dont have an account yetRegister here'), "Don't have an account yet? Register here")
WebUI.click(findTestObject('Object Repository/Login/Page_The Next Six Agent (SIT)/a_Register here'))

WebUI.switchToWindowIndex(1)

WebUI.switchToWindowTitle('Property Website in Malaysia for Buy, Sell or Rent | Nextsix')

WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Property Website in Malaysia for Buy, _648e38/a_Agent Login'), 
    'Agent Login')

WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Property Website in Malaysia for Buy, _648e38/a_Lucky Draw'), 
    'Lucky Draw')

