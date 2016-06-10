package com.catamania.feignclient;

import com.catamania.model.in.Worklogs;

import feign.Param;
import feign.RequestLine;

/**
 * API JIRA TEMPO - FEIGN
 * @author ubuntu
 *
 */
public interface WorklogsService {
	
	@RequestLine("GET /tempo-getWorklog/"
			+ "?dateFrom={dateFrom}"/*2016-05-25*/
			+ "&dateTo={dateTo}"/*2016-05-25*/
			+ "&format=xml"
			+ "&diffOnly=false"
			+ "&tempoApiToken=72711f14-8af7-47b5-adbc-4a062b8a8996")
	Worklogs getLogs(@Param("dateFrom") String dateFrom, @Param("dateTo") String dateTo);
}
