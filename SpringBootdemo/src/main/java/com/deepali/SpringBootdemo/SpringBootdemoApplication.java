package com.deepali.SpringBootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
    FileStoragePojo.class
})
public class SpringBootdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootdemoApplication.class, args);
	}

}
