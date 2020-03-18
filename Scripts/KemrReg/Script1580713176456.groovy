import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://data.kenyahmis.org:8400/openmrs/login.htm')

WebUI.setText(findTestObject('Buttons/userName'), 'Admin')

WebUI.setEncryptedText(findTestObject('Buttons/password'), '/5S6MFFLcE4mlsixtc6/Tg==')

WebUI.delay(3)

WebUI.click(findTestObject('Buttons/loginButton'))

WebUI.click(findTestObject('Buttons/homeButton'))

WebUI.click(findTestObject('Buttons/Registrationbutton'))

WebUI.click(findTestObject('Buttons/findCreate'))

WebUI.click(findTestObject('Buttons/createNewPatient'))

WebUI.click(findTestObject('Buttons/newReg'))

WebUI.waitForElementClickable(findTestObject('Buttons/clinicNo'), 0)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Buttons/clinicNo'), '342132321')

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Buttons/idNo'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Buttons/idNo'), '321231234')

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Buttons/surName'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Buttons/surName'), 'Joana')

WebUI.click(findTestObject('Buttons/firstName'))

WebUI.setText(findTestObject('Buttons/firstName'), 'Russio')

WebUI.click(findTestObject('Buttons/gender/femal'))

WebUI.click(findTestObject('date/birthDate'))

WebUI.setText(findTestObject('date/birthDate'), '20-Feb-2004')

WebUI.click(findTestObject('date/birthDateDone'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('date/estimateAge'))

WebUI.click(findTestObject('date/fromAgeButton'))

WebUI.click(findTestObject('date/enterAge'))

WebUI.setText(findTestObject('date/enterAge'), '15')

WebUI.click(findTestObject('date/submitEstAge'))

WebUI.delay(3)

WebUI.click(findTestObject('maritalStatus/mainStatus'))

WebUI.click(findTestObject('maritalStatus/polygamous'))

WebUI.delay(3)

WebUI.click(findTestObject('Buttons/occup/Occupation'))

WebUI.click(findTestObject('Buttons/occup/farmer'))

WebUI.delay(3)

WebUI.click(findTestObject('education/education'))

WebUI.click(findTestObject('education/secondarySchool'))

WebUI.delay(3)

WebUI.click(findTestObject('Buttons/submitRecord'))

WebUI.delay(10)

WebUI.closeBrowser()

