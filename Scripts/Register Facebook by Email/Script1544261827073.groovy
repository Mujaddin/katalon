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

'Given I already open browser'
WebUI.openBrowser('')

'When I input Facebook website'
WebUI.navigateToUrl('https://www.facebook.com')

'and input my firstname'
WebUI.setText(findTestObject('txt_nama_dpn'), firstname)

'and input my lastname'
WebUI.setText(findTestObject('txt_nama_blk'), lastname)

'and Input my Email'
WebUI.setText(findTestObject('txt_email_no_telp'), email)

WebUI.delay(3)

'and input same email in email validation'
WebUI.setText(findTestObject('txt_email_val'), email)

'and Input password that i like'
WebUI.setMaskedText(findTestObject('txt_password'), password)

'and Input my birthdate'
WebUI.selectOptionByValue(findTestObject('slt_day'), day, false)

WebUI.selectOptionByValue(findTestObject('slt_month'), month, false)

WebUI.selectOptionByValue(findTestObject('slt_year'), year, false)

'and Input my gender with L or P'
if (gender.toLowerCase() == 'l') {
    WebUI.click(findTestObject('chk_male'))
} else if (gender.toLowerCase() == 'p') {
    WebUI.click(findTestObject('chk_female'))
}

'and Click Register Button'
WebUI.click(findTestObject('btn-register'))

'Then I will be registered to facebook'
WebUI.verifyElementPresent(findTestObject('Home/homePage'), 0)

