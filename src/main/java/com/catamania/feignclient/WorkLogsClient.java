package com.catamania.feignclient;

import feign.Feign;
import feign.jaxb.JAXBContextFactory;
import feign.jaxb.JAXBDecoder;

/**
 * Singleton a appeler pour appeler l'API JIRA TEMPO
 * @author ubuntu
 *
 */
public class WorkLogsClient {
	
	WorklogsService service;
	
	private WorkLogsClient() {
		
		JAXBContextFactory jaxbFactory = new JAXBContextFactory.Builder().build();
				
		service = Feign.builder()
			.decoder(new JAXBDecoder(jaxbFactory))
	        .target(WorklogsService.class, "http://jira.svc.cat-amania.com/plugins/servlet/");
	}
	
	private static WorkLogsClient INSTANCE = new WorkLogsClient();
	
	public static WorkLogsClient getInstance()
	{	return INSTANCE;
	}
	
	

	public WorklogsService getService() {
		return service;
	}

}
