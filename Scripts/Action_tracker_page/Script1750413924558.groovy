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

WebUI.click(findTestObject('Object Repository/Action_tracker/Page_AI Citizen Solution/svg'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Action_tracker/Page_AI Citizen Solution/select_Select DepartmentAnimal Husbandry De_46921a'), 
    '16', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Action_tracker/Page_AI Citizen Solution/select_Select Week Start2025-06-162025-06-0_24677c'), 
    '2025-06-09', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Action_tracker/Page_AI Citizen Solution/select_Select Week End2025-06-222025-06-152_6fb35c'), 
    '2025-06-15', true)

WebUI.click(findTestObject('Object Repository/Action_tracker/Page_AI Citizen Solution/button_Apply'))

WebUI.click(findTestObject('Object Repository/Action_tracker/Page_AI Citizen Solution/td_2'))

WebUI.back()

WebUI.click(findTestObject('Object Repository/Action_tracker/Page_AI Citizen Solution/path'))

WebUI.click(findTestObject('Object Repository/Action_tracker/Page_AI Citizen Solution/svg_1'))

WebUI.click(findTestObject('Object Repository/Action_tracker/Page_AI Citizen Solution/svg_1_2'))

WebUI.click(findTestObject('Object Repository/Action_tracker/Page_AI Citizen Solution/svg_1_2_3'))

WebUI.click(findTestObject('Object Repository/Action_tracker/Page_AI Citizen Solution/div_Add Villages for the week'))

WebUI.click(findTestObject('Object Repository/Action_tracker/Page_AI Citizen Solution/div_Select Taluka_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Action_tracker/Page_AI Citizen Solution/div_Karmala'))

WebUI.click(findTestObject('Object Repository/Action_tracker/Page_AI Citizen Solution/div_Select Village_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Action_tracker/Page_AI Citizen Solution/div_Aljapur'))

WebUI.click(findTestObject('Object Repository/Action_tracker/Page_AI Citizen Solution/button_Aljapur_px-2 py-1 m-auto rounded-ful_f450a4'))

WebUI.click(findTestObject('Object Repository/Action_tracker/Page_AI Citizen Solution/svg_1'))

WebUI.click(findTestObject('Object Repository/Action_tracker/Page_AI Citizen Solution/button_Logout'))

WebUI.closeBrowser()

