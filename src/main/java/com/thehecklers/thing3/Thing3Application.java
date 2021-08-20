package com.thehecklers.thing3;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@SpringBootApplication
public class Thing3Application {

	public static void main(String[] args) {
		SpringApplication.run(Thing3Application.class, args);
	}

}

@Configuration
class Thing3Config {
	@Bean
	Consumer<Aircraft> logIt() {
		return ac -> System.out.println("🛩 " + ac);
	}
}

@Data
@AllArgsConstructor
class Aircraft {
	private String callsign, reg, flightno, type;
	private int altitude, heading, speed;
	private double lat, lon;
}