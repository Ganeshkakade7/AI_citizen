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

WebUI.click(findTestObject('Object Repository/Issue_raised/Page_AI Citizen Solution/Page_AI Citizen Solution/svg_AI Citizen Engagement Solution_svg-inli_957acc'))

WebUI.click(findTestObject('Object Repository/Issue_raised/Page_AI Citizen Solution/Page_AI Citizen Solution/div_SangoleNormal Status'))

WebUI.click(findTestObject('Object Repository/Issue_raised/Page_AI Citizen Solution/Page_AI Citizen Solution/button_Show reports'))

WebUI.click(findTestObject('Object Repository/Issue_raised/Page_AI Citizen Solution/Page_AI Citizen Solution/svg_Created At_text-xl'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Issue_raised/Page_AI Citizen Solution/Page_AI Citizen Solution/select_AllOpenClosed'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Issue_raised/Page_AI Citizen Solution/Page_AI Citizen Solution/select_AllOpenClosed'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Issue_raised/Page_AI Citizen Solution/Page_AI Citizen Solution/svg_1'))

WebUI.click(findTestObject('Object Repository/Issue_raised/Page_AI Citizen Solution/Page_AI Citizen Solution/svg_Call Citizen_h-4 w-4'))

WebUI.click(findTestObject('Object Repository/Issue_raised/Page_AI Citizen Solution/Page_AI Citizen Solution/button_Summary'))

WebUI.click(findTestObject('Object Repository/Issue_raised/Page_AI Citizen Solution/Page_AI Citizen Solution/svg_1_2'))

WebUI.click(findTestObject('Object Repository/Issue_raised/Page_AI Citizen Solution/Page_AI Citizen Solution/p_Action Taken'))

WebUI.click(findTestObject('Object Repository/Issue_raised/Page_AI Citizen Solution/Page_AI Citizen Solution/p_Action Taken'))

WebUI.click(findTestObject('Object Repository/Issue_raised/Page_AI Citizen Solution/Page_AI Citizen Solution/button_Rahul Balu Madane_bg-primary hoverbg_0bbdf8'))

WebUI.click(findTestObject('Object Repository/Issue_raised/Page_AI Citizen Solution/Page_AI Citizen Solution/button_Close'))

WebUI.click(findTestObject('Object Repository/Issue_raised/Page_AI Citizen Solution/Page_AI Citizen Solution/div__react-switch-bg'))

WebUI.click(findTestObject('Object Repository/Issue_raised/Page_AI Citizen Solution/Page_AI Citizen Solution/div__react-switch-bg'))

WebUI.click(findTestObject('Object Repository/Issue_raised/Page_AI Citizen Solution/Page_AI Citizen Solution/button_Logout'))

WebUI.closeBrowser()

