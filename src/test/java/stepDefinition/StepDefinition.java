package stepDefinition;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import orangeBASE.Base4ORANGE;

public class StepDefinition extends Base4ORANGE {



	@Given("User launches Chrome browser")
	public void user_launches_chrome_browser() {
		getBrowser("chrome");
		getUrl("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("User enter valid <username> and <password>")
	public void user_enter_valid_username_and_password() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}

	@Then("User clicks login")
	public void user_clicks_login() {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Given("User hover over leave and")
	public void user_hover_over_leave_and() {
		Actions move= new Actions(driver);
		move.moveToElement(driver.findElement(By.id("menu_leave_viewLeaveModule"))).perform();
	}

	@When("User hover over  enttitlements")
	public void user_hover_over_enttitlements() {
		Actions hover= new Actions(driver);	
		hover.moveToElement(driver.findElement(By.id("menu_leave_Entitlements"))).perform();
	}

	@Then("User clicks my entitlements")
	public void user_clicks_my_entitlements() {
		driver.findElement(By.id("menu_leave_viewMyLeaveEntitlements")).click();
		Actions right= new Actions(driver);
		right.contextClick().perform();
	}

	@Given("User select leave type")
	public void user_select_leave_type_and() throws Throwable {
		click(driver.findElement(By.xpath("//select[@id='entitlements_leave_type']")));

		selectByvalue(driver.findElement(By.xpath("//select[@id='entitlements_leave_type']")), "2");
		String text= driver.findElement(By.xpath("//select[@id='entitlements_leave_type']")).getText();
		System.out.println(text);
		Actions right= new Actions(driver);
		right.contextClick().perform();

	}

	@Given("User selects leave period")
	public void user_selects_leave_period() throws Throwable {
		click(driver.findElement(By.xpath("//select[@id='period']")));

		selectByvisible(driver.findElement(By.xpath("//select[@id='period']")), "01-01-2022 - 31-12-2022");

		String text= driver.findElement(By.id("resultTable")).getText();
		System.out.println(text);

	}

	@Then("User clicks search")
	public void user_clicks_search() throws Throwable {
		click(driver.findElement(By.id("searchBtn")));
		Actions right= new Actions(driver);
		right.contextClick().perform();

	}

	@Given("User clicks add and iputs employee name")
	public void user_types_employee_name() throws Throwable {
		click(driver.findElement(By.id("btnAdd")));
		sendkey(driver.findElement(By.xpath("//input[@name='entitlements[employee][empName]']")), "Dominic Cha");
		Actions enter= new Actions(driver);
		enter.sendKeys(Keys.ENTER).perform();
		Actions right= new Actions(driver);
		right.contextClick().perform();


	}

	@Given("User selects leave type")
	public void user_selects_leave_type() {
		click(driver.findElement(By.id("entitlements_leave_type")));
		selectByvalue(driver.findElement(By.id("entitlements_leave_type")), "2");
		click(driver.findElement(By.xpath("//select[@id='period']")));

		selectByvisible(driver.findElement(By.xpath("//select[@id='period']")), "01-01-2022 - 31-12-2022");
	}

	@Given("User enters entitlement")

	public void user_enters_entitlement() throws Throwable {
		click(driver.findElement(By.xpath("//*[@id='entitlements_entitlement']']")));
		sendkey(driver.findElement(By.xpath("//*[@id='entitlements_entitlement']")), "4.00");
		Actions right= new Actions(driver);
		right.contextClick().perform();

	}

	@Then("User clicks save")
	public void user_clicks_save() {
		click(driver.findElement(By.id("btnSave")));
		click(driver.findElement(By.xpath("//input[@id='dialogUpdateEntitlementConfirmBtn']")));
		Actions right= new Actions(driver);
		right.contextClick().perform();
	}

	@Given("User selects entitlement")
	public void user_selects_entitlement() {
		click(driver.findElement(By.id("ohrmList_chkSelectAll")));
		Actions right= new Actions(driver);
		right.contextClick().perform();
	}

	@When("User clicks delete")
	public void user_clicks_delete() {
		click(driver.findElement(By.id("btnDelete")));
	}

	@Then("User clicks ok")
	public void user_clicks_ok() {
		click(driver.findElement(By.xpath("//input[@id='dialogDeleteBtn']")));
		Actions right= new Actions(driver);
		right.sendKeys(Keys.TAB).perform();
	}






}
