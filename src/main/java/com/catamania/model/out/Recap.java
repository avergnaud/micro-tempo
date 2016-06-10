package com.catamania.model.out;

import java.util.List;
import java.util.Map;

/**
 * Les temps saisis pour tout le monde
 * @author ubuntu
 *
 */
public class Recap {
	
	private List<Link> links;
	
	Map<String, Double> tempsParPersonne;

	public Recap(List<Link> links, Map<String, Double> tempsParPersonne) {
		super();
		this.links = links;
		this.tempsParPersonne = tempsParPersonne;
	}
}
