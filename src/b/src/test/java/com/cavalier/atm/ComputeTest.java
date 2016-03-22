package com.cavalier.atm;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import com.cavalier.atm.back.Compute;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ComputeTest {
	public int numberOne;
	public int numberTwo;
	public List<Integer> numberList = new ArrayList<Integer>();
	public int result;
	
	@Given("^two simple numbers (\\d+) and (\\d+)$")
	public void two_simple_numbers_and(int numberOne, int numberTwo){
	    numberList.add(new Integer(numberOne));
	    numberList.add(new Integer(numberTwo));
	}

	@When("^I add them$")
	public void i_add_them() {
	   result= Compute.add(numberList);
	}
	
	@Given("^the following numbers:$")
	public void the_following_numbers(DataTable argumentTable) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		numberList = argumentTable.asList(Integer.class);
	}

	@Then("^the result is (\\d+)$")
	public void the_result_is(int resultExpected){
	    Assert.assertEquals(resultExpected, result);
	}

}
