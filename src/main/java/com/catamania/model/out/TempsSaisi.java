package com.catamania.model.out;

import java.math.BigDecimal;
import java.util.List;

/**
 * Temps saisi du jour pour une personne
 * @author ubuntu
 *
 */
public class TempsSaisi {
	
	private List<Link> links;
	
	String username;
	
	BigDecimal heures;

	public TempsSaisi(List<Link> links, String username, BigDecimal heures) {
		super();
		this.links = links;
		this.username = username;
		this.heures = heures;
	}
}
