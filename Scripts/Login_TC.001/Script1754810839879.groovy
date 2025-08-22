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

herokuapp = "https://katalon-demo-cura.herokuapp.com/"

WebUI.openBrowser(herokuapp)

Header = WebUI.getText(findTestObject('Object Repository/Page Home/Header'))

Subheader = WebUI.getText(findTestObject('Object Repository/Page Home/Sub header'))

MakeAppointment = WebUI.getText(findTestObject('Object Repository/Page Home/btn_MakeAppointment'))

WebUI.comment(Header)

WebUI.comment(Subheader)

WebUI.comment(MakeAppointment)

WebUI.click(findTestObject('Object Repository/Page Home/btn_MakeAppointment'))

username = WebUI.getAttribute(findTestObject('Object Repository/Page Login/Text_Username'), 'value')

password = WebUI.getAttribute(findTestObject('Object Repository/Page Login/Text_password'), 'value')

WebUI.setText(findTestObject('Object Repository/Page Login/Input Username'), username)

WebUI.setText(findTestObject('Object Repository/Page Login/Input Password'), password)

WebUI.click(findTestObject('Object Repository/Page Login/btn_loginmake apointment'))

//WebUI.acceptAlert()

//selectoption / dropdown list
WebUI.selectOptionByIndex(findTestObject('Object Repository/Page Appointment/dropdown_Facility'), 0)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page Appointment/dropdown_Facility'), 'Hongkong CURA Healthcare Center', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page Appointment/dropdown_Facility'), 'Seoul CURA Healthcare Center', false)
//checkbox
WebUI.check(findTestObject('Object Repository/Page Appointment/cb_Apply'))
//radiobutton
WebUI.click(findTestObject('Object Repository/Page Appointment/rb_Medicare'))
//input date
//WebUI.setText(findTestObject('Object Repository/Page Appointment/input_visitdate'), '05/05/2025')
//settext comment
WebUI.setText(findTestObject('Object Repository/Page Appointment/text_comment'), 'latihan katalon')

WebUI.click(findTestObject('Object Repository/Page Appointment/btn_BookAppointment'))






