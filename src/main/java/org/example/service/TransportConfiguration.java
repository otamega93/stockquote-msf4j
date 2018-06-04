package org.example.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.wso2.msf4j.spring.transport.HTTPTransportConfig;

import com.google.gson.Gson;

@Configuration
public class TransportConfiguration {

	@Bean
	public HTTPTransportConfig http() {

		HTTPTransportConfig http = new HTTPTransportConfig();
		http.setHost("localhost");
		http.setPort(9090);
		return http;
	}
	
	@Bean
	public Gson gson() {
		return new Gson();
	}

}