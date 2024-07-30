package NaveenBDDStep;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegitrationDefinition {

	
	@Given("User is on Registration Form")
	public void user_is_on_registration_form() {
		System.out.println("User on Registration Page");
	    
	}

	@When("User Enter Following details")
	public void user_enter_following_details(DataTable dataTable) {
	  List<List<String>> regList=dataTable.asLists();
	  for(List<String> e : regList)
	  {
		  System.out.println(e);
	  }
	}

	@Then("Registration Successful")
	public void registration_successful() {
		System.out.println("Registration Successful");
	    
	}

	
	@When("user enter the followings data with columns")
	public void user_enter_the_followings_data_with_columns(DataTable dataTable) {
	    List<Map<String,String>> userlist=dataTable.asMaps(String.class,String.class);
	    System.out.println(userlist);
		System.out.println(userlist.get(0).get("Firstname"));
		
	}



}
