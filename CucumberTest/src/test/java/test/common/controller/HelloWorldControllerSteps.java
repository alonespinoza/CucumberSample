package test.common.controller;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import com.test.common.controller.HelloWorldController;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HelloWorldControllerSteps{
	
	 HelloWorldController hwController = new HelloWorldController();
	
	 @Given("The greeting message")
	 public void getGreetingMessage()
	 {
            System.out.format(hwController.getMessage() );
     };
	
	@When("The greeting message is called")
	public void callGreetingMessage()
	{
		hwController.getMessage();
	}
	
	@Then ("Check the message")
	public void checkMessage()
	{
		assertThat("hello world!!!!", equalTo(hwController.getMessage()));
	}
}
