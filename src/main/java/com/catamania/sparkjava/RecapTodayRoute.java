package com.catamania.sparkjava;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.catamania.feignclient.WorkLogsClient;
import com.catamania.feignclient.WorklogsService;
import com.catamania.model.in.Worklogs;
import com.catamania.model.in.Worklogs.Worklog;
import com.catamania.model.out.Link;
import com.catamania.model.out.Recap;

import spark.Request;
import spark.Response;

/**
 * Implémentation du service qui retourne tous les temps saisis du jour
 * @author ubuntu
 *
 */
public class RecapTodayRoute {

	public static Recap handleGet(Request request, Response response) {

		response.type("application/json");
		
		List<Link> links = Arrays.asList(new Link("self",request.url()));
		
		WorklogsService service = WorkLogsClient.getInstance().getService();
		Worklogs logs = service.getLogs(LocalDate.now().toString(), LocalDate.now().toString());

		if (logs.getWorklog() == null) {
			return new Recap(links, new HashMap<>());
		}

		Stream<Worklog> temps = logs.getWorklog().stream();

		Map<String, Double> tempsParPersonne = temps
				.collect(
						Collectors.groupingBy(
								Worklog::getUsername, 
								Collectors.summingDouble(Worklog::getHours)));

		return new Recap(links, tempsParPersonne);
	}

}
