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
//WebUI.click(findTestObject('Object Repository/Geography_page/Page_AI Citizen Solution/input_Welcome_w-full bg-gray-50 border bord_29b4f0'))
//
//WebUI.setText(findTestObject('Object Repository/Geography_page/Page_AI Citizen Solution/input_Welcome_w-full bg-gray-50 border bord_29b4f0_1_2'), 
//    'Collector')
//
//WebUI.setText(findTestObject('Object Repository/Geography_page/Page_AI Citizen Solution/input_Welcome_w-full bg-gray-50 border bord_29b4f0'), 
//    '')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Geography_page/Page_AI Citizen Solution/input_Welcome_w-full bg-gray-50 border bord_c3e347'), 
//    'SN3xLSe5pmSyITd9+x6UVA==')
//
//WebUI.click(findTestObject('Object Repository/Geography_page/Page_AI Citizen Solution/span_Login'))
WebUI.callTestCase(findTestCase('Base_page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Geography_page/Page_AI Citizen Solution/svg'))

Thread.sleep(3000)
//WebUI.selectOptionByValue(findTestObject('Geography_page/Page_AI Citizen Solution/Department'), '17', true)

WebUI.verifyElementClickable(findTestObject('Geography_page/Page_AI Citizen Solution/div_SangoleAI Calls17536'))

WebUI.click(findTestObject('Object Repository/Geography_page/Page_AI Citizen Solution/button_Back to Talukas'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Geography_page/Page_AI Citizen Solution/div_Successful Calls9381'))

WebUI.back()

WebUI.click(findTestObject('Object Repository/Geography_page/Page_AI Citizen Solution/div_AI Citizen Engagement Solution_flex ite_124079')).sleep(
    3000)

WebUI.click(findTestObject('Object Repository/Geography_page/Page_AI Citizen Solution/div_Issues Raised1574'))

Thread.sleep(3000)

WebUI.click(findTestObject('Object Repository/Geography_page/Page_AI Citizen Solution/svg_Call Citizen_h-4 w-4'))

WebUI.click(findTestObject('Object Repository/Geography_page/Page_AI Citizen Solution/svg_1'))

WebUI.click(findTestObject('Object Repository/Geography_page/Page_AI Citizen Solution/svg_1_2'))

WebUI.back()

WebUI.click(findTestObject('Object Repository/Geography_page/Page_AI Citizen Solution/span_Positive Talukas (10)'))

WebUI.click(findTestObject('Object Repository/Geography_page/Page_AI Citizen Solution/span_Negative Talukas (1)'))

WebUI.click(findTestObject('Object Repository/Geography_page/Page_AI Citizen Solution/span_Positive Talukas (10)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Geography_page/Page_AI Citizen Solution/select_DailyWeeklyMonthly'), 
    'month', true)

WebUI.click(findTestObject('Object Repository/Geography_page/Page_AI Citizen Solution/button_Campaign_p-2 rounded-5px shadow-md t_956c52'))

WebUI.click(findTestObject('Object Repository/Geography_page/Page_AI Citizen Solution/div_Select Taluka_css-19bb58m')).sleep(
    2000)

WebUI.click(findTestObject('Object Repository/Test_Login/Page_AI Citizen Solution/div_Karmala'))

WebUI.click(findTestObject('Object Repository/Test_Login/Page_AI Citizen Solution/div_Select Taluka_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Test_Login/Page_AI Citizen Solution/div_Madha'))

WebUI.click(findTestObject('Action_log/Page_AI Citizen Solution/Village_click'))

WebUI.click(findTestObject('Action_log/Page_AI Citizen Solution/village_aljapur'))

WebUI.click(findTestObject('Action_log/Page_AI Citizen Solution/Village_click'))

WebUI.click(findTestObject('Geography_page/Page_AI Citizen Solution/Village_Awati'))

WebUI.click(findTestObject('Object Repository/Geography_page/Page_AI Citizen Solution/button_Apply'))

//WebUI.click(findTestObject('Object Repository/Test_Login/Page_AI Citizen Solution/button_Apply'))
WebUI.click(findTestObject('Object Repository/Geography_page/Page_AI Citizen Solution/button_Campaign_p-2 rounded-5px shadow-md t_956c52'))

WebUI.click(findTestObject('Object Repository/Geography_page/Page_AI Citizen Solution/button_Clear'))

WebUI.click(findTestObject('Object Repository/Geography_page/Page_AI Citizen Solution/button_Logout'))

WebUI.closeBrowser()

