package stepDefinition

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

public class Login {
	@Given("User open URL tinggal.id")
	public void user_open_URL_tinggal_id() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl('https://tinggal.id/')
	}

	@When("User click account")
	public void user_click_account() {
		WebUI.click(findTestObject('Login/btn_account'))
	}

	@When("User choose and click button masuk")
	public void user_choose_and_click_button_masuk() {
		WebUI.click(findTestObject('Login/button_Masuk'))
	}

	@When("User input value of email with {string}")
	public void user_input_value_of_email_with(String email) {
		WebUI.setText(findTestObject('Login/input_Email'), email)
	}

	@When("User input value of password with {string}")
	public void user_input_value_of_password_with(String password) {
		WebUI.setText(findTestObject('Login/input_Password'), password)
	}

	@When("User click button masuk")
	public void user_click_button_masuk() {
		WebUI.click(findTestObject('Login/button_Masuk2'))
	}

	@Then("User successfully login")
	public void user_successfully_login() {
		WebUI.verifyElementVisible(findTestObject('Home/btn_home'))
	}
}
