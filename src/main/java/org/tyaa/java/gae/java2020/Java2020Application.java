package org.tyaa.java.gae.java2020;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({
    "org.tyaa.java.gae.java2020.controller"
})

public class Java2020Application {

	public static void main(String[] args) {
		SpringApplication.run(Java2020Application.class, args);
	}

}
