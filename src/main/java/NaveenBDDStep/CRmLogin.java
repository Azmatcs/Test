package NaveenBDDStep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CRmLogin {

	WebDriver driver;
	
	@Given("User is in Login Page")
	public void user_is_in_login_page() {
		
		
		driver=new ChromeDriver();
		driver.get("https://freecrm.com/");		
	  
	}

	@When("Title of Login Page iS CRM")
	public void title_of_login_page_i_s_crm() {
	String Title=	driver.getTitle();
		System.out.println(Title);
		Assert.assertEquals(Title,"#1 Free CRM Software Power Up your Entire Business Free Forever");
	   
	}

	@Then("User Entered User name and Password")
	public void user_entered_user_name_and_password() {
		
		driver.findElement(By.xpath("(//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left'])[1]")).click();
		driver.findElement(By.name("email")).sendKeys("aliazmataly@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Azmat@100");
		
	   
	}
	
	@Then("user click on Login")
	public void user_click_on_login() {
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
	}
	
		
		
			
		@Then("User is on HomePage")
		public void user_is_on_home_page() {
			
			String tit=driver.getTitle();
			System.out.println(tit);
			Assert.assertEquals(tit,"Cogmento CRM");
		   
		}
	 
	}




