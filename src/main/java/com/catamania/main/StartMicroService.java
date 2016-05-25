package com.catamania.main;

import static spark.Spark.get;

import com.catamania.sparkjava.Route1;
import com.catamania.sparkjava.Route2;
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
	
		get("/today/byUserName/:name", Route1::handleGetByName, gson::toJson);/* http://localhost:4567/today/byUserName/a.vergnaud@cat-amania.com */

		get("/today/recap", Route2::handleGetRecap, gson::toJson);
		
		get("/hello", (req, res) -> "Hello World");/* http://localhost:4567/hello */
	}

}
