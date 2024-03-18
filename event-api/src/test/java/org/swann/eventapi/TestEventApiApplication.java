package org.swann.eventapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestEventApiApplication {

	public static void main(String[] args) {
		SpringApplication.from(EventApiApplication::main).with(TestEventApiApplication.class).run(args);
	}

}
