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

WebUI.setText(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/input_User Name  Email Address_username'), 
    'Ziqh')

WebUI.setEncryptedText(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/input_Password_password'), 
    'aeHFOx8jV/A=')
//
WebUI.click(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/span_New Property Request'))

WebUI.verifyElementText(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/span_New Property Request'), 
    'New Property Request')

WebUI.click(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/button_Create New Property Request'))

WebUI.verifyElementText(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/p_NOTE Only make new request if the propert_38fa62'), 
    'NOTE: Only make new request if the property is high rise (Apartment, Flat, Condominium or Service Residence)')

WebUI.click(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/div_Property Name'))

WebUI.setText(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/input_Property Name_propName'),
	'Kuchai Avenue') // enter existing propertymaster for validation 

WebUI.click(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/button_Next'))

WebUI.verifyElementText(findTestObject('Object Repository/Forgot Password/Page_The Next Six Agent (SIT)/verifyduplicate'), 'Property Name is not unique')

WebUI.sendKeys(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/input_Property Name_propName'),
	Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/input_Property Name_propName'),
	Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/input_Property Name_propName'),
	'kucHAI avenue') // enter existing propertymaster with different case for validation 

WebUI.click(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/button_Next'))

WebUI.verifyElementText(findTestObject('Object Repository/Forgot Password/Page_The Next Six Agent (SIT)/verifyduplicate'), 'Property Name is not unique')

WebUI.sendKeys(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/input_Property Name_propName'),
	Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/input_Property Name_propName'),
	Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/input_Property Name_propName'), 
    'The Apartment 2')

WebUI.click(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/div_Select Property Category'))

WebUI.click(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/div_ApartmentFlat'))

WebUI.click(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/div_Select Property Type'))

WebUI.click(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/div_Apartment'))

WebUI.click(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/button_Next'))

WebUI.setText(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/input_Address Line 1_propAddressLine1'), 
    'Jalan Tiara Sendayan 2, Taman Tiara Sendayan')

WebUI.setText(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/input_City_propCity'), 
    'Labu')

WebUI.setText(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/input_Postcode_propPostcode'), 
    '71900')

WebUI.click(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/div_Select State'))

WebUI.click(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/div_Negeri Sembilan'))

WebUI.click(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/div_Select Area'))

WebUI.click(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/div_Labu'))

WebUI.click(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/div_Select All'))

WebUI.click(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/div_Deselect All'))

WebUI.click(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/div_Select All'))

WebUI.click(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/button_Publish'))

WebUI.verifyElementText(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/p_Are you sure you want to submit this request'), 
    'Are you sure you want to submit this request?')

WebUI.click(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/button_Publish'))

WebUI.click(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/button_Confirmation modal_btn-close'))

WebUI.click(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/button_Publish'))

WebUI.click(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/h1_Successful'), 
    'Successful')

WebUI.click(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/button_Back to New Property Request'))

WebUI.verifyElementText(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/td_The Apartment 2'), 
    'The Apartment 2')
newdate = new Date().format( 'dd/M/yyyy' )

println newdate
WebUI.verifyElementText(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/td_0282023'), 
    newdate)

WebUI.verifyElementText(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/span_Pending'), 
    'Pending')

WebUI.setText(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/input_Create New Property Request_form-cont_25d365'), 
    'The Apartment')

WebUI.click(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/button_Apply'))

WebUI.verifyElementText(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/td_The Apartment 2'), 
    'The Apartment 2')

WebUI.verifyElementText(findTestObject('Object Repository/Create new property master/Page_The Next Six Agent (SIT)/span_Pending'), 
    'Pending')

