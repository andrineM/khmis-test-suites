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

WebUI.navigateToUrl('http://192.168.1.211:7000/openmrs/login.htm')

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

WebUI.setText(findTestObject('Registration_Form/Surname'), 'Tian')

WebUI.setText(findTestObject('Registration_Form/FirstName'), 'Tian')

WebUI.setText(findTestObject('Registration_Form/OtherNames'), 'Tian')

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

WebUI.setText(findTestObject('Registration_Form/PostalAdress'), '4444 Nairobi')

WebUI.setText(findTestObject('Registration_Form/EmailAdress'), 'tian.tian@gmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/RegistrationForm/Page_KenyaEMR/select_County'), 'Nairobi', true)

WebUI.setText(findTestObject('Registration_Form/SubCounty'), 'Kitengela')

WebUI.setText(findTestObject('Registration_Form/Ward'), 'Kitengela')

WebUI.setText(findTestObject('Registration_Form/Location'), 'Kitengela')

WebUI.setText(findTestObject('Registration_Form/SubLocation'), 'Kitengela')

WebUI.setText(findTestObject('Registration_Form/Village'), 'Kitengela')

WebUI.setText(findTestObject('Registration_Form/Landmark'), 'Kitengela School')

WebUI.setText(findTestObject('Registration_Form/NearestHealthCenter'), 'Kitengela Hospital')

WebUI.setText(findTestObject('Registration_Form/NextOfKinName'), 'Mary Tian')

WebUI.selectOptionByValue(findTestObject('Object Repository/RegistrationForm/Page_KenyaEMR/select_Partner'), 'Sibling', 
    true)

WebUI.click(findTestObject('Object Repository/RegistrationForm/Page_KenyaEMR/td_Phone Number'))

WebUI.setText(findTestObject('Registration_Form/NextOfKinPhoneNumber'), '0700345678')

WebUI.setText(findTestObject('Registration_Form/NextOfKinPostalAddress'), '444 Nairobi')

WebUI.delay(3)

WebUI.click(findTestObject('Registration_Form/CreatPatientButton'))

WebUI.delay(10)

WebUI.click(findTestObject('Page_KenyaEMR/button_Enroll (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Patient Type_w10 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_TB Clinic_w12 (1)'))

WebUI.setText(findTestObject('Page_KenyaEMR/input_Unique Patient Number (UPN)_w15 (1)'), '1406389774')

WebUI.click(findTestObject('Page_KenyaEMR/input_This facility_default-facility (1)'))

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_WHO Stage1WHO Stage2WHO Stage3WHO Stage4 (1)'), '1204', true)

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w37 (1)'))

WebUI.setText(findTestObject('Page_KenyaEMR/input_Postal Addrress_w87 (1)'), 'Mary Tian')

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_GrandparentSiblingGuardianParentSpousePartnerOther (1)'), 
    '1527', true)

WebUI.setText(findTestObject('Page_KenyaEMR/input_Postal Addrress_w91 (1)'), '0723456712')

WebUI.setText(findTestObject('Page_KenyaEMR/input_Postal Addrress_w93 (1)'), '4444 Nairobi')

WebUI.click(findTestObject('Page_KenyaEMR/input_Postal Addrress_submitButton (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Check in for visit (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Submit (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/b_Triage (1)'))

WebUI.setText(findTestObject('Page_KenyaEMR/textarea_Reason for visit_w8 (1)'), 'New client')

WebUI.setText(findTestObject('Page_KenyaEMR/input_C_w10 (1)'), '33')

WebUI.setText(findTestObject('Page_KenyaEMR/input_Pulse Rate_w12 (1)'), '14')

WebUI.setText(findTestObject('Page_KenyaEMR/input_mmHg_w14 (1)'), '150')

WebUI.setText(findTestObject('Page_KenyaEMR/input_mmHg_w16 (1)'), '60')

WebUI.setText(findTestObject('Page_KenyaEMR/input_Respiratory Rate_w18 (1)'), '32')

WebUI.setText(findTestObject('Page_KenyaEMR/input_Oxygen Saturation_w20 (1)'), '34')

WebUI.setText(findTestObject('Page_KenyaEMR/input_kg_w22 (1)'), '49')

WebUI.setText(findTestObject('Page_KenyaEMR/input_cm_w24 (1)'), '156')

WebUI.click(findTestObject('Page_KenyaEMR/a_Prev (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/a_7 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_LMP_submitButton (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/a_Home (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/img (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/img_1 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/div_Start (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/a_9 (1)'))

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_SelectTDF3TCNVPTDF3TCEFV (1)'), '164505AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA', 
    true)

WebUI.click(findTestObject('Page_KenyaEMR/button_Save (1)'))

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_000102030405060 (3)'), '10', true)

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_000102030405060'), '36', true)

