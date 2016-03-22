package com.cavalier.atm.back;

import java.util.HashMap;
import java.util.Map;

public class Atm {
	
	private Map<Integer, Integer> soldeBillet = new HashMap<Integer, Integer>();

	public Map<Integer, Integer> getSoldeBillet() {
		return soldeBillet;
	}

	public void setSoldeBillet(Map<Integer, Integer> soldeBillet) {
		this.soldeBillet = soldeBillet;
	}

	public int withdraw(int montant) {
		// oter 1 a l'entree de map comportant la coupure 'montant'
		this.soldeBillet.replace(montant, this.soldeBillet.get(montant)-1);
		return montant;
	}

}
