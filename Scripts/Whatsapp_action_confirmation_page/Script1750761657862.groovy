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

//WebUI.openBrowser('')
//
//WebUI.maximizeWindow()
//
//WebUI.navigateToUrl('https://citizenengagementsolution.markytics.com/login')
//
//WebUI.click(findTestObject('Object Repository/Whatsapp_action_confirmation/Page_AI Citizen Solution/input_Welcome_w-full bg-gray-50 border bord_29b4f0'))
//
//WebUI.setText(findTestObject('Object Repository/Whatsapp_action_confirmation/Page_AI Citizen Solution/input_Welcome_w-full bg-gray-50 border bord_29b4f0'), 
//    'Collector')
//
//WebUI.setText(findTestObject('Object Repository/Whatsapp_action_confirmation/Page_AI Citizen Solution/input_Welcome_w-full bg-gray-50 border bord_29b4f0'), 
//    '')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Whatsapp_action_confirmation/Page_AI Citizen Solution/input_Welcome_w-full bg-gray-50 border bord_29b4f0'), 
//    'SN3xLSe5pmSyITd9+x6UVA==')
//
//WebUI.click(findTestObject('Object Repository/Whatsapp_action_confirmation/Page_AI Citizen Solution/button_Login'))
WebUI.callTestCase(findTestCase('Base_page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Whatsapp_action_confirmation/Page_AI Citizen Solution/svg_AI Citizen Engagement Solution_svg-inli_e82fed'))

WebUI.click(findTestObject('Object Repository/Whatsapp_action_confirmation/Page_AI Citizen Solution/div_Whatsapp Action Confirm'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Whatsapp_action_confirmation/Page_AI Citizen Solution/select_Select DepartmentFood And Civil Serv_51a9e4'), 
    '16', true)

WebUI.click(findTestObject('Object Repository/Whatsapp_action_confirmation/Page_AI Citizen Solution/button_Fetch'))

WebUI.click(findTestObject('Object Repository/Whatsapp_action_confirmation/Page_AI Citizen Solution/button_View'))

WebUI.click(findTestObject('Object Repository/Whatsapp_action_confirmation/Page_AI Citizen Solution/div_Clear Filters_fixed top-0 bottom-0 left_9a0679'))

WebUI.click(findTestObject('Object Repository/Whatsapp_action_confirmation/Page_AI Citizen Solution/button_Summary'))

WebUI.click(findTestObject('Object Repository/Whatsapp_action_confirmation/Page_AI Citizen Solution/svg'))

WebUI.click(findTestObject('Object Repository/Whatsapp_action_confirmation/Page_AI Citizen Solution/button_Logout'))

WebUI.closeBrowser()

