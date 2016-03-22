package features;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

import com.cavalier.atm.back.Atm;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AccountSteps {
	
	
	private Atm distributeur = new Atm();
	
	private Map<Integer, Integer>  previous ;
	
	private int retrait;

	@Given("^le distributeur possede au moins (\\d+) billet de (\\d+)$")
	public void le_distributeur_possede_au_moins_billet_de(int solde, int coupure) throws Throwable {
	    distributeur.getSoldeBillet().put(coupure, solde+1);
	    previous = new HashMap<Integer,Integer>(distributeur.getSoldeBillet());
	}

	@When("^je demande (\\d+)$")
	public void je_demande(int montant) throws Throwable {
		retrait=distributeur.withdraw(montant);
	}

	@Then("^le distributeur me donne (\\d+)$")
	public void le_distributeur_me_donne(int montantRetire) throws Throwable {
		Assert.assertEquals(montantRetire, retrait);
	}

	@Then("^le solde de billets de (\\d+) a diminue de (\\d+)$")
	public void le_solde_de_billets_de_a_diminue_de(int coupure, int diminution) throws Throwable {
		Assert.assertEquals(previous.get(coupure)-diminution, distributeur.getSoldeBillet().get(coupure).intValue());
	}	
}
