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

WebUI.navigateToUrl('https://sit-agent.nextsix.com/')

WebUI.setText(findTestObject('Object Repository/dashboard/Page_The Next Six Agent (SIT)/input_User Name  Email Address_username'), 
    'cayden')

WebUI.setEncryptedText(findTestObject('Object Repository/dashboard/Page_The Next Six Agent (SIT)/input_Password_password'), 
    'H0pLMoc45+4=')

WebUI.click(findTestObject('Object Repository/dashboard/Page_The Next Six Agent (SIT)/button_Sign In'))

WebUI.verifyElementText(findTestObject('Object Repository/dashboard/Page_The Next Six Agent (SIT)/div_Welcome, Caydenski1'), 
    'Welcome, Caydenski1')

WebUI.verifyElementText(findTestObject('Object Repository/dashboard/Page_The Next Six Agent (SIT)/div_Quick Access'), 'Quick Access')

WebUI.verifyElementText(findTestObject('Object Repository/dashboard/Page_The Next Six Agent (SIT)/div_My Subscription'), 
    'My Subscription')

WebUI.verifyElementText(findTestObject('Object Repository/dashboard/Page_The Next Six Agent (SIT)/div_Package Pro Pack Maximum active propert_73c178'), 
    'Package: Pro Pack Maximum active property listings: 700 Maximum photos per property listing: 30')

WebUI.click(findTestObject('Object Repository/dashboard/Page_The Next Six Agent (SIT)/div_My Active Properties Summary'))

