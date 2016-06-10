package com.catamania.sparkjava;

import java.util.Arrays;
import java.util.List;

import com.catamania.model.out.API;
import com.catamania.model.out.Link;

import spark.Request;
import spark.Response;

/**
 * Implémentation du service qui affiche l'API - point d'entrée
 * @author ubuntu
 *
 */
public class APIRoute {
	
	public static API handleGet(Request request, Response response) {
		
		response.type("application/json");
		
		List<Link> links = Arrays.asList(
				new Link("self",request.url()),
				new Link("recap_today_url","http://localhost:4567/api/recap/today"),
				new Link("recap_week_url","http://localhost:4567/api/recap/week"),
				new Link("user_url","http://localhost:4567/api/users/{name}"));
		
		return new API(links);
	}
}
