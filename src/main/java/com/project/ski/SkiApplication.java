package com.project.ski;

import com.project.ski.entities.Skieur;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SkiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkiApplication.class, args);
		Skieur skieur = new Skieur("khalil","chettaoui",new Date(12,10,1995),"Berlin");
	}

}
