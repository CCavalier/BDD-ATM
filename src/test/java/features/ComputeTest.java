package features;

import org.junit.Assert;

import com.cavalier.atm.back.Compute;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ComputeTest {
	public int numberOne;
	public int numberTwo;
	public int result;
	
	@Given("^two simple numbers (\\d+) and (\\d+)$")
	public void two_simple_numbers_and(int numberOne, int numberTwo){
	    this.numberOne = numberOne;
	    this.numberTwo = numberTwo;
	}

	@When("^I add them$")
	public void i_add_them() {
	   result= Compute.add(numberOne, numberTwo);
	}

	@Then("^the result is (\\d+)$")
	public void the_result_is(int resultExpected){
	    Assert.assertEquals(resultExpected, result);
	}

}
