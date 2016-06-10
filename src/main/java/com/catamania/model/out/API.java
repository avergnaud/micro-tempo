package com.catamania.model.out;

import java.util.List;

/**
 * Point d'entrée de l'API REST
 * @author ubuntu
 *
 */
public class API {
	private List<Link> links;

	public API(List<Link> links) {
		super();
		this.links = links;
	}
}
