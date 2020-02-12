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

WebUI.setText(findTestObject('Object Repository/CrearUsuario/input_AeolCloud - Admin Console_form-contro_3c96d7'), 'Alejandro.lopez@birchmangroup.com')

WebUI.setEncryptedText(findTestObject('Object Repository/CrearUsuario/input_AeolCloud - Admin Console_form-contro_e80096'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/CrearUsuario/button_Entrar'))

WebUI.setText(findTestObject('Object Repository/CrearUsuario/input_AeolCloud - Admin Console_form-contro_3c96d7'), 'alejandro.lopez@birchmangroup.com')

WebUI.click(findTestObject('Object Repository/CrearUsuario/button_Entrar'))

WebUI.click(findTestObject('Object Repository/CrearUsuario/a_ Security'))

WebUI.click(findTestObject('Object Repository/CrearUsuario/a_ Users'))

WebUI.click(findTestObject('Object Repository/CrearUsuario/a_User'))

WebUI.setText(findTestObject('Object Repository/CrearUsuario/input_First Name_form-control ng-untouched _9706e8'), 'PedroP')

WebUI.selectOptionByValue(findTestObject('Object Repository/CrearUsuario/select_AdminWriterReader'), 'admin', true)

WebUI.setText(findTestObject('Object Repository/CrearUsuario/input_First Name_form-control ng-untouched _9706e8'), 'pedroperez@example.com')

WebUI.setEncryptedText(findTestObject('Object Repository/CrearUsuario/input_Password_form-control ng-untouched ng_170e06'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/CrearUsuario/span_onoff'))

WebUI.click(findTestObject('Object Repository/CrearUsuario/button_Save'))

WebUI.click(findTestObject('Object Repository/CrearUsuario/button_Search'))

WebUI.click(findTestObject('Object Repository/CrearUsuario/a_Alejandro Lopez'))

WebUI.click(findTestObject('Object Repository/CrearUsuario/a_Cerrar Sesin'))

WebUI.closeBrowser()

