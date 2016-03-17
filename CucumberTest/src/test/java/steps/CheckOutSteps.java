package steps;

import static org.junit.Assert.assertEquals;

import java.util.Hashtable;
import java.util.Map;

import com.test.view.Checkout;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckOutSteps {

	Map<String, Integer> itemsPrice;
	Checkout checkout;
	
	@Before
	public void init()
	{
		itemsPrice = new Hashtable<>();
		checkout = new Checkout();
	}
	
	@Given("^The price of a \"(.*?)\" is (\\d+)c$")
	public void thePriceOfAIsC(String name, int price) throws Throwable {
	     itemsPrice.put(name, price);
	}	

	@When("^I checkout (\\d+) \"(.*?)\"$")
	public void iCheckout(int itemCount, String itemName) throws Throwable {
	    int itemPrice = (int) itemsPrice.get(itemName);
	    checkout.add(itemCount, itemPrice);
	}

	@Then("^The total price should be (\\d+)c$")
	public void theTotalPriceShouldBeC(int totalPrice) throws Throwable {
	    assertEquals(totalPrice, checkout.total());
	}

}
