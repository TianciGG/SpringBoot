package chauncy.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages="chauncy.controller")
public class APP {
	public static void main(String[] args) {
		SpringApplication.run(APP.class, args);
	}
}
