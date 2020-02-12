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

WebUI.setText(findTestObject('Object Repository/ModificarUsuario/input_AeolCloud - Admin Console_form-contro_3c96d7'), 'alejandro.lopez@birchmangroup.com')

WebUI.click(findTestObject('Object Repository/ModificarUsuario/div_AeolCloud - Admin Console_form-group'))

WebUI.setEncryptedText(findTestObject('Object Repository/ModificarUsuario/input_AeolCloud - Admin Console_form-contro_e80096'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/ModificarUsuario/div_AeolCloud - Admin ConsoleEntrar'))

WebUI.setEncryptedText(findTestObject('Object Repository/ModificarUsuario/input_AeolCloud - Admin Console_form-contro_e80096'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/ModificarUsuario/button_Entrar'))

WebUI.click(findTestObject('Object Repository/ModificarUsuario/a_ Security'))

WebUI.click(findTestObject('Object Repository/ModificarUsuario/a_ Users'))

WebUI.click(findTestObject('Object Repository/ModificarUsuario/button_Search'))

WebUI.click(findTestObject('Object Repository/ModificarUsuario/i_enable_fa fa-edit'))

WebUI.setText(findTestObject('Object Repository/ModificarUsuario/input_Email_form-control ng-untouched ng-pr_4f6f29'), 'pedroperez1@example.com')

WebUI.click(findTestObject('Object Repository/ModificarUsuario/button_Modify'))

WebUI.click(findTestObject('Object Repository/ModificarUsuario/button_OK'))

WebUI.setText(findTestObject('Object Repository/ModificarUsuario/input_Email_form-control ng-untouched ng-pr_4f6f29'), 'pedroperez@example.com')

WebUI.click(findTestObject('Object Repository/ModificarUsuario/div_RolAdminWriterReaderPassword'))

WebUI.setEncryptedText(findTestObject('Object Repository/ModificarUsuario/input_Password_form-control ng-untouched ng_337005'), 
    'qeJ0sjJnwEs=')

WebUI.click(findTestObject('Object Repository/ModificarUsuario/i_Modify_fa fa-save'))

WebUI.click(findTestObject('Object Repository/ModificarUsuario/button_Search'))

WebUI.click(findTestObject('Object Repository/ModificarUsuario/i_enable_fa fa-edit'))

WebUI.click(findTestObject('Object Repository/ModificarUsuario/div_First NameLast NameUser NameEmailRolAdm_17447e'))

WebUI.setEncryptedText(findTestObject('Object Repository/ModificarUsuario/input_Password_form-control ng-untouched ng_337005'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/ModificarUsuario/button_Modify'))

WebUI.click(findTestObject('Object Repository/ModificarUsuario/button_Search'))

WebUI.click(findTestObject('Object Repository/ModificarUsuario/a_Alejandro Lopez'))

WebUI.click(findTestObject('Object Repository/ModificarUsuario/a_Cerrar Sesin'))

WebUI.closeBrowser()

