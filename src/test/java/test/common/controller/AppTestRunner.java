package test.common.controller;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        glue = {"test.common.controller"})
public class AppTestRunner {
	
	public AppTestRunner(){
		System.out.println(" ***************** \n CUCUMBER \n **************");
	}
}