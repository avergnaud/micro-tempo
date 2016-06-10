package com.catamania.sparkjava;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import com.catamania.feignclient.WorkLogsClient;
import com.catamania.feignclient.WorklogsService;
import com.catamania.model.in.Worklogs;
import com.catamania.model.out.Link;
import com.catamania.model.out.TempsSaisi;

import spark.Request;
import spark.Response;

/**
 * Implémentation du service qui retourne le temps saisi pour une personne
 * @author ubuntu
 *
 */
public class UserByName {
	
	public static TempsSaisi handleGet(Request request, Response response) {
		
		response.type("application/json");
		
		String username = request.params(":name");
		
		List<Link> links = Arrays.asList(new Link("self",request.url()));
		
		WorklogsService service = WorkLogsClient.getInstance().getService();
		Worklogs logs = service.getLogs(LocalDate.now().toString(),LocalDate.now().toString());
		
		if(logs.getWorklog() == null || username == null) {
			return new TempsSaisi(links,"",new BigDecimal("0"));
		}
		
		BigDecimal total = logs.getWorklog().stream()
				.filter(w -> username.equals(w.getUsername()))
				.reduce(BigDecimal.ZERO, 
						(bigDecimal, wl) -> bigDecimal.add(new BigDecimal(wl.getHours())),
						BigDecimal::add);
		
		return new TempsSaisi(links,username, total);
	}
}
