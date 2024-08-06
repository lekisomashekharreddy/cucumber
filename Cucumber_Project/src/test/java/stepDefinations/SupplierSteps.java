package stepDefinations;

import org.openqa.selenium.WebDriver;

import commonFunctions.FunctionLibrary;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SupplierSteps {
	WebDriver driver;
	@Given("Launch Browser")
	public void launch_browser() throws Throwable{
	   driver = FunctionLibrary.startBrowser();
	}

	@When("Launch Url {string}")
	public void launch_url(String url) {
	    FunctionLibrary.openUrl(url);
	}

	@When("wait for username with {string} and {string}")
	public void wait_for_username_with_and(String Loactor_Type, String Locator_Value) {
	   FunctionLibrary.waitForElement(Loactor_Type, Locator_Value, "10");
	}

	@When("Enter username with {string} and {string} and  {string}")
	public void enter_username_with_and_and(String Loactor_Type, String Locator_Value, String Test_Data) {
	   FunctionLibrary.typeAction(Loactor_Type, Locator_Value, Test_Data);
	}

	@When("Enter password with {string} and {string} and  {string}")
	public void enter_password_with_and_and(String Loactor_Type, String Locator_Value, String Test_Data) {
	    FunctionLibrary.typeAction(Loactor_Type, Locator_Value, Test_Data);
	}

	@When("click login button with {string} and {string}")
	public void click_login_button_with_and(String Loactor_Type, String Locator_Value) {
	    FunctionLibrary.clickAction(Loactor_Type, Locator_Value);
	}

	@When("wait for Supplierlink with {string} and {string}")
	public void wait_for_supplierlink_with_and(String Loactor_Type, String Locator_Value) {
	   FunctionLibrary.waitForElement(Loactor_Type, Locator_Value, "10");
	}

	@When("click Supplierlink with {string} and {string}")
	public void click_supplierlink_with_and(String Loactor_Type, String Locator_Value) {
	   FunctionLibrary.clickAction(Loactor_Type, Locator_Value);
	}

	@When("wait for Add+icon with {string} and {string}")
	public void wait_for_add_icon_with_and(String Loactor_Type, String Locator_Value) {
	  FunctionLibrary.waitForElement(Loactor_Type, Locator_Value, "10");
	}

	@When("click Add+icon with {string} and {string}")
	public void click_add_icon_with_and(String Loactor_Type, String Locator_Value) {
	   FunctionLibrary.clickAction(Loactor_Type, Locator_Value);
	}

	@When("wait for Suppliernumber with {string} and {string}")
	public void wait_for_suppliernumber_with_and(String Loactor_Type, String Locator_Value) {
		FunctionLibrary.waitForElement(Loactor_Type, Locator_Value, "10");
	 	}

	@When("capture Suppliernumber with {string} and {string}")
	public void capture_suppliernumber_with_and(String Loactor_Type, String Locator_Value)throws Throwable {
	   FunctionLibrary.capturesup(Loactor_Type, Locator_Value);
	}

	@When("Enter in {string} with {string} and {string}")
	public void enter_in_with_and(String Test_Data ,String Loactor_Type, String Locator_Value) {
	  FunctionLibrary.typeAction(Loactor_Type, Locator_Value, Test_Data);  
	}

	@When("click on Add button after adding notes with {string} and {string}")
	public void click_on_add_button_after_adding_notes_with_and(String Loactor_Type, String Locator_Value) {
	  FunctionLibrary.clickAction(Loactor_Type, Locator_Value); 
	}

	@When("wait for ok button with {string} and {string}")
	public void wait_for_ok_button_with_and(String Loactor_Type, String Locator_Value) {
	    FunctionLibrary.waitForElement(Loactor_Type, Locator_Value, "10");
	}

	@When("click ok button with {string} and {string}")
	public void click_ok_button_with_and(String Loactor_Type, String Locator_Value) {
	   FunctionLibrary.clickAction(Loactor_Type, Locator_Value);
	}

	@When("wait for Alert button with {string} and {string}")
	public void wait_for_alert_button_with_and(String Loactor_Type, String Locator_Value) {
	  FunctionLibrary.waitForElement(Loactor_Type, Locator_Value, "10");
	}

	@When("click Alert button with {string} and {string}")
	public void click_alert_button_with_and(String Loactor_Type, String Locator_Value) {
	  FunctionLibrary.clickAction(Loactor_Type, Locator_Value);
	}

	@Then("user validate SupplierTable")
	public void user_validate_supplier_table() throws Throwable{
	   FunctionLibrary.supplierTable();
	}

	@When("user closes the browser")
	public void user_closes_the_browser() {
	   FunctionLibrary.closeBrowser();
	}

}