WebUI.click(findTestObject('Page_KenyaEMR/button_Save (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/img_2 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/b_Gender Based Violence Screening (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w8 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w10 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w12 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w14 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/td_YesNo (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w16 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_No_submitButton (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/b_Alcohol and Drug Abuse Screening (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_CAGE-AID SCREENING FOR ALCOHOL (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Never_w8 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_CAGE-AID SCREENING FOR ALCOHOL (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Monthly or less_w10 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/label_Current light tobacco smoker (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Monthly or less_w10 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Unknown if ever smoked_w12 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Monthly or less_submitButton (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/b_Enhanced Adherence Screening (1)'))

WebUI.setText(findTestObject('Page_KenyaEMR/input_Session Number_w8 (1)'), '1')

WebUI.click(findTestObject('Page_KenyaEMR/a_9 (1)'))

WebUI.setText(findTestObject('Page_KenyaEMR/input_Pill count adherence  (from pill count)_w12 (1)'), '0')

WebUI.click(findTestObject('Page_KenyaEMR/input_YesNo_question-1 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_YesNo_question-2 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_YesNo_question-3 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_YesNo_question-4 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w16 (1)'))

WebUI.setText(findTestObject('Page_KenyaEMR/textarea_Unsuppressed_w24 (1)'), 'Take blood sample for viral load test')

WebUI.click(findTestObject('Page_KenyaEMR/span_Next (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/a_11 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Follow up Date_submitButton (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/b_HIV Green Card (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w8 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_No_w10 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/a_Next (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_General Population_w34 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_People who inject drugs_w38 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/a_Next (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Patient having complaint(s) today_w44 (1)'))

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_Abdominal pain (1)'), '143129', true)

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_Abdominal pain (1)'), '119537', true)

WebUI.setText(findTestObject('Page_KenyaEMR/input_Onset Date_w48 (1)'), '21')

WebUI.click(findTestObject('Page_KenyaEMR/span_Prev (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/fieldset_Complaints and History of complaint (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/span_Prev (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/a_16 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/fieldset_Complaints and History of complaint (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w78 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w80 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w82 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w84 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w86 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w88 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w90 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w120 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w122 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w124 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w126 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Start IPT (1)'))

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_Select indication (1)'), '138571', true)

WebUI.click(findTestObject('Page_KenyaEMR/span_Confirm IPT Initiation (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Patient has any known allergie(s)_w128 (1)'))

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_BeefCaffeineChocolate (1)'), '162538', true)

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_drug (1)'), '117399', true)

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_MildModerateSevereFatalUnknown (1)'), '160755', true)

WebUI.click(findTestObject('Page_KenyaEMR/span_Prev (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/a_23 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Patient has any chronic illnesse(s)_w170 (1)'))

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_Alzheimers Disease (1)'), '153754', true)

WebUI.click(findTestObject('Page_KenyaEMR/input_Patient has any known allergie(s)_w128 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Patient has any known allergie(s)_w128 (1)'))

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_BeefCaffeineChocolate (1)'), '162171', true)

WebUI.click(findTestObject('Page_KenyaEMR/td_BeefCaffeineChocolateDairy (1)'))

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_drug (1)'), '148888', true)

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_MildModerateSevereFatalUnknown (1)'), '160755', true)

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_19091910191119121 (1)'), '2009', true)

WebUI.click(findTestObject('Page_KenyaEMR/fieldset_Chronic Illnesses and Cormobidities (1)'))

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_19091910191119121 (1)'), '2002', true)

WebUI.click(findTestObject('Page_KenyaEMR/a_2 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/a_22 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Patient has adverse drug reaction(s)_w192 (1)'))

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_AbicavirACE inhibitorsAllopurinol (5)'), '103727', true)

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_AbicavirACE inhibitorsAllopurinol'), '103727', true)

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_AbicavirACE inhibitorsAllopurinol'), '', true)

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_Unknown (1)'), '120148', true)

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_MildModerateSevereFatalUnknown_1 (1)'), '1499', true)

WebUI.click(findTestObject('Page_KenyaEMR/span_Prev (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/a_2 (1)'))

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_CONTINUE REGIMEN (1)'), '1257', true)

WebUI.click(findTestObject('Page_KenyaEMR/td_CONTINUE REGIMEN (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Has patient ever had menses_w252 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/span_Prev (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/a_7 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w258 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w260 (1)'))

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_On Family Planning (1)'), '965', true)

WebUI.click(findTestObject('Page_KenyaEMR/label_Implant (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/a_Next (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_General Examination Findings_w304 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Finding(s) on systems review_w328 (1)'))

WebUI.setText(findTestObject('Page_KenyaEMR/input_Treatment Plan_w362 (1)'), 'malaria')

WebUI.click(findTestObject('Page_KenyaEMR/a_MALARIA (1)'))

WebUI.setText(findTestObject('Page_KenyaEMR/input_Treatment Plan_w362 (1)'), 'MALARIA')

WebUI.setText(findTestObject('Page_KenyaEMR/textarea_Treatment Plan_w364 (1)'), 'paracitamol')

