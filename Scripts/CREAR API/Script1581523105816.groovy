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

WebUI.setText(findTestObject('Object Repository/CrearApi/input_AeolCloud - Admin Console_form-contro_3c96d7'), 'alejandro.lopez@birchmangroup.com')

WebUI.setEncryptedText(findTestObject('Object Repository/CrearApi/input_AeolCloud - Admin Console_form-contro_e80096'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/CrearApi/button_Entrar'))

WebUI.click(findTestObject('Object Repository/CrearApi/a_ Gateway'))

WebUI.click(findTestObject('Object Repository/CrearApi/a_ Apis'))

WebUI.click(findTestObject('Object Repository/CrearApi/a_Api'))

WebUI.setText(findTestObject('Object Repository/CrearApi/input_Name_apiname'), 'testing2')

WebUI.selectOptionByValue(findTestObject('Object Repository/CrearApi/select_qa production develop'), 'qa', true)

WebUI.setText(findTestObject('Object Repository/CrearApi/input_Catalog_apicatalog'), 'aeol')

WebUI.setText(findTestObject('Object Repository/CrearApi/input_Version_apiversion'), '1.2.0')

WebUI.click(findTestObject('Object Repository/CrearApi/b_Configuration'))

WebUI.setText(findTestObject('Object Repository/CrearApi/input_Listen Url_form-control ng-untouched _c7eedf'), '/testing')

WebUI.setText(findTestObject('Object Repository/CrearApi/input_Target Url_form-control ng-untouched _92eb65'), 'https://testing.com')

WebUI.setText(findTestObject('Object Repository/CrearApi/input_Tiny Url_form-control ng-untouched ng_e8b320'), '/test')

WebUI.selectOptionByValue(findTestObject('Object Repository/CrearApi/select_POST GET PUT DELETE PATCH COPY LINK _71bd7f'), 
    'POST', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/CrearApi/select_POST GET PUT DELETE PATCH COPY LINK _71bd7f'), 
    'GET', true)

WebUI.setText(findTestObject('Object Repository/CrearApi/input_Timeout_form-control ng-untouched ng-_8e4394'), '1')

WebUI.click(findTestObject('Object Repository/CrearApi/button_Save'))

WebUI.click(findTestObject('Object Repository/CrearApi/a_Alejandro Lopez'))

WebUI.click(findTestObject('Object Repository/CrearApi/a_Cerrar Sesin'))

WebUI.closeBrowser()

