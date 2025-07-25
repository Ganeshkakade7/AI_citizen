import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Base_page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Issue_Raised_1/Page_AI Citizen Solution/div_AI Citizen Engagement Solution_flex ite_28ef24'))

WebUI.click(findTestObject('Issue_Raised_1/Page_AI Citizen Solution/div_SangoleNormal Status'))

WebUI.click(findTestObject('Issue_Raised_1/Page_AI Citizen Solution/button_Show reports'))

WebUI.click(findTestObject('Issue_Raised_1/Page_AI Citizen Solution/svg_Created At_text-xl'))

WebUI.click(findTestObject('Issue_Raised_1/Page_AI Citizen Solution/select_AllOpenClosed'))

WebUI.click(findTestObject('Issue_Raised_1/Page_AI Citizen Solution/select_AllOpenClosed'))

WebUI.click(findTestObject('Issue_Raised_1/Page_AI Citizen Solution/button_English_bg-primary text-white p-1 ro_c20890'))

WebUI.click(findTestObject('Issue_Raised_1/Page_AI Citizen Solution/p_Action Taken'))

WebUI.click(findTestObject('Issue_Raised_1/Page_AI Citizen Solution/button_Call Citizen_bg-primary hoverbg-prim_970696'))

WebUI.click(findTestObject('Issue_Raised_1/Page_AI Citizen Solution/button_Summary_text-gray-600 hovertext-gray_d150f5'))

WebUI.click(findTestObject('Issue_Raised_1/Page_AI Citizen Solution/button_Rahul Balu Madane_bg-primary hoverbg_0bbdf8'))

WebUI.click(findTestObject('Issue_Raised_1/Page_AI Citizen Solution/button_Close'))

WebUI.click(findTestObject('Issue_Raised_1/Page_AI Citizen Solution/div__react-switch-handle'))

WebUI.click(findTestObject('Issue_Raised_1/Page_AI Citizen Solution/button_Logout'))

WebUI.closeBrowser()

