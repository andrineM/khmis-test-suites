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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser('')

WebUI.navigateToUrl('https://data.kenyahmis.org:8400/openmrs/login.htm')

WebUI.setText(findTestObject('Buttons/userName'), 'Admin')

WebUI.delay(3)

WebUI.setEncryptedText(findTestObject('Buttons/password'), '/5S6MFFLcE4mlsixtc6/Tg==')

WebUI.click(findTestObject('Buttons/loginButton'))

WebUI.click(findTestObject('Buttons/homeButton'))

WebUI.click(findTestObject('Buttons/Registrationbutton'))

WebUI.click(findTestObject('Buttons/findCreate'))

WebUI.click(findTestObject('Buttons/createNewPatient'))

WebUI.click(findTestObject('Buttons/newReg'))

WebUI.waitForElementClickable(findTestObject('Buttons/clinicNo'), 0)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Buttons/clinicNo'), '74000000')

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Buttons/idNo'), '74000000')

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Buttons/surName'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Buttons/surName'), 'Joseph')

WebUI.click(findTestObject('Buttons/firstName'))

WebUI.setText(findTestObject('Buttons/firstName'), 'Otis')

WebUI.click(findTestObject('Buttons/gender/femal'))

WebUI.click(findTestObject('Buttons/idNo'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('date/birthDate'))

WebUI.setText(findTestObject('date/birthDate'), '20-Feb-1990')

WebUI.click(findTestObject('date/birthDateDone'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('date/estimateAge'))

WebUI.click(findTestObject('date/fromAgeButton'))

WebUI.click(findTestObject('date/enterAge'))

WebUI.setText(findTestObject('date/enterAge'), '15')

WebUI.click(findTestObject('date/submitEstAge'))

WebUI.delay(2)

WebUI.click(findTestObject('maritalStatus/mainStatus'))

WebUI.click(findTestObject('maritalStatus/polygamous'))

WebUI.delay(2)

WebUI.click(findTestObject('Buttons/occup/Occupation'))

WebUI.click(findTestObject('Buttons/occup/farmer'))

WebUI.delay(2)

WebUI.click(findTestObject('education/education'))

WebUI.click(findTestObject('education/secondarySchool'))

WebUI.delay(2)

WebUI.click(findTestObject('Registration/Forms/Phone_Number'))

WebUI.setText(findTestObject('Registration/Forms/Phone_Number'), '0734567892')

WebUI.click(findTestObject('Registration/Forms/Alt_Phone_Num'))

WebUI.setText(findTestObject('Registration/Forms/Alt_Phone_Num'), '0734621568')

WebUI.click(findTestObject('Registration/Forms/Postal_Address'))

WebUI.setText(findTestObject('Registration/Forms/Postal_Address'), '4444 Kisumu')

WebUI.click(findTestObject('Registration/Forms/Email'))

WebUI.setText(findTestObject('Registration/Forms/Email'), 'val123@gmail.com')

WebUI.click(findTestObject('Registration/Forms/County'))

WebUI.click(findTestObject('Registration/Forms/County_Name'))

WebUI.click(findTestObject('Registration/Forms/Sub_county'))

WebUI.setText(findTestObject('Registration/Forms/Sub_county'), 'Kisumu')

WebUI.click(findTestObject('Registration/Forms/ward'))

WebUI.setText(findTestObject('Registration/Forms/ward'), 'kajulu')

WebUI.click(findTestObject('Registration/Forms/Location'))

WebUI.setText(findTestObject('Registration/Forms/Location'), 'kajulu')

WebUI.click(findTestObject('Registration/Forms/Sub_location'))

WebUI.setText(findTestObject('Registration/Forms/Sub_location'), 'kajulu')

WebUI.click(findTestObject('Registration/Forms/Village'))

WebUI.setText(findTestObject('Registration/Forms/Village'), 'kajulu')

WebUI.click(findTestObject('Registration/Forms/Landmark'))

WebUI.setText(findTestObject('Registration/Forms/Landmark'), 'kajulu school')

WebUI.click(findTestObject('Registration/Forms/Nearest_HC'))

WebUI.setText(findTestObject('Registration/Forms/Nearest_HC'), 'kajulu hospital')

WebUI.click(findTestObject('Registration/Forms/Next_Kin'))

WebUI.setText(findTestObject('Registration/Forms/Next_Kin'), 'katalon tester')

WebUI.click(findTestObject('Registration/Forms/Rlnship_kin'))

WebUI.click(findTestObject('Registration/Forms/Rlnship'))

WebUI.click(findTestObject('Registration/Forms/NextKin_Contact'))

WebUI.setText(findTestObject('Registration/Forms/NextKin_Contact'), '0763567145')

WebUI.click(findTestObject('Registration/Forms/NextKin_Address'))

WebUI.setText(findTestObject('Registration/Forms/NextKin_Address'), '4444 kisumu')

WebUI.click(findTestObject('Registration/Forms/SubmitRegistration'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Registration/Forms/CheckinButton'))

WebUI.click(findTestObject('Registration/Forms/SubmitCheckInButton'))

WebUI.click(findTestObject('Registration/Forms/Trige_Button'))

WebUI.click(findTestObject('Registration/Forms/TriageDate'))

WebUI.click(findTestObject('Registration/Forms/Reason_Visit'))

WebUI.setText(findTestObject('Registration/Forms/Reason_Visit'), 'New Client')

WebUI.setText(findTestObject('Registration/Forms/Temp'), '34')

WebUI.setText(findTestObject('Page_KenyaEMR/input_Pulse Rate_w12'), '120')

WebUI.setText(findTestObject('Page_KenyaEMR/input_mmHg_w14'), '160')

WebUI.setText(findTestObject('Page_KenyaEMR/input_mmHg_w16'), '150')

WebUI.setText(findTestObject('Page_KenyaEMR/input_Respiratory Rate_w18'), '45')

WebUI.setText(findTestObject('Page_KenyaEMR/input_Oxygen Saturation_w20'), '42')

WebUI.setText(findTestObject('Page_KenyaEMR/input_kg_w22'), '73')

WebUI.setText(findTestObject('Page_KenyaEMR/input_cm_w24'), '166')

WebUI.setText(findTestObject('Registration/Forms/Muac'), '34567')

WebUI.click(findTestObject('Registration/Forms/LMP_textbox'))

WebUI.setText(findTestObject('Registration/Forms/LMP_Date'), '5-02-2020', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Registration/Forms/triage_submit'))

WebUI.click(findTestObject('Registration/Forms/HTS_Initial_Button'))

WebUI.click(findTestObject('Registration/Forms/HTS_Date_field'))

WebUI.setText(findTestObject('Registration/Forms/HTS_Date'), '02-Mar-2020')

WebUI.delay(2)

WebUI.click(findTestObject('Registration/Forms/hts_field'))

WebUI.click(findTestObject('Registration/Forms/population_type'))

WebUI.delay(1)

WebUI.click(findTestObject('Registration/Forms/fisherfolks'))

WebUI.click(findTestObject('Registration/Forms/Disability_field'))

WebUI.click(findTestObject('Registration/Forms/disabilty_type'))

WebUI.click(findTestObject('Registration/Forms/hts_test_quiz'))

WebUI.setText(findTestObject('Registration/Forms/hts_test_duration'), '17')

WebUI.click(findTestObject('Registration/Forms/hts_self-test'))

WebUI.selectOptionByValue(findTestObject('Registration/Forms/hts_strategy'), '164163', true)

WebUI.selectOptionByValue(findTestObject('Registration/Forms/hts_entry'), '162050', true)

WebUI.click(findTestObject('Registration/Forms/hts_consent'))

WebUI.click(findTestObject('Registration/Forms/hts_tested_as'))

WebUI.selectOptionByValue(findTestObject('Registration/Forms/hts_kit_name'), '164960', true)

WebUI.setText(findTestObject('Registration/Forms/hts_kit_lotNum'), '6789')

WebUI.click(findTestObject('Registration/Forms/hts_kit_expiry_date'))

WebUI.setText(findTestObject('Registration/Forms/hts_kit_expiry_date'), '29-02-2020')

WebUI.selectOptionByValue(findTestObject('Registration/Forms/hts_result_1'), '703', true)

WebUI.setText(findTestObject('Registration/Forms/hts_lotNum_2'), '4567')

WebUI.click(findTestObject('Registration/Forms/hts_kit_expiry_date_2'))

WebUI.setText(findTestObject('Registration/Forms/hts_kit_expiry_date_2'), '29-02-2020')

WebUI.selectOptionByValue(findTestObject('Registration/Forms/hts_kit_name_2'), '164961', true)

WebUI.selectOptionByValue(findTestObject('Registration/Forms/hts_results_2'), '703', true)

WebUI.click(findTestObject('Registration/Forms/hts_tb_screening'))

WebUI.selectOptionByValue(findTestObject('Registration/Forms/hts-result_given'), '1065', true)

WebUI.setText(findTestObject('Registration/Forms/hts_remarks'), 'good')

WebUI.click(findTestObject('Registration/Forms/hts_submit_form'))

WebUI.delay(2)

WebUI.click(findTestObject('Registration/Forms/hts_Retest_button'))

WebUI.click(findTestObject('Registration/Forms/HTS_Date_field'))

WebUI.setText(findTestObject('Registration/Forms/HTS_Date'), '02-Mar-2020')

WebUI.delay(2)

WebUI.click(findTestObject('Registration/Forms/hts_field'))

WebUI.click(findTestObject('Registration/Forms/population_type'))

WebUI.delay(1)

WebUI.click(findTestObject('Registration/Forms/fisherfolks'))

WebUI.click(findTestObject('Registration/Forms/Disability_field'))

WebUI.click(findTestObject('Registration/Forms/disabilty_type'))

WebUI.click(findTestObject('Registration/Forms/hts_test_quiz'))

WebUI.setText(findTestObject('Registration/Forms/hts_test_duration'), '17')

WebUI.click(findTestObject('Registration/Forms/hts_self-test'))

WebUI.selectOptionByValue(findTestObject('Registration/Forms/hts_strategy'), '164163', true)

WebUI.selectOptionByValue(findTestObject('Registration/Forms/hts_entry'), '162050', true)

WebUI.click(findTestObject('Registration/Forms/hts_consent'))

WebUI.click(findTestObject('Registration/Forms/hts_tested_as'))

WebUI.selectOptionByValue(findTestObject('Registration/Forms/hts_kit_name'), '164960', true)

WebUI.setText(findTestObject('Registration/Forms/hts_kit_lotNum'), '6789')

WebUI.click(findTestObject('Registration/Forms/hts_kit_expiry_date'))

WebUI.setText(findTestObject('Registration/Forms/hts_kit_expiry_date'), '29-12-2020')

WebUI.selectOptionByValue(findTestObject('Registration/Forms/hts_result_1'), '703', true)

WebUI.selectOptionByValue(findTestObject('Registration/Forms/hts_kit_name_2'), '164961', true)

WebUI.setText(findTestObject('Registration/Forms/hts_lotNum_2'), '4567')

WebUI.click(findTestObject('Registration/Forms/hts_kit_expiry_date_2'))

WebUI.setText(findTestObject('Registration/Forms/hts_kit_expiry_date_2'), '29-12-2020')

WebUI.selectOptionByValue(findTestObject('Registration/Forms/hts_results_2'), '703', true)

WebUI.delay(1)

WebUI.click(findTestObject('Registration/Forms/hts_result_given_2'))

WebUI.click(findTestObject('Registration/Forms/resultgivenYes'))

WebUI.click(findTestObject('Registration/Forms/hts_tb_Screening_2'))

WebUI.setText(findTestObject('Registration/Forms/hts_remarks_2'), 'good')

WebUI.click(findTestObject('Registration/Forms/hts_submit_form'))

WebUI.delay(2)

WebUI.click(findTestObject('Registration/Forms/hts_linkage_button'))

WebUI.click(findTestObject('Page_KenyaEMR/input_This facility_default-facility'))

WebUI.setText(findTestObject('Registration/Forms/hts_linkage_CCC_number'), '1968617708')

WebUI.setText(findTestObject('Registration/Forms/hts_linkage_hcw_name'), 'Mary Kwamboka')

WebUI.click(findTestObject('Registration/Forms/hts_linkage_hcw_cadre'))

WebUI.selectOptionByValue(findTestObject('Registration/Forms/hts_linkage_hcw_cadre_select'), '1577', true)

WebUI.click(findTestObject('Registration/Forms/hts_enrollment_date_field'))

WebUI.setText(findTestObject('Registration/Forms/hts_linkage_date_enrolled_field'), '02-Mar-2020', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Registration/Forms/free_field_click'))

WebUI.click(findTestObject('Registration/Forms/hts_linkage_art_field_date'))

WebUI.setText(findTestObject('Registration/Forms/hts_linkage_art_date'), '02-Mar-2020', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Registration/Forms/hts_linkage_remark'), 'Enrolled')

WebUI.click(findTestObject('Registration/Forms/hts_linkage _submit-button'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Enroll'))

WebUI.setText(findTestObject('Registration/Forms/hiv_enrollment_date'), '02-Mar-2020', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Registration/Forms/hiv_free_click'))

WebUI.click(findTestObject('Registration/Forms/hiv_patient-type'))

WebUI.click(findTestObject('Registration/Forms/hiv-entry-point'))

WebUI.setText(findTestObject('Registration/Forms/hiv_enrollmrnt_number'), '1985892000')

WebUI.click(findTestObject('Registration/Forms/hiv_enrollment_who_stage_field'))

WebUI.click(findTestObject('Registration/Forms/hiv_enrollment_who_stage'))

WebUI.click(findTestObject('Registration/Forms/hiv_enrollment_in_school'))

WebUI.click(findTestObject('Registration/Forms/hiv_enrollement-orphan'))

WebUI.setText(findTestObject('Registration/Forms/hiv_enrollment_guardian_name'), 'Milka Wainaina')

WebUI.setText(findTestObject('Page_KenyaEMR/input_Postal Addrress_w91'), '44 Kisumu')

WebUI.setText(findTestObject('Page_KenyaEMR/input_Postal Addrress_w93'), '0721567890')

WebUI.click(findTestObject('Page_KenyaEMR/input_Postal Addrress_submitButton'))

WebUI.delay(2)

WebUI.click(findTestObject('Registration/Forms/home_button'))

WebUI.click(findTestObject('Registration/Forms/clinician_button'))

WebUI.click(findTestObject('Registration/Forms/hiv_arvs_start_button'))

WebUI.click(findTestObject('Registration/Forms/hiv_new_ regimen_start_button'))

WebUI.click(findTestObject('Registration/Forms/hiv_regimen_start_date_field'))

WebUI.setText(findTestObject('Registration/Forms/hiv_arvs_start_date'), '02-Mar-2020', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Registration/Forms/hive_arvs_start_date_done_button'))

WebUI.click(findTestObject('Registration/Forms/hiv_regimen_field'))

WebUI.click(findTestObject('Registration/Forms/hiv_regimen'))

WebUI.click(findTestObject('Registration/Forms/hiv_start_regimen_save_button'))

WebUI.click(findTestObject('Registration/Forms/back_button'))

WebUI.click(findTestObject('Registration/Forms/gender_based_violence_button'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w8'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w10'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w12'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w14'))

WebUI.click(findTestObject('Page_KenyaEMR/td_YesNo'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w16'))

WebUI.click(findTestObject('Page_KenyaEMR/input_No_submitButton'))

WebUI.click(findTestObject('Page_KenyaEMR/b_Alcohol and Drug Abuse Screening'))

WebUI.click(findTestObject('Registration/Forms/alcohol_drink'))

WebUI.click(findTestObject('Registration/Forms/smoking'))

WebUI.click(findTestObject('Registration/Forms/drug_usage'))

WebUI.click(findTestObject('Registration/Forms/Submit_alcohol_Screening'))

WebUI.click(findTestObject('Page_KenyaEMR/b_Enhanced Adherence Screening'))

WebUI.setText(findTestObject('Page_KenyaEMR/input_Session Number_w8'), '1')

WebUI.click(findTestObject('Registration/Forms/Adherance_date_first_session'))

WebUI.setText(findTestObject('Registration/Forms/Adherance_date_first_session'), '02-Mar-2020', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Registration/Forms/Adherance_pill_count'))

WebUI.setText(findTestObject('Registration/Forms/Adherance_pill_count'), '2')

WebUI.click(findTestObject('Page_KenyaEMR/input_YesNo_question-1'))

WebUI.click(findTestObject('Page_KenyaEMR/input_YesNo_question-2'))

WebUI.click(findTestObject('Page_KenyaEMR/input_YesNo_question-3'))

WebUI.click(findTestObject('Page_KenyaEMR/input_YesNo_question-4'))

WebUI.click(findTestObject('Page_KenyaEMR/input_YesNo_question-1'))

WebUI.click(findTestObject('Page_KenyaEMR/input_YesNo_question-2'))

WebUI.click(findTestObject('Page_KenyaEMR/input_YesNo_question-3'))

WebUI.click(findTestObject('Page_KenyaEMR/input_YesNo_question-4'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w16'))

WebUI.setText(findTestObject('Page_KenyaEMR/textarea_Unsuppressed_w24'), 'virall load sample  taken')

WebUI.click(findTestObject('Registration/Forms/Adherance_cognative_barriers'))

WebUI.setText(findTestObject('Registration/Forms/Adherance_cognative_barriers'), 'good')

WebUI.click(findTestObject('Registration/Forms/Adherance_Behavioural Barriers_01'))

WebUI.setText(findTestObject('Registration/Forms/Adherance_Behavioural Barriers_01'), 'good')

WebUI.click(findTestObject('Registration/Forms/Adherance_Behavioural Barriers_02'))

WebUI.setText(findTestObject('Registration/Forms/Adherance_Behavioural Barriers_02'), 'good')

WebUI.click(findTestObject('Registration/Forms/Adherance_Behavioural Barriers_03'))

WebUI.setText(findTestObject('Registration/Forms/Adherance_Behavioural Barriers_03'), 'good')

WebUI.click(findTestObject('Registration/Forms/Adherance_Behavioural Barriers_04'))

WebUI.setText(findTestObject('Registration/Forms/Adherance_Behavioural Barriers_04'), 'good')

WebUI.click(findTestObject('Registration/Forms/Adherance_Behavioural Barriers_05'))

WebUI.setText(findTestObject('Registration/Forms/Adherance_Behavioural Barriers_05'), 'good')

WebUI.click(findTestObject('Registration/Forms/Adherance_EmotionalBarriers_01'))

WebUI.setText(findTestObject('Registration/Forms/Adherance_EmotionalBarriers_01'), 'good')

WebUI.click(findTestObject('Registration/Forms/Adherance_EmotionalBarriers_02'))

WebUI.setText(findTestObject('Registration/Forms/Adherance_EmotionalBarriers_02'), 'good')

WebUI.click(findTestObject('Registration/Forms/Adherance_Socio-Economic Barriers_01'))

WebUI.click(findTestObject('Registration/Forms/Adherance_Socio-Economic Barriers_02'))

WebUI.setText(findTestObject('Registration/Forms/Adherance_Socio-Economic Barriers_02'), 'good')

WebUI.click(findTestObject('Registration/Forms/Adherance_Socio-Economic Barriers_03'))

WebUI.setText(findTestObject('Registration/Forms/Adherance_Socio-Economic Barriers_03'), 'good')

WebUI.click(findTestObject('Registration/Forms/Adherance_Socio-Economic Barriers_04'))

WebUI.click(findTestObject('Registration/Forms/Adherance_Socio-Economic Barriers_05'))

WebUI.click(findTestObject('Registration/Forms/Adherance_Socio-Economic Barriers_06'))

WebUI.click(findTestObject('Registration/Forms/Adherance_Socio-Economic Barriers_07'))

WebUI.click(findTestObject('Registration/Forms/Adherance_Socio-Economic Barriers_08'))

WebUI.click(findTestObject('Registration/Forms/Adherance_Referrals_and_Networks_01'))

WebUI.click(findTestObject('Registration/Forms/Adherance_Referrals_and_Networks_02'))

WebUI.click(findTestObject('Registration/Forms/Adherance_Referrals_and_Networks_03'))

WebUI.setText(findTestObject('Registration/Forms/Adherance_Referrals_and_Networks_03'), 'good')

WebUI.click(findTestObject('Registration/Forms/Adherance_Referrals_and_Networks_04'))

WebUI.click(findTestObject('Registration/Forms/Adherance_Referrals_and_Networks_05'))

WebUI.setText(findTestObject('Registration/Forms/Adherance_Referrals_and_Networks_05'), 'good')

WebUI.click(findTestObject('Registration/Forms/Adherance_Followup_Date'))

WebUI.setText(findTestObject('Registration/Forms/Adherance_Followup_Date'), '28-Mar-2020', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Registration/Forms/Adherance_Form_Submit'))

WebUI.click(findTestObject('Page_KenyaEMR/b_HIV Green Card'))

WebUI.click(findTestObject('Page_KenyaEMR/input_No_w10'))

WebUI.click(findTestObject('Page_KenyaEMR/input_General Population_w34'))

WebUI.click(findTestObject('Page_KenyaEMR/input_General Population_w34'))

WebUI.click(findTestObject('Page_KenyaEMR/input_People who inject drugs_w38'))

WebUI.click(findTestObject('Page_KenyaEMR/a_Next'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w8'))

WebUI.click(findTestObject('Page_KenyaEMR/a_Next'))

WebUI.click(findTestObject('Page_KenyaEMR/input_People who inject drugs_w38'))

WebUI.click(findTestObject('Page_KenyaEMR/input_General Population_w34'))

WebUI.click(findTestObject('Page_KenyaEMR/input_General Population_w34'))

WebUI.click(findTestObject('Page_KenyaEMR/input_General Population_w34'))

WebUI.click(findTestObject('Page_KenyaEMR/input_People who inject drugs_w38'))

WebUI.click(findTestObject('Registration/Forms/GreenCard_Child_WHO'))

WebUI.click(findTestObject('Registration/Forms/green-card-next'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Patient having complaint(s) today_w44'))

WebUI.click(findTestObject('Registration/Forms/green-card-complains'))

WebUI.click(findTestObject('Registration/Forms/pain-duration'))

WebUI.setText(findTestObject('Registration/Forms/pain-duration'), '1')

WebUI.click(findTestObject('Registration/Forms/complain-date'))

WebUI.setText(findTestObject('Registration/Forms/complain-date'), '02-Mar-2020')

WebUI.click(findTestObject('Registration/Forms/complaints_notes'))

WebUI.setText(findTestObject('Registration/Forms/complaints_notes'), 'given  drugs')

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w78'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w78'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w80'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w78'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w82'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w84'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w88'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w90'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w120'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w124'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w126'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Start IPT'))

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_Select indication                                        HIV Positive                                        In prison                                        Child exposed to tuberculosis'), 
    '138571', true)

WebUI.click(findTestObject('Page_KenyaEMR/span_Confirm IPT Initiation'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w128'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w170'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Patient has any known allergie(s)_w128'))

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_BeefCaffeineChocolateDairy FoodEggsFishMilk ProteinPeanutsShellfishSoyStrawberriesWheatAdhesive TapeBee StingsDustLatexMoldPollenRagweedOther'), 
    '162176', true)

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_UnknownAnaemiaAnaphylaxisAngioedemaArrhythmiaBronchospasmCoughDiarrheaDystoniaFeverFlushingGI upsetHeadacheHepatotoxicityHivesHypertensionItchingMental status changeMusculoskeletal painMyalgiaRashOther'), 
    '142412', true)

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_MildModerateSevereFatalUnknown'), '160755', true)

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_191019111912191319141915191619171918191919201921192219231924192519261927192819291930193119321933193419351936193719381939194019411942194319441945194619471948194919501951195219531954195519561957195819591960196119621'), 
    '2019', true)

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_191019111912191319141915191619171918191919201921192219231924192519261927192819291930193119321933193419351936193719381939194019411942194319441945194619471948194919501951195219531954195519561957195819591960196119621'), 
    '2018', true)

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_JanFebMarAprMayJunJulAugSepOctNovDec'), '9', true)

WebUI.click(findTestObject('Page_KenyaEMR/a_9'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Patient has any chronic illnesse(s)_w170'))

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_Alzheimers Disease and other DementiasArthritisAsthmaCancerCardiovascular diseasesChronic HepatitisChronic Kidney DiseaseChronic Obstructive Pulmonary Disease(COPD)Chronic Renal FailureCystic FibrosisDeafness and '), 
    '148432', true)

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_191019111912191319141915191619171918191919201921192219231924192519261927192819291930193119321933193419351936193719381939194019411942194319441945194619471948194919501951195219531954195519561957195819591960196119621'), 
    '2018', true)

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_JanFebMarAprMayJunJulAugSepOctNovDec'), '8', true)

WebUI.click(findTestObject('Page_KenyaEMR/a_11'))

WebUI.click(findTestObject('Page_KenyaEMR/span_YesNo_2'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Patient has adverse drug reaction(s)_w192'))

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_AbicavirACE inhibitorsAllopurinolAminoglycosidesARBs (angiotensin II receptor blockers)AspirinAtazanavirCarbamazepineCephalosporinsChloroquineCodeineDidanosineEfavirenzErythromycinsEthambutolGriseofulvinHeparinsHy'), 
    '103727', true)

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_UnknownAnaemiaAnaphylaxisAngioedemaArrhythmiaBronchospasmCoughDiarrheaDystoniaFeverFlushingGI upsetHeadacheHepatotoxicityHivesHypertensionItchingMental status changeMusculoskeletal painMyalgiaRashOther_1'), 
    '140238', true)

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_MildModerateSevereFatalUnknown_1'), '1499', true)

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_MildModerateSevereFatalUnknown_2'), '1500', true)

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_191019111912191319141915191619171918191919201921192219231924192519261927192819291930193119321933193419351936193719381939194019411942194319441945194619471948194919501951195219531954195519561957195819591960196119621'), 
    '2018', true)

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_JanFebMarAprMayJunJulAugSepOctNovDec'), '6', true)

WebUI.click(findTestObject('Page_KenyaEMR/a_30'))

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_CONTINUE REGIMENSWITCHED REGIMENCHANGED DOSESUBSTITUTED DRUGNONESTOPOTHER'), 
    '1257', true)

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_CONTINUE REGIMENSWITCHED REGIMENCHANGED DOSESUBSTITUTED DRUGNONESTOPOTHER'), 
    '1107', true)

WebUI.click(findTestObject('Page_KenyaEMR/input_Vaccination_w244'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w252'))

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_On Family PlanningNot using Family PlanningWants Family Planning'), 
    '965', true)

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_On Family PlanningNot using Family PlanningWants Family Planning'), 
    '160652', true)

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_On Family PlanningNot using Family PlanningWants Family Planning'), 
    '965', true)

WebUI.click(findTestObject('Page_KenyaEMR/input_Injectible_w282'))

WebUI.click(findTestObject('Page_KenyaEMR/a_Next'))

WebUI.click(findTestObject('Page_KenyaEMR/div_None                                     Jaundice                                     Oedema                                     Oral thrush                                     Pallor'))

WebUI.click(findTestObject('Page_KenyaEMR/input_General Examination Findings_w304'))

WebUI.setText(findTestObject('Page_KenyaEMR/input_Treatment Plan_w362'), 'malari')

WebUI.click(findTestObject('Page_KenyaEMR/a_Quartan Malaria'))

WebUI.setText(findTestObject('Page_KenyaEMR/input_Treatment Plan_w362'), 'Quartan Malaria')

WebUI.click(findTestObject('Page_KenyaEMR/td'))

WebUI.setText(findTestObject('Page_KenyaEMR/textarea_Treatment Plan_w364'), 'give drugs')

WebUI.click(findTestObject('Page_KenyaEMR/a_Next'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Finding(s) on systems review_w328'))

WebUI.click(findTestObject('Page_KenyaEMR/a_Next'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Prophylaxis used_w382'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Adherence_w384'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Dispensed_w386'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Adherence Assessment'))

WebUI.click(findTestObject('Page_KenyaEMR/input_close_question-1'))

WebUI.click(findTestObject('Page_KenyaEMR/input_close_question-2'))

WebUI.click(findTestObject('Page_KenyaEMR/input_close_question-4'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Save_1'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Unkown_w394'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Unkown_w396'))

WebUI.click(findTestObject('Page_KenyaEMR/td_YesNoUnkownNA'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Negative_w402'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Is the patient stable_w408'))

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_191019111912191319141915191619171918191919201921192219231924192519261927192819291930193119321933193419351936193719381939194019411942194319441945194619471948194919501951195219531954195519561957195819591960196119621'), 
    '2019', true)

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_JanFebMarAprMayJunJulAugSepOctNovDec'), '1', true)

WebUI.click(findTestObject('Page_KenyaEMR/a_4'))

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_Follow upLab testsCounselingPharmacy RefillOther'), '160523', 
    true)

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_Standard CareFast TrackCommunity ART Distribution - HCW LedCommunity ART Distribution - Peer LedFacility ART Distribution Group'), 
    '164942', true)

WebUI.click(findTestObject('Page_KenyaEMR/a_Submit'))

WebUI.click(findTestObject('Page_KenyaEMR/b_TB Screening'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w8'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w10'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w12'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w14'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w42'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w44'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w46'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w48'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Adherence Measurement_submitButton'))

WebUI.click(findTestObject('Page_KenyaEMR/a_Drug Orders'))

WebUI.click(findTestObject('Page_KenyaEMR/div_Standard Regimen Order'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Refill'))

WebUI.setText(findTestObject('Page_KenyaEMR/input_Units_ng-valid ng-dirty'), '30')

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_BagBoxCartridgeDose packEachInhalerKitPacketsAmpule(s)ApplicationBarCanCapsuleContainerDropEnemaFluid ounceGallonGramGumInchInternational unitsKilogramLiterLozengeMilliequivalentMetric dropMicrogramMilligramMillil'), 
    '1513AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA', true)

WebUI.setText(findTestObject('Page_KenyaEMR/input_Units_ng-valid ng-dirty'), '30')

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_BagBoxCartridgeDose packEachInhalerKitPacketsAmpule(s)ApplicationBarCanCapsuleContainerDropEnemaFluid ounceGallonGramGumInchInternational unitsKilogramLiterLozengeMilliequivalentMetric dropMicrogramMilligramMillil'), 
    '1513AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA', true)

WebUI.setText(findTestObject('Page_KenyaEMR/input_Units_ng-valid ng-dirty'), '30')

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_BagBoxCartridgeDose packEachInhalerKitPacketsAmpule(s)ApplicationBarCanCapsuleContainerDropEnemaFluid ounceGallonGramGumInchInternational unitsKilogramLiterLozengeMilliequivalentMetric dropMicrogramMilligramMillil'), 
    '1513AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA', true)

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_BagBoxCartridgeDose packEachInhalerKitPacketsAmpule(s)ApplicationBarCanCapsuleContainerDropEnemaFluid ounceGallonGramGumInchInternational unitsKilogramLiterLozengeMilliequivalentMetric dropMicrogramMilligramMillil'), 
    '162378AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA', true)

WebUI.setText(findTestObject('Page_KenyaEMR/textarea_Units_ng-valid ng-dirty'), 'take on a specific time')

WebUI.click(findTestObject('Page_KenyaEMR/button_Order Regimen'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Dispense'))

WebUI.click(findTestObject('Page_KenyaEMR/div_Other Drug Orders'))

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_190019011902190319041905190619071908190919101911191219131914191519161917191819191920192119221923192419251926192719281929193019311932193319341935193619371938193919401941194219431944194519461947194819491950195119521'), 
    '2019', true)

WebUI.click(findTestObject('Page_KenyaEMR/a_2'))

WebUI.setText(findTestObject('Page_KenyaEMR/input_New order for_sel-drug6972input'), 'ctx')

WebUI.click(findTestObject('Page_KenyaEMR/a_Sulfamethoxazole 800 MG  Trimethoprim 160 MG Oral'))

WebUI.setText(findTestObject('Page_KenyaEMR/input_Instructions_ng-valid-number ng-valid-min ng-dirty ng-valid ng-valid-required'), 
    '30')

WebUI.setText(findTestObject('Page_KenyaEMR/input_Instructions_sel-concept4071input'), 't')

WebUI.click(findTestObject('Page_KenyaEMR/a_Tablet'))

WebUI.setText(findTestObject('Page_KenyaEMR/input_Instructions_sel-freq1396input'), 'o')

WebUI.click(findTestObject('Page_KenyaEMR/a_Once daily'))

WebUI.setText(findTestObject('Page_KenyaEMR/input_Instructions_sel-concept2125input'), 'o')

WebUI.click(findTestObject('Page_KenyaEMR/a_Oral'))

WebUI.setText(findTestObject('Page_KenyaEMR/input_For_ng-valid ng-valid-number ng-valid-min ng-dirty'), '1')

WebUI.setText(findTestObject('Page_KenyaEMR/input_For_sel-concept6701input'), 'm')

WebUI.click(findTestObject('Page_KenyaEMR/a_Months'))

WebUI.setText(findTestObject('Page_KenyaEMR/input_For outpatient orders_ng-valid-number ng-valid-min ng-dirty ng-valid ng-valid-required'), 
    '30')

WebUI.setText(findTestObject('Page_KenyaEMR/input_For outpatient orders_sel-concept4911input'), 'm')

WebUI.click(findTestObject('Page_KenyaEMR/a_Milligram'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Add'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Sign and Save'))

WebUI.click(findTestObject('Page_KenyaEMR/img_2'))

WebUI.click(findTestObject('Page_KenyaEMR/a_Lab Orders'))

WebUI.click(findTestObject('Page_KenyaEMR/div_Create New Order(s)'))

WebUI.click(findTestObject('Page_KenyaEMR/div_Blood'))

WebUI.click(findTestObject('Page_KenyaEMR/button_HIV MONITORING'))

WebUI.click(findTestObject('Page_KenyaEMR/input_HIV MONITORING_feature'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Confirm'))

WebUI.click(findTestObject('Page_KenyaEMR/button_ROUTINE_fa fa-calendar fa-1x'))

WebUI.click(findTestObject('Page_KenyaEMR/span_Prev'))

WebUI.click(findTestObject('Page_KenyaEMR/span_Prev'))

WebUI.click(findTestObject('Page_KenyaEMR/span_Prev'))

WebUI.click(findTestObject('Page_KenyaEMR/span_Prev'))

WebUI.click(findTestObject('Page_KenyaEMR/span_Prev'))

WebUI.click(findTestObject('Page_KenyaEMR/span_Prev'))

WebUI.click(findTestObject('Page_KenyaEMR/span_Prev'))

WebUI.click(findTestObject('Page_KenyaEMR/span_Prev'))

WebUI.click(findTestObject('Page_KenyaEMR/span_Next'))

WebUI.click(findTestObject('Page_KenyaEMR/span_Next'))

WebUI.click(findTestObject('Page_KenyaEMR/span_Next'))

WebUI.click(findTestObject('Page_KenyaEMR/a_2'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Save_2'))

WebUI.click(findTestObject('Page_KenyaEMR/button_ROUTINE_fa fa-warning fa-1x'))

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_Clinical treatment failurePregnancyBaselineFollow upSingle Drug SubstitutionBreastfeedingClinical failureRoutine'), 
    '162080AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA', true)

WebUI.click(findTestObject('Page_KenyaEMR/button_Save_3'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Save_4'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Back to client home'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Check out of visit'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Cancel'))

WebUI.click(findTestObject('Page_KenyaEMR/button_FamilyPartner List'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Add Contact'))

WebUI.click(findTestObject('Page_KenyaEMR/input_FemaleMale_sex'))

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_Married Monogamous                                                Married Polygamous                                                Divorced                                                Widowed                  '), 
    '5555', true)

WebUI.setText(findTestObject('Page_KenyaEMR/input_First Name_firstName'), 'Moses')

WebUI.setText(findTestObject('Page_KenyaEMR/input_Middle Name_middleName'), 'tester')

WebUI.setText(findTestObject('Page_KenyaEMR/input_Last Name_lastName'), 'Katalon')

WebUI.setText(findTestObject('Page_KenyaEMR/input_Physical AddressLandmark_physicalAddress'), 'home')

WebUI.setText(findTestObject('Page_KenyaEMR/input_Phone No_phoneContact'), '074567821')

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_Father                                                        Co-wife                                                        Mother                                                        Injectable drug user      '), 
    '5617', true)

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_No                                                        Yes                                                        Declined to Answer'), 
    '1065', true)

WebUI.click(findTestObject('Page_KenyaEMR/span_Yes                         No'))

WebUI.click(findTestObject('Page_KenyaEMR/input_YesNo_physicalAssault'))

WebUI.click(findTestObject('Page_KenyaEMR/input_YesNo_threatened'))

WebUI.click(findTestObject('Page_KenyaEMR/input_YesNo_sexualAssault'))

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_True                                                        False'), 
    'True', true)

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_Unknown                                                                                    Positive                                                                                    Negative                      '), 
    'Unknown', true)

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_190019011902190319041905190619071908190919101911191219131914191519161917191819191920192119221923192419251926192719281929193019311932193319341935193619371938193919401941194219431944194519461947194819491950195119521'), 
    '2019', true)

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_JanFebMarAprMayJunJulAugSepOctNovDec'), '1', true)

WebUI.click(findTestObject('Page_KenyaEMR/a_4'))

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_Dual referral                                                        Provider referral                                                        Passive referral                                                       '), 
    '163096', true)

WebUI.click(findTestObject('Page_KenyaEMR/button_Save Patient Contact'))

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_190019011902190319041905190619071908190919101911191219131914191519161917191819191920192119221923192419251926192719281929193019311932193319341935193619371938193919401941194219431944194519461947194819491950195119521'), 
    '2020', true)

WebUI.click(findTestObject('Page_KenyaEMR/a_4'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Save Patient Contact'))

WebUI.click(findTestObject('Page_KenyaEMR/button_from age'))

WebUI.setText(findTestObject('Page_KenyaEMR/input_Age in years_age_1'), '4')

WebUI.setText(findTestObject('Page_KenyaEMR/input_Age in years_age_2'), '41')

WebUI.setText(findTestObject('Page_KenyaEMR/input_Age in years_age_3'), '41')

WebUI.click(findTestObject('Page_KenyaEMR/button_Submit_2'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Save Patient Contact'))

WebUI.click(findTestObject('Page_KenyaEMR/span_View Tree'))

WebUI.click(findTestObject('Page_KenyaEMR/img_3'))

WebUI.click(findTestObject('Page_KenyaEMR/img_4'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Check out of visit_1'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Submit_3'))

