package com.StepDef;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.*;

public class S05Registration {
	@Given("Open Registration Page")
	public void open_registration_page() {
	    System.out.println("Open Registration Page");
	}

	@When("Pass the data as follows")
	public void pass_the_data_as_follows(io.cucumber.datatable.DataTable dataTable) {
	    List<List<String>>data = dataTable.asLists();
	    
	    for(List<String> l : data)
	    	System.out.println(l);
	}

	@Then("Registration should success")
	public void registration_should_success() {
	    System.out.println("Registration done!!!");
	}
	
	@When("Passing the data as follows")
	public void passing_the_data_as_follows(io.cucumber.datatable.DataTable dataTable) {
	    List<Map<String, String>>data = dataTable.asMaps();
	    for(Map<String, String> d : data)
	    	System.out.println(d);
	    
	    for(Map<String, String> d : data)
	    {
	    	System.out.println("First Name: " + d.get("FName"));
	    	System.out.println("Last Name : " + d.get("LName"));
	    	System.out.println("Address   : " + d.get("Address"));
	    	System.out.println("Mobile No : " + d.get("MNo"));
	    	System.out.println("EMail Id  : " + d.get("MailId"));
	    }
	}

	@Then("Registration is done")
	public void registration_is_done() {
	    System.out.println("Registration successful");
	}

}
