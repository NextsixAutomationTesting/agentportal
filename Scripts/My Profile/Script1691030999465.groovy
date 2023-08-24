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

response = WS.sendRequest(findTestObject('Object Repository/agentid'))

def slurper = new groovy.json.JsonSlurper()

def result = slurper.parseText(response.getResponseBodyContent())

def renid = result.renId
def email = result.email
def fullname = result.name
def comname = result.companyName
def branch = result.branch
def firstname = result.firstName
def lastname = result.lastName
def nickname = result.nickname
def gender = result.gender
def ic = result.icno
def mobile = result.mobile
def address = result.address
def state = result.state
def area = result.area
def aboutme = result.about
def specializedstate = result.areaSpecialists[0].state
def specializedarea = result.areaSpecialists[0].area
def titledSpecialistsstate = result.titledSpecialists[0].state
def titledSpecialistsarea = result.titledSpecialists[0].area
def streetState = result.streetState
def streetarea = result.streetArea


println("""renid: $renid
email: $specializedarea
fullname: $fullname
comname: $comname
Branch: $branch
firstname: $firstname
lastname: $lastname
nickname: $nickname
gender: $gender
ic: $ic
mobile: $mobile
address: $address
state: $state
area: $area
aboutme: $aboutme""")



WebUI.openBrowser('')

WebUI.navigateToUrl('https://sit-agent-v2.nextsix.com/')

WebUI.setText(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/input_User Name  Email Address_username'), 
    'Ziqh')

WebUI.setEncryptedText(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/input_Password_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/button_Sign In'))

WebUI.click(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/span_My Profile'))

WebUI.verifyElementText(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/p_The Roof Realty'), comname)

WebUI.verifyElementText(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/p_HQ'), branch)

WebUI.verifyElementText(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/p_Selangor'), state)

WebUI.verifyElementText(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/p_Subang Jaya'), area)

//WebUI.verifyElementText(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/p_Alam Impian'), specializedarea)

WebUI.verifyElementText(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/p_The Condo, The Apartment'), 
    'The Condo, The Apartment')

assert WebUI.getAttribute(findTestObject('myprofile/Page_The Next Six Agent (SIT)/input_Ren ID_renId_1', [('renid') : renid]),'value') == renid : 'renid is not equal'
assert WebUI.getAttribute(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/input_Email Address_Email Address', [('email') : email]), 'value') == email : 'email is not equal'
assert WebUI.getAttribute(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/input_Full Name_Full Name',[('fullname') : fullname]), 'value') == fullname : 'fullname is not equal'

assert WebUI.getAttribute(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/input_First Name_First Name',[('firstname') : firstname]), 'value') == firstname : 'firstname is not equal'

assert WebUI.getAttribute(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/input_Last Name_Last Name',[('lastname') : lastname]), 'value') == lastname : 'lastname is not equal'

assert WebUI.getAttribute(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/input_Nick Name_Nick Name',[('nickname') : nickname]), 'value') == nickname : 'nickname is not equal'

assert WebUI.verifyElementText(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/div_Male', [('gender') : gender]), gender)

assert WebUI.getAttribute(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/input_Ic Number_Ic Number',[('icno') : ic]), 'value') == ic : 'ic not matched'

//assert WebUI.getAttribute(findTestObject`('Object Repository/myprofile/Page_The Next Six Agent (SIT)/input_Passport Number_Passport Number'), 'value') == '' : ''

assert WebUI.getAttribute(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/input_Phone Number_Phone Number',[('mobile') : mobile]), 'value') == mobile : 'phone number not matched'

assert WebUI.getAttribute(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/input_Address_Address',[('address') : address]), 'value') == address : 'address not matched'

assert WebUI.getAttribute(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/div_Wilayah Persekutuan Kuala Lumpur',[('streetState') : streetState]), 'value') == streetState : 'state not matched'

assert WebUI.getAttribute(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/div_Kuchai Lama',[('streetarea') : streetarea]), 'value') == streetarea : 'area not matched'

assert WebUI.getAttribute(findTestObject('Object Repository/myprofile/Page_The Next Six Agent (SIT)/textarea_One of the best agent in malaysia',[('about') : aboutme]), 'value') == aboutme : 'about me not matched'

