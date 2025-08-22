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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.configuration.RunConfiguration

//login
WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/OrangeHRM/Login/Name Parameter',[('name_parameter') : 'username' ]), 'Admin')

WebUI.setText(findTestObject('Object Repository/OrangeHRM/Login/Name Parameter',[('name_parameter') : 'password' ]), 'admin123')

WebUI.click(findTestObject('Object Repository/OrangeHRM/Login/Type Parameter', [('type_parameter') : 'submit']))

//dashboard
WebUI.verifyTextPresent('Dashboard', false)

WebUI.click(findTestObject('Object Repository/OrangeHRM/Login/menu-MyInfo'))

WebUI.delay(2)

//Personal Details

WebUI.verifyTextPresent('Personal Details', false)

WebUI.click(findTestObject('Object Repository/OrangeHRM/MyInfo/Picture-Profile'))

//Upload Image

WebUI.verifyTextPresent('Change Profile Picture', false)

def projectDir = RunConfiguration.getProjectDir()

def filePath = projectDir + '/image/foto robot.png'

WebUI.uploadFile(findTestObject('Object Repository/OrangeHRM/MyInfo/Upload-Image'), filePath)

def filePath2 = projectDir + '/image/file_example_PNG_3MB.png'

WebUI.uploadFile(findTestObject('Object Repository/OrangeHRM/MyInfo/Upload-Image'), filePath2)

WebUI.verifyTextPresent('Attachment Size Exceeded', false)

def filePath3 = projectDir + '/image/dummy-pdf_2.pdf'

WebUI.uploadFile(findTestObject('Object Repository/OrangeHRM/MyInfo/Upload-Image'), filePath3)

WebUI.verifyTextPresent('File type not allowed', false)






