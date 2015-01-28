package com.google.gwt.sample.stockwatcher.server;

import com.google.gwt.sample.stockwatcher.client.GreetingService;
import com.google.gwt.sample.stockwatcher.shared.FieldVerifier;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * Comment goes here @@@@@@@@@@@@@@@@@@@@@@@
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements
		GreetingService {
	
	int a = 0;
	int b = -1;

	@Override
	public String greetServer(String name) throws IllegalArgumentException {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		return "";
	}

	public void printStuff(){
		;
	}
	
	public void doStuff(){
		a = 2;
	}
}
