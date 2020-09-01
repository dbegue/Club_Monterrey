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

WebUI.navigateToUrl('https://ccmweb.softok2.mx/')

WebUI.getAttribute(findTestObject('Page_Club Campestre Monterrey/a_Accesos'), '')

WebUI.click(findTestObject('Page_Club Campestre Monterrey/a_Accesos'))

WebUI.setText(findTestObject('Object Repository/Page_Club Campestre Monterrey/input_Nmero de socio_form-control'), '912504')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Club Campestre Monterrey/input_Contrasea_form-control'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_Club Campestre Monterrey/button_Aceptar'))

WebUI.click(findTestObject('Object Repository/Page_Club Campestre Monterrey/a_Mis reservas'))

WebUI.click(findTestObject('Object Repository/Page_Club Campestre Monterrey/span_Registrar Invitado'))

WebUI.setText(findTestObject('Object Repository/Page_Club Campestre Monterrey/input_Agregar invitados_form-control'), 'Daniela González')

WebUI.setText(findTestObject('Object Repository/Page_Club Campestre Monterrey/input_Agregar invitados_form-control_1'), 
    'dbegue92@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Club Campestre Monterrey/input_Agregar invitados_form-control_1_2'), 
    '+5355013556')

WebUI.click(findTestObject('Object Repository/Page_Club Campestre Monterrey/button_Aceptar_1'))

