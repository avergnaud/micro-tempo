package com.catamania.sparkjava;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.catamania.feignclient.WorkLogsClient;
import com.catamania.feignclient.WorklogsService;
import com.catamania.model.TempsSaisi;
import com.catamania.model.Worklogs;

import spark.Request;
import spark.Response;

/**
 * Implémentation du service qui retourne le temps saisi pour une personne
 * @author ubuntu
 *
 */
public class Route1 {
	
	public static TempsSaisi handleGetByName(Request request, Response response) {
		
		WorklogsService service = WorkLogsClient.getInstance().getService();
		Worklogs logs = service.getLogs(LocalDate.now().toString(),LocalDate.now().toString());
		
		if(logs.getWorklog() == null
				|| request.params(":name") == null) {
			return new TempsSaisi("",new BigDecimal("0"));
		}
		
		String username = request.params(":name");
		
		BigDecimal total = logs.getWorklog().stream()
				.filter(w -> username.equals(w.getUsername()))
				.reduce(BigDecimal.ZERO, 
						(bigDecimal, wl) -> bigDecimal.add(new BigDecimal(wl.getHours())),
						BigDecimal::add);
		
		return new TempsSaisi(username, total);
	}
}
