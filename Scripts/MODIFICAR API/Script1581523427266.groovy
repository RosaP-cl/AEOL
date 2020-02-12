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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.0.101:8001/')

WebUI.setText(findTestObject('Object Repository/ModificarApi/input_AeolCloud - Admin Console_form-contro_3c96d7'), 'alejandro.lopez@birchmangroup.com')

WebUI.setEncryptedText(findTestObject('Object Repository/ModificarApi/input_AeolCloud - Admin Console_form-contro_e80096'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/ModificarApi/button_Entrar'))

WebUI.click(findTestObject('Object Repository/ModificarApi/a_ Gateway'))

WebUI.click(findTestObject('Object Repository/ModificarApi/a_ Apis'))

WebUI.setText(findTestObject('Object Repository/ModificarApi/input_Name_apiname'), 'test')

WebUI.click(findTestObject('Object Repository/ModificarApi/button_Search'))

WebUI.click(findTestObject('Object Repository/ModificarApi/i_testing_fa fa-edit'))

WebUI.click(findTestObject('Object Repository/ModificarApi/div_Environment qa production developVersion'))

WebUI.setText(findTestObject('Object Repository/ModificarApi/input_Version_apiversion'), '')

WebUI.click(findTestObject('Object Repository/ModificarApi/b_Configuration'))

WebUI.setText(findTestObject('Object Repository/ModificarApi/input_Listen Url_form-control ng-untouched _432e81'), '/testing23')

WebUI.click(findTestObject('Object Repository/ModificarApi/b_Info'))

WebUI.setText(findTestObject('Object Repository/ModificarApi/input_Version_apiversion'), '1.2.1')

WebUI.click(findTestObject('Object Repository/ModificarApi/button_Modify'))

WebUI.click(findTestObject('Object Repository/ModificarApi/button_OK'))

WebUI.setText(findTestObject('Object Repository/ModificarApi/input_Version_apiversion'), '1.2.0')

WebUI.click(findTestObject('Object Repository/ModificarApi/button_Modify'))

WebUI.click(findTestObject('Object Repository/ModificarApi/button_OK'))

WebUI.click(findTestObject('Object Repository/ModificarApi/b_Configuration'))

WebUI.setText(findTestObject('Object Repository/ModificarApi/input_Listen Url_form-control ng-untouched _432e81'), '/testing')

WebUI.click(findTestObject('Object Repository/ModificarApi/b_Info'))

WebUI.click(findTestObject('Object Repository/ModificarApi/button_Modify'))

WebUI.click(findTestObject('Object Repository/ModificarApi/button_OK'))

WebUI.click(findTestObject('Object Repository/ModificarApi/button_Cancel'))

WebUI.click(findTestObject('Object Repository/ModificarApi/a_Alejandro Lopez'))

WebUI.click(findTestObject('Object Repository/ModificarApi/a_Cerrar Sesin'))

WebUI.closeBrowser()

