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

WebUI.callTestCase(findTestCase('Base_page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Whatsapp_confirmation_reports/Page_AI Citizen Solution/div_AI Citizen Engagement Solution_mdmr-0 m_54445b'))

WebUI.click(findTestObject('Object Repository/Whatsapp_confirmation_reports/Page_AI Citizen Solution/div_WhatsApp Confirmation Report'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Whatsapp_confirmation_reports/Page_AI Citizen Solution/select_Select CampaignAnganwadi WhatsAppAni_3e0c5c'), 
    'CMP-79', true)

WebUI.click(findTestObject('Department_call_data/Page_AI Citizen Solution/div_Select Taluka_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Whatsapp_confirmation_reports/Page_AI Citizen Solution/div_Barshi'))

WebUI.click(findTestObject('Object Repository/Whatsapp_confirmation_reports/Page_AI Citizen Solution/button_Apply Filters'))

WebUI.click(findTestObject('Whatsapp_confirmation_reports/Page_AI Citizen Solution/div_Select Village_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Whatsapp_confirmation_reports/Page_AI Citizen Solution/div_Alipur'))

WebUI.click(findTestObject('Object Repository/Whatsapp_confirmation_reports/Page_AI Citizen Solution/button_Apply Filters'))

WebUI.click(findTestObject('Object Repository/Whatsapp_confirmation_reports/Page_AI Citizen Solution/button_Clear Filters'))

WebUI.click(findTestObject('Object Repository/Whatsapp_confirmation_reports/Page_AI Citizen Solution/button_View'))

WebUI.click(findTestObject('Object Repository/Whatsapp_confirmation_reports/Page_AI Citizen Solution/button_Summary'))

WebUI.click(findTestObject('Object Repository/Whatsapp_confirmation_reports/Page_AI Citizen Solution/svg'))

WebUI.click(findTestObject('Object Repository/Whatsapp_confirmation_reports/Page_AI Citizen Solution/button_Logout'))

