package com.catamania.model;

import java.math.BigDecimal;

/**
 * Temps saisi du jour pour une personne
 * @author ubuntu
 *
 */
public class TempsSaisi {
	
	String username;
	
	BigDecimal heures;

	public TempsSaisi(String username, BigDecimal heures) {
		this.username = username;
		this.heures = heures;
	}

	

}
