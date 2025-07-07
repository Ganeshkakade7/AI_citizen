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
//WebUI.click(findTestObject('Object Repository/Login_statistics/Page_AI Citizen Solution/input_Welcome_w-full bg-gray-50 border bord_29b4f0'))
//
//WebUI.setText(findTestObject('Object Repository/Department_call_data/Page_AI Citizen Solution/input_Welcome_w-full bg-gray-50 border bord_29b4f0_1_2'), 
//    'Collector')
//
//WebUI.setText(findTestObject('Object Repository/Login_statistics/Page_AI Citizen Solution/input_Welcome_w-full bg-gray-50 border bord_29b4f0'), 
//    '')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Department_call_data/Page_AI Citizen Solution/input_Welcome_w-full bg-gray-50 border bord_c3e347_1'), 
//    'SN3xLSe5pmSyITd9+x6UVA==')
//
//WebUI.click(findTestObject('Object Repository/Login_statistics/Page_AI Citizen Solution/button_Login'))
WebUI.callTestCase(findTestCase('Base_page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Correction/Page_AI Citizen Solution/svg_AI Citizen Engagement Solution_svg-inli_e82fed'))

WebUI.click(findTestObject('Object Repository/Correction/Page_AI Citizen Solution/div_Department Highlights Report'))

WebUI.click(findTestObject('Object Repository/Department_highlights_reports/Page_AI Citizen Solution/td_Mangalwedha'))

WebUI.click(findTestObject('Object Repository/Department_highlights_reports/Page_AI Citizen Solution/button_Back to Talukas'))

Thread.sleep(3000)

WebUI.selectOptionByValue(findTestObject('Object Repository/Department_highlights_reports/Page_AI Citizen Solution/select_Select DeptAnimal Husbandry Departme_aff248'), 
    '16', true)

WebUI.click(findTestObject('Object Repository/Department_highlights_reports/Page_AI Citizen Solution/td_Medicine Availability'))

WebUI.click(findTestObject('Object Repository/Department_highlights_reports/Page_AI Citizen Solution/svg_Call Citizen_h-4 w-4'))

WebUI.click(findTestObject('Object Repository/Department_highlights_reports/Page_AI Citizen Solution/svg'))

WebUI.back()

WebUI.click(findTestObject('Object Repository/Department_highlights_reports/Page_AI Citizen Solution/td_110'))

WebUI.back()

WebUI.selectOptionByValue(findTestObject('Object Repository/Department_highlights_reports/Page_AI Citizen Solution/select_Default (Negative First)Issue Rate (_af6bff'), 
    'asc', true)

WebUI.click(findTestObject('Object Repository/Department_highlights_reports/Page_AI Citizen Solution/a_Download CSV'))

WebUI.click(findTestObject('Object Repository/Department_highlights_reports/Page_AI Citizen Solution/button_Sort By_p-2 rounded-5px shadow-md tr_828053'))

WebUI.click(findTestObject('Object Repository/Department_highlights_reports/Page_AI Citizen Solution/button_Clear'))

WebUI.click(findTestObject('Object Repository/Department_highlights_reports/Page_AI Citizen Solution/button_Logout'))

WebUI.closeBrowser()

