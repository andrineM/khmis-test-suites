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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://142.93.44.68:8080/openmrs')

WebUI.click(findTestObject('LoginButtons/userName'))

WebUI.setText(findTestObject('LoginButtons/userName'), 'Admin')

WebUI.click(findTestObject('LoginButtons/password'))

WebUI.setEncryptedText(findTestObject('LoginButtons/password'), '/5S6MFFLcE4mlsixtc6/Tg==')

WebUI.click(findTestObject('LoginButtons/LoginButton'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Home/homeButton'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Home/Registrationbutton'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Home/FindCreatButton'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Home/CreatNewButton'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Home/RegisterNewButton'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Registration_Form/PatientClinicNumber'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Registration_Form/PatientClinicNumber'), '20190033')

WebUI.click(findTestObject('Registration_Form/IDNumber'))

WebUI.setText(findTestObject('Registration_Form/IDNumber'), '36779845')

WebUI.setText(findTestObject('Registration_Form/Surname'), 'Ben')

WebUI.setText(findTestObject('Registration_Form/FirstName'), 'Ben')

WebUI.setText(findTestObject('Registration_Form/OtherNames'), 'Benato')

WebUI.click(findTestObject('Registration_Form/GenderM'))

WebUI.click(findTestObject('Dates/BirthDate'))

WebUI.setText(findTestObject('Dates/BirthDate'), '12-Sep-1994')

WebUI.click(findTestObject('Dates/DoneDateButton'))

WebUI.click(findTestObject('Registration_Form/MaritalStatus/MaritalStatusTextField'))

WebUI.click(findTestObject('Registration_Form/MaritalStatus/Single'))

WebUI.click(findTestObject('Registration_Form/MaritalStatus/OccupationTextField'))

WebUI.click(findTestObject('Registration_Form/MaritalStatus/Student'))

WebUI.click(findTestObject('Registration_Form/MaritalStatus/EducationTextField'))

WebUI.click(findTestObject('Registration_Form/MaritalStatus/University'))

WebUI.setText(findTestObject('Registration_Form/TelephoneNumber'), '0723456789')

WebUI.setText(findTestObject('Registration_Form/AlternativePhoneNumber'), '0712345678')

WebUI.setText(findTestObject('Registration_Form/PostalAdress'), '44 Kisumu')

WebUI.setText(findTestObject('Registration_Form/EmailAdress'), 'benben@gmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/RegistrationForm/Page_KenyaEMR/select_County'), 'Kisumu', true)

WebUI.setText(findTestObject('Registration_Form/SubCounty'), 'Ahero')

WebUI.setText(findTestObject('Registration_Form/Ward'), 'Ahero')

WebUI.setText(findTestObject('Registration_Form/Location'), 'Ahero')

WebUI.setText(findTestObject('Registration_Form/SubLocation'), 'Ahero')

WebUI.setText(findTestObject('Registration_Form/Village'), 'Ahero')

WebUI.setText(findTestObject('Registration_Form/Landmark'), 'Ahero Primary')

WebUI.setText(findTestObject('Registration_Form/NearestHealthCenter'), 'Ahero HC')

WebUI.setText(findTestObject('Registration_Form/NextOfKinName'), 'Milka Benato')

WebUI.selectOptionByValue(findTestObject('Object Repository/RegistrationForm/Page_KenyaEMR/select_Partner'), 'Sibling', 
    true)

WebUI.click(findTestObject('Object Repository/RegistrationForm/Page_KenyaEMR/td_Phone Number'))

WebUI.setText(findTestObject('Registration_Form/NextOfKinPhoneNumber'), '0700345678')

WebUI.setText(findTestObject('Registration_Form/NextOfKinPostalAddress'), '345 Ahero ')

WebUI.click(findTestObject('Object Repository/RegistrationForm/Page_KenyaEMR/button_Create Patient'))

WebUI.navigateToUrl('http://142.93.44.68:8080/openmrs/kenyaemr/userHome.page?')

