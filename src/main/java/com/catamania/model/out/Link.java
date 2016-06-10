package com.catamania.model.out;

/**
 * for HATEOAS-based responses
 * @author ubuntu
 *
 */
public class Link {
	private String rel;
	private String href;

	public Link(String rel, String href) {
		super();
		this.rel = rel;
		this.href = href;
	}
}
