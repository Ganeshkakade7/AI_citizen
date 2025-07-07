package utility

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Login {
	
	@Keyword
	def  valid_login () {
		
		WebUI.openBrowser(null)
		
		WebUI.maximizeWindow()
		
		WebUI.navigateToUrl('https://citizenengagementsolution.markytics.com/login')
		
		WebUI.click(findTestObject('Object Repository/Login_statistics/Page_AI Citizen Solution/input_Welcome_w-full bg-gray-50 border bord_29b4f0'))
		
		WebUI.setText(findTestObject('Object Repository/Department_call_data/Page_AI Citizen Solution/input_Welcome_w-full bg-gray-50 border bord_29b4f0_1_2'),
			'Collector')
		
		WebUI.setText(findTestObject('Object Repository/Login_statistics/Page_AI Citizen Solution/input_Welcome_w-full bg-gray-50 border bord_29b4f0'),
			'')
		
		WebUI.setEncryptedText(findTestObject('Object Repository/Department_call_data/Page_AI Citizen Solution/input_Welcome_w-full bg-gray-50 border bord_c3e347_1'),
			'SN3xLSe5pmSyITd9+x6UVA==')
		
		WebUI.click(findTestObject('Object Repository/Login_statistics/Page_AI Citizen Solution/button_Login'))
		
		println("Successful login....")
			}
}
