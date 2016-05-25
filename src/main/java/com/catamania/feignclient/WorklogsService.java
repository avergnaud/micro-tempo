package com.catamania.feignclient;

import com.catamania.model.Worklogs;

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
			+ "&tempoApiToken=")
	Worklogs getLogs(@Param("dateFrom") String dateFrom, @Param("dateTo") String dateTo);
}
