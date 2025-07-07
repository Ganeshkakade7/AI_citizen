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

CustomKeywords.'utility.Login.valid_login'()

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://citizenengagementsolution.markytics.com/login')

WebUI.click(findTestObject('Object Repository/Correction/Page_AI Citizen Solution/input_Welcome_w-full bg-gray-50 border bord_29b4f0'))

WebUI.setText(findTestObject('Object Repository/Correction/Page_AI Citizen Solution/input_Welcome_w-full bg-gray-50 border bord_29b4f0_1_2'), 
    'Collector')

WebUI.setText(findTestObject('Object Repository/Correction/Page_AI Citizen Solution/input_Welcome_w-full bg-gray-50 border bord_29b4f0'), 
    '')

WebUI.setEncryptedText(findTestObject('Object Repository/Correction/Page_AI Citizen Solution/input_Welcome_w-full bg-gray-50 border bord_c3e347_1'), 
    'SN3xLSe5pmSyITd9+x6UVA==')

WebUI.verifyTextPresent('ddfvdfdfdfew', false)

WebUI.click(findTestObject('Object Repository/Correction/Page_AI Citizen Solution/button_Logout'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://citizenengagementsolution.markytics.com/location-reports')

WebUI.navigateToUrl('https://citizenengagementsolution.markytics.com/login')

WebUI.selectOptionByValue(findTestObject('Object Repository/Correction/Page_AI Citizen Solution/select_Select DepartmentHealth DepartmentAn_3f02b1'), 
    '17', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Correction/Page_AI Citizen Solution/select_Select DepartmentHealth DepartmentAn_3f02b1'), 
    '16', true)

WebUI.closeBrowser()

