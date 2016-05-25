package com.catamania.sparkjava;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.catamania.feignclient.WorkLogsClient;
import com.catamania.feignclient.WorklogsService;
import com.catamania.model.Worklogs;
import com.catamania.model.Worklogs.Worklog;

import spark.Request;
import spark.Response;

/**
 * Implémentation du service qui retourne tous les temps saisis
 * @author ubuntu
 *
 */
public class Route2 {

	public static Map<String, Double> handleGetRecap(Request request, Response response) {

		WorklogsService service = WorkLogsClient.getInstance().getService();
		Worklogs logs = service.getLogs(LocalDate.now().toString(), LocalDate.now().toString());

		if (logs.getWorklog() == null) {
			return new HashMap<>();
		}

		Stream<Worklog> temps = logs.getWorklog().stream();

		Map<String, Double> mm = temps
				.collect(
						Collectors.groupingBy(
								Worklog::getUsername, 
								Collectors.summingDouble(Worklog::getHours)));

		return mm;
	}

}
