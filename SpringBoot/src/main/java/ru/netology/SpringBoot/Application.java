package ru.netology.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import ru.netology.SpringBoot.configure.JavaConfig;

@SpringBootApplication
public class 	Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
