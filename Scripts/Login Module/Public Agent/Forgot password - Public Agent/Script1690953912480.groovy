import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sit-agent-v2.nextsix.com/')

WebUI.click(findTestObject('Object Repository/Forgot Password/Page_The Next Six Agent (SIT)/Page_The Next Six Agent (SIT)/button_forgot password'))

WebUI.setText(findTestObject('Object Repository/Forgot Password/Page_The Next Six Agent (SIT)/Page_The Next Six Agent (SIT)/input_User Name_username'), 
    'testernext61@outlook.com')

WebUI.click(findTestObject('Object Repository/Forgot Password/Page_The Next Six Agent (SIT)/Page_The Next Six Agent (SIT)/submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Forgot Password/Page_The Next Six Agent (SIT)/Page_The Next Six Agent (SIT)/successtext'), 
    'Password reset request was sent successfully. Please check your email to reset your password.')

WebUI.sendKeys(findTestObject('Object Repository/Forgot Password/Page_The Next Six Agent (SIT)/Page_The Next Six Agent (SIT)/input_User Name_username'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Forgot Password/Page_The Next Six Agent (SIT)/Page_The Next Six Agent (SIT)/input_User Name_username'), 
    Keys.chord(Keys.DELETE))

WebUI.navigateToUrl('https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=15&ct=1690958366&rver=7.0.6737.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fcobrandid%3dab0455a0-8d03-46b9-b18b-df2f57b9e44c%26nlp%3d1%26deeplink%3dowa%252f%26RpsCsrfState%3d47550ee8-a8a1-75fe-368f-063c1837e2dd&id=292841&aadredir=1&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=ab0455a0-8d03-46b9-b18b-df2f57b9e44c')

WebUI.setText(findTestObject('Object Repository/Forgot Password/Page_The Next Six Agent (SIT)/outlooklogin'), 'testernext61@outlook.com')

WebUI.click(findTestObject('Object Repository/Forgot Password/Page_The Next Six Agent (SIT)/nextbutton'))

WebUI.setText(findTestObject('Object Repository/Forgot Password/Page_The Next Six Agent (SIT)/outlookpassword'), 'Next65678')

WebUI.click(findTestObject('Object Repository/Forgot Password/Page_The Next Six Agent (SIT)/nextbutton'))

WebUI.click(findTestObject('Object Repository/Forgot Password/Page_The Next Six Agent (SIT)/button_no'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Forgot Password/Page_The Next Six Agent (SIT)/Page_The Next Six Agent (SIT)/Page_Email - tester next6 - Outlook/span_Reset your password'))

WebUI.click(findTestObject('Object Repository/Forgot Password/Page_The Next Six Agent (SIT)/Page_The Next Six Agent (SIT)/Page_Email - tester next6 - Outlook/Page_Email - tester next6 - Outlook/a_Visit this link to reset your password'))

WebUI.switchToWindowIndex('1')

String newpassword = RandomStringUtils.randomAlphabetic(6)

WebUI.setText(findTestObject('Object Repository/Forgot Password/Page_The Next Six Agent (SIT)/newusername'), newpassword)

WebUI.setText(findTestObject('Object Repository/Forgot Password/Page_The Next Six Agent (SIT)/confirmpassword'), newpassword)

WebUI.click(findTestObject('Object Repository/Forgot Password/Page_The Next Six Agent (SIT)/submitbutton'))

WebUI.verifyElementText(findTestObject('Object Repository/Forgot Password/Page_The Next Six Agent (SIT)/successfulmessage'), 
    'Successfully change password, please login via app.')

WebUI.switchToWindowIndex('0')

WebUI.click(findTestObject('Object Repository/Forgot Password/Page_The Next Six Agent (SIT)/deleteunbox'))

WebUI.delay(2)

WebUI.navigateToUrl('https://sit-agent-v2.nextsix.com/')

WebUI.setText(findTestObject('Object Repository/Login/Page_The Next Six Agent (SIT)/input_User Name  Email Address_username'), 
    'testernext61@outlook.com')

WebUI.setText(findTestObject('Object Repository/Login/Page_The Next Six Agent (SIT)/input_Password_password'), newpassword)

WebUI.click(findTestObject('Object Repository/Login/Page_The Next Six Agent (SIT)/span_Sign In'))

WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_The Next Six Agent (SIT)/p_ziqhrugmail.com'), 'testernext61@outlook.com')

