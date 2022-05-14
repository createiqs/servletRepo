package com.createiq.thread.enu.demo;

public enum Cakes {

	// choclate, butterscotch, pinapple

	CHOCLATECAKE("chocklaate cake"), BUTTERSCOTCH("butter scoth cake"), PINAPPLE("pinapple cake");

	private String cakeNames;

	private Cakes(String cakeNames) {
		this.cakeNames = cakeNames;
	}

	public String getCakeNames() {
		return cakeNames;
	}
	
	

}
