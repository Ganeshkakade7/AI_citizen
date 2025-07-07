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
//WebUI.setText(findTestObject('Object Repository/Issue_analysis/Page_AI Citizen Solution/input_Welcome_w-full bg-gray-50 border bord_29b4f0'), 
//    '')
//
//WebUI.setText(findTestObject('Object Repository/Issue_analysis/Page_AI Citizen Solution/input_Welcome_w-full bg-gray-50 border bord_29b4f0'), 
//    'Collector')
//
//WebUI.setText(findTestObject('Object Repository/Issue_analysis/Page_AI Citizen Solution/input_Welcome_w-full bg-gray-50 border bord_29b4f0'), 
//    '')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Issue_analysis/Page_AI Citizen Solution/input_Welcome_w-full bg-gray-50 border bord_29b4f0'), 
//    'SN3xLSe5pmSyITd9+x6UVA==')
//
//WebUI.click(findTestObject('Object Repository/Issue_analysis/Page_AI Citizen Solution/button_Login'))
WebUI.callTestCase(findTestCase('Base_page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Issue_analysis/Page_AI Citizen Solution/div_AI Citizen Engagement Solution_mdmr-0 m_54445b'))

//Thread.sleep(3000)
WebUI.verifyElementClickable(findTestObject('Object Repository/Issue_analysis/Page_AI Citizen Solution/div_SangoleNormal Status'), 
    FailureHandling.STOP_ON_FAILURE)

//WebUI.click(findTestObject('Object Repository/Issue_analysis/Page_AI Citizen Solution/div_SangoleNormal Status'))
WebUI.verifyElementClickable(findTestObject('Object Repository/Issue_analysis/Page_AI Citizen Solution/button_Back to Talukas'))

WebUI.click(findTestObject('Object Repository/Issue_analysis/Page_AI Citizen Solution/button_Positive LocationsPositive (10)'))

WebUI.click(findTestObject('Object Repository/Issue_analysis/Page_AI Citizen Solution/span_Negative Locations'))

WebUI.click(findTestObject('Object Repository/Issue_analysis/Page_AI Citizen Solution/span_All Locations'))

WebUI.click(findTestObject('Object Repository/Issue_analysis/Page_AI Citizen Solution/h6_Un-Resolved Citizen Issues'))

WebUI.click(findTestObject('Object Repository/Issue_analysis/Page_AI Citizen Solution/svg'))

WebUI.click(findTestObject('Object Repository/Issue_analysis/Page_AI Citizen Solution/svg'))

WebUI.back()

WebUI.click(findTestObject('Object Repository/Issue_analysis/Page_AI Citizen Solution/div_Resolved Citizen IssuesAction taken68'))

WebUI.click(findTestObject('Object Repository/Issue_analysis/Page_AI Citizen Solution/p_Action Taken'))

WebUI.click(findTestObject('Issue_analysis/Page_AI Citizen Solution/p_Action Taken'))

WebUI.back()

WebUI.click(findTestObject('Object Repository/Issue_analysis/Page_AI Citizen Solution/h6_Doctor was not available'))

WebUI.back()

WebUI.click(findTestObject('Object Repository/Issue_analysis/Page_AI Citizen Solution/button_Campaign_p-2 rounded-5px shadow-md t_956c52'))

//WebUI.click(findTestObject('Issue_analysis/Page_AI Citizen Solution/Date_filter_from_date'))
//
//WebUI.setText(findTestObject('Issue_analysis/Page_AI Citizen Solution/Date_filter_from_date'), '01-06-2025')
//
//WebUI.click(findTestObject('Issue_analysis/Page_AI Citizen Solution/to_date_filter'))
//
//WebUI.setText(findTestObject('Issue_analysis/Page_AI Citizen Solution/to_date_filter'), '20-06-2025')
WebUI.click(findTestObject('Object Repository/Issue_analysis/Page_AI Citizen Solution/div_Select Taluka_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Issue_analysis/Page_AI Citizen Solution/div_Barshi'))

WebUI.click(findTestObject('Object Repository/Issue_analysis/Page_AI Citizen Solution/div_Select Taluka_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Issue_analysis/Page_AI Citizen Solution/div_Malshiras'))

WebUI.click(findTestObject('Object Repository/Issue_analysis/Page_AI Citizen Solution/button_Apply'))

String selectedTaluka1 = WebUI.getText(findTestObject('Issue_analysis/Page_AI Citizen Solution/selectedtaluka1'))

println('Selected taluka: ' + selectedTaluka1)

WebUI.verifyMatch(selectedTaluka1, 'Barshi', false)

String selectedTaluka2 = WebUI.getText(findTestObject('Issue_analysis/Page_AI Citizen Solution/selectedtaluka2'))

println('Selected taluka: ' + selectedTaluka2)

WebUI.verifyMatch(selectedTaluka2, 'Malshiras', false)

WebUI.click(findTestObject('Object Repository/Issue_analysis/Page_AI Citizen Solution/button_Campaign_p-2 rounded-5px shadow-md t_956c52'))

WebUI.click(findTestObject('Action_log/Page_AI Citizen Solution/Village_click'))

WebUI.click(findTestObject('Action_log/Page_AI Citizen Solution/village_aljapur'))

WebUI.click(findTestObject('Action_log/Page_AI Citizen Solution/Village_click'))

WebUI.click(findTestObject('Action_log/Page_AI Citizen Solution/village_ambegaon'))

WebUI.click(findTestObject('Object Repository/Issue_analysis/Page_AI Citizen Solution/button_Apply'))

String selectedVillage1 = WebUI.getText(findTestObject('Issue_analysis/Page_AI Citizen Solution/selectedtaluka1'))

println('Selected taluka: ' + selectedVillage1)

WebUI.verifyMatch(selectedVillage1, 'Ambegaon', false)

String selectedVillage2 = WebUI.getText(findTestObject('Issue_analysis/Page_AI Citizen Solution/selectedtaluka2'))

println('Selected taluka: ' + selectedVillage2)

WebUI.verifyMatch(selectedVillage2, 'Aljapur', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Issue_analysis/Page_AI Citizen Solution/select_Select DepartmentAnimal Husbandry De_46921a'), 
    '16', true)

WebUI.click(findTestObject('Object Repository/Issue_analysis/Page_AI Citizen Solution/button_Campaign_p-2 rounded-5px shadow-md t_956c52'))

WebUI.click(findTestObject('Object Repository/Issue_analysis/Page_AI Citizen Solution/button_Clear'))

WebUI.click(findTestObject('Object Repository/Issue_analysis/Page_AI Citizen Solution/button_Logout'))

String toastText = WebUI.getText(findTestObject('Issue_analysis/Page_AI Citizen Solution/Logout_toast'))

println('Toast message received: ' + toastText)

WebUI.verifyMatch(toastText, 'Logout Successful !!', false)

WebUI.closeBrowser()