WebUI.click(findTestObject('Page_KenyaEMR/a_Next (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Prophylaxis used_w382 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Adherence_w384 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Dispensed_w386 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/label_No (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w396 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w398 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w400 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/label_Not Done (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/label_Not Done (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/a_Next_1 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/a_11 (1)'))

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_Follow up (1)'), '160523', true)

WebUI.click(findTestObject('Page_KenyaEMR/td_Pregnant (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Is the patient stable_w408 (1)'))

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_standardCare (1)'), '164942', true)

WebUI.click(findTestObject('Page_KenyaEMR/a_Submit (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/div_Hyperimmune (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/a_Submit (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/a_Previous (1)'))

WebUI.setText(findTestObject('Page_KenyaEMR/textarea_Treatment Plan_w364 (1)'), '')

WebUI.click(findTestObject('Page_KenyaEMR/a_Previous (1)'))

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_Jan (1)'), '1', true)

WebUI.click(findTestObject('Page_KenyaEMR/a_5 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/a_Next (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/a_Next (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/a_Submit (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/a_Drug Orders (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/div_Standard Regimen Order (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Refill (1)'))

WebUI.setText(findTestObject('Page_KenyaEMR/input_Units_ng-valid ng-dirty (1)'), '30')

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_BagBoxCartridgeDose pack (1)'), '1513AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA', 
    true)

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_BagBoxCartridgeDose pack (1)'), '1513AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA', 
    true)

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_BagBoxCartridgeDose pack (1)'), '1513AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA', 
    true)

WebUI.click(findTestObject('Page_KenyaEMR/div_drug (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Order Regimen (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Dispense (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/div_Standard Regimen Order (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/div_Other Drug Orders (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/div_Past Drug Orders (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/div_Other Drug Orders (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/a_9 (1)'))

WebUI.setText(findTestObject('Page_KenyaEMR/input_New order for_sel-drug8015input (1)'), 'ctx')

WebUI.click(findTestObject('Page_KenyaEMR/a_Sulfamethoxazole 800 MG  Trimethoprim 160 MG Oral (1)'))

WebUI.setText(findTestObject('Page_KenyaEMR/input_Instructions_ng-valid-number n (1)'), '1')

WebUI.setText(findTestObject('Page_KenyaEMR/input_Instructions_sel-concept9667input (1)'), 't')

WebUI.click(findTestObject('Page_KenyaEMR/strong_T (1)'))

WebUI.setText(findTestObject('Page_KenyaEMR/input_Instructions_sel-freq7774input (1)'), 'o')

WebUI.click(findTestObject('Page_KenyaEMR/a_Once daily (1)'))

WebUI.setText(findTestObject('Page_KenyaEMR/input_Instructions_sel-concept6960input (1)'), 'o')

WebUI.click(findTestObject('Page_KenyaEMR/a_Oral (1)'))

WebUI.setText(findTestObject('Page_KenyaEMR/input_For_ng-valid ng-valid-number (1)'), '30')

WebUI.setText(findTestObject('Page_KenyaEMR/input_For_sel-concept795input (1)'), 'd')

WebUI.click(findTestObject('Page_KenyaEMR/a_Days (1)'))

WebUI.setText(findTestObject('Page_KenyaEMR/input_For outpatient orders_ng-valid-number (1)'), '30')

WebUI.setText(findTestObject('Page_KenyaEMR/input_For outpatient orders_sel-concept (1)'), 't')

WebUI.click(findTestObject('Page_KenyaEMR/a_Tablet (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Add (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Sign and Save (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/div_Past Drug Orders (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/div_Other Drug Orders (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/div_Standard Regimen Order (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/div_Active Orders (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Dispense (1)'))

WebUI.setText(findTestObject('Page_KenyaEMR/input_For_dc-reason ng-valid ng-dirty (1)'), 'CTX')

WebUI.click(findTestObject('Page_KenyaEMR/button_Sign and Save (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/img_3 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/a_Lab Orders (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/div_Create New Order(s) (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/div_Blood (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/button_HIV MONITORING (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/button_HIV MONITORING (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/input_HIV MONITORING_feature (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Confirm (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/button_ROUTINE_fa fa-calendar fa-1x (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/a_9 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/div_Enter Date Order was made (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/button_ROUTINE_fa fa-warning fa-1x (1)'))

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_Clinical treatment failure (1)'), '162080AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA', 
    true)

WebUI.click(findTestObject('Page_KenyaEMR/button_Save_1 (1)'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Save_2 (1)'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/div_Back to client home'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/h4_Active Lab Order(s)'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/h4_Active Lab Order(s)'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/button_Back to client home'))

WebUI.setText(findTestObject('Page_KenyaEMR/input_Username_uname (2)'), 'Admin')

WebUI.setEncryptedText(findTestObject('Page_KenyaEMR/input_Password_pw (2)'), '/5S6MFFLcE4mlsixtc6/Tg==')

WebUI.click(findTestObject('Page_KenyaEMR/button_Login (2)'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/button_Check out of visit'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/button_Submit_1'))

