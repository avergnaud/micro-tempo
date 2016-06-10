package com.catamania.main;

import static spark.Spark.get;

import com.catamania.sparkjava.APIRoute;
import com.catamania.sparkjava.RecapTodayRoute;
import com.catamania.sparkjava.RecapWeekRoute;
import com.catamania.sparkjava.UserByName;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Main class pour le micro-service
 * sparkjava
 * @author ubuntu
 *
 */
public class StartMicroService {

	public static void main(String[] args) {

		Gson gson = new GsonBuilder()
				.setPrettyPrinting()
				.create();

		/*get("/hello", (req, res) -> "Hello World"); http://localhost:4567/hello */
		
		get("/api", APIRoute::handleGet, gson::toJson);
		
		get("/api/recap/today", RecapTodayRoute::handleGet, gson::toJson);
		
		get("/api/recap/week", RecapWeekRoute::handleGet, gson::toJson);
		
		get("/api/users/:name", UserByName::handleGet, gson::toJson);

	}
}
