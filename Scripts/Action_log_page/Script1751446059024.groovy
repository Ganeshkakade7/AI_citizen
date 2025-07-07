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

WebUI.click(findTestObject('Object Repository/Action_log_page/Page_AI Citizen Solution/path'))

WebUI.click(findTestObject('Object Repository/Action_log_page/Page_AI Citizen Solution/div_All_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Action_log_page/Page_AI Citizen Solution/div_Priyanka Mahendra Jadhav'))

WebUI.click(findTestObject('Object Repository/Action_log_page/Page_AI Citizen Solution/div_All_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Action_log_page/Page_AI Citizen Solution/div_Ranjeet Uddhavraj Jadhav'))

WebUI.click(findTestObject('Object Repository/Action_log_page/Page_AI Citizen Solution/div_All_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Action_log_page/Page_AI Citizen Solution/div_Vishnu Shripati Kolekar'))

WebUI.click(findTestObject('Object Repository/Action_log_page/Page_AI Citizen Solution/div_Vishnu Shripati Kolekar_1'))

WebUI.click(findTestObject('Object Repository/Action_log_page/Page_AI Citizen Solution/div_All'))

WebUI.click(findTestObject('Object Repository/Action_log_page/Page_AI Citizen Solution/svg_Created At_text-xl'))

WebUI.click(findTestObject('Object Repository/Action_log_page/Page_AI Citizen Solution/svg_Call Citizen_h-4 w-4'))

WebUI.click(findTestObject('Object Repository/Action_log_page/Page_AI Citizen Solution/svg'))

WebUI.back()

WebUI.selectOptionByValue(findTestObject('Object Repository/Action_log_page/Page_AI Citizen Solution/select_Select DepartmentAnimal Husbandry De_46921a'), 
    '16', true)

WebUI.click(findTestObject('Object Repository/Action_log_page/Page_AI Citizen Solution/button_Action Logs_p-2 rounded-5px shadow-m_57416a'))

WebUI.click(findTestObject('Object Repository/Action_log_page/Page_AI Citizen Solution/div_Select Taluka'))

WebUI.click(findTestObject('Object Repository/Action_log_page/Page_AI Citizen Solution/div_Barshi'))

WebUI.click(findTestObject('Object Repository/Action_log_page/Page_AI Citizen Solution/div_Barshi_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Action_log_page/Page_AI Citizen Solution/div_Madha'))

WebUI.click(findTestObject('Object Repository/Action_log_page/Page_AI Citizen Solution/div_Select Village_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Action_log_page/Page_AI Citizen Solution/div_Alipur'))

WebUI.click(findTestObject('Object Repository/Action_log_page/Page_AI Citizen Solution/div_Select Village_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Action_log_page/Page_AI Citizen Solution/div_Ambabaiwadi'))

WebUI.click(findTestObject('Object Repository/Action_log_page/Page_AI Citizen Solution/button_Apply'))

WebUI.click(findTestObject('Object Repository/Action_log_page/Page_AI Citizen Solution/svg_1'))

WebUI.click(findTestObject('Object Repository/Action_log_page/Page_AI Citizen Solution/button_Clear'))

WebUI.click(findTestObject('Object Repository/Action_log_page/Page_AI Citizen Solution/div_Action Logs_hidden smflex items-center _2d5d09'))

WebUI.click(findTestObject('Object Repository/Action_log_page/Page_AI Citizen Solution/button_Logout'))

WebUI.closeBrowser()

