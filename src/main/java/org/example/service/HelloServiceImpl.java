package org.example.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

	@Override
	public void testService() {
		System.out.println("Servicio de prueba bean");

	}

}
