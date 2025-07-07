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
//WebUI.click(findTestObject('Object Repository/Login_statistics/Issue_summary_reports/Page_AI Citizen Solution/input_Welcome_w-full bg-gray-50 border bord_29b4f0'))
//
//WebUI.sendKeys(findTestObject('Object Repository/Login_statistics/Issue_summary_reports/Page_AI Citizen Solution/input_Welcome_w-full bg-gray-50 border bord_29b4f0'), 
//    'Collector')
//
//WebUI.click(findTestObject('Object Repository/Login_statistics/Issue_summary_reports/Page_AI Citizen Solution/input_Welcome_w-full bg-gray-50 border bord_29b4f0'), 
//    FailureHandling.STOP_ON_FAILURE)
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Login_statistics/Issue_summary_reports/Page_AI Citizen Solution/input_Welcome_w-full bg-gray-50 border bord_29b4f0'), 
//    'SN3xLSe5pmSyITd9+x6UVA==')
//
//WebUI.click(findTestObject('Object Repository/Login_statistics/Issue_summary_reports/Page_AI Citizen Solution/button_Login'))
//
//Thread.sleep(3000)
WebUI.callTestCase(findTestCase('Base_page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Login_statistics/Issue_summary_reports/Page_AI Citizen Solution/div_AI Citizen Engagement Solution_mdmr-0 m_54445b'))

WebUI.click(findTestObject('Object Repository/Login_statistics/Issue_summary_reports/Page_AI Citizen Solution/li_Issue Summary Report'))

//WebUI.refresh()
WebUI.selectOptionByValue(findTestObject('Object Repository/Login_statistics/Issue_summary_reports/Page_AI Citizen Solution/select_Select DeptAnimal Husbandry Departme_aff248'), 
    '16', true)

WebUI.click(findTestObject('Object Repository/Login_statistics/Issue_summary_reports/Page_AI Citizen Solution/td_Akkalkot'))

WebUI.click(findTestObject('Object Repository/Login_statistics/Issue_summary_reports/Page_AI Citizen Solution/button_Back to Talukas'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Login_statistics/Issue_summary_reports/Page_AI Citizen Solution/select_All IssuesAmbulance Service Availabi_6318dd'), 
//    'doctor_availability', true)
WebUI.click(findTestObject('Object Repository/Login_statistics/Issue_summary_reports/Page_AI Citizen Solution/td_879'))

WebUI.click(findTestObject('Object Repository/Login_statistics/Issue_summary_reports/Page_AI Citizen Solution/path'))

WebUI.click(findTestObject('Object Repository/Login_statistics/Issue_summary_reports/Page_AI Citizen Solution/svg'))

WebUI.back()

WebUI.click(findTestObject('Object Repository/Login_statistics/Issue_summary_reports/Page_AI Citizen Solution/td_18'))

WebUI.back()

WebUI.click(findTestObject('Object Repository/Login_statistics/Issue_summary_reports/Page_AI Citizen Solution/a_Download CSV'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Login_statistics/Issue_summary_reports/Page_AI Citizen Solution/select_Default (Negative First)Issue Rate (_af6bff'), 
    'asc', true)

WebUI.click(findTestObject('Object Repository/Login_statistics/Issue_summary_reports/Page_AI Citizen Solution/button_Sort By_p-2 rounded-5px shadow-md tr_828053'))

WebUI.click(findTestObject('Object Repository/Login_statistics/Issue_summary_reports/Page_AI Citizen Solution/button_Clear'))

WebUI.click(findTestObject('Object Repository/Login_statistics/Issue_summary_reports/Page_AI Citizen Solution/th_Total Count'))

WebUI.click(findTestObject('Object Repository/Login_statistics/Issue_summary_reports/Page_AI Citizen Solution/th_Total Count'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Login_statistics/Issue_summary_reports/Page_AI Citizen Solution/select_All IssuesAmbulance Service Availabi_6318dd'), 
    'doctor_availability', true)

WebUI.click(findTestObject('Object Repository/Login_statistics/Issue_summary_reports/Page_AI Citizen Solution/button_Logout'))

WebUI.closeBrowser()

