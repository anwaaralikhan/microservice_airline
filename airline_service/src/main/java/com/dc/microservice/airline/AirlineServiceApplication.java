package com.dc.microservice.airline;

import static springfox.documentation.builders.PathSelectors.any;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
//@EnableDiscoveryClient
public class AirlineServiceApplication {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
        		.groupName("Airline")
        		.select()
                .apis(RequestHandlerSelectors.basePackage("com.dc.microservice.airline"))
                .paths(any())
                .build()
                .apiInfo(
	                		new 
	                		ApiInfo(
	                				"Airline Services",
	                				"A set of services to provide data access to airlines", 
	                				"1.0.0", 
	                				null,
	                				new Contact("Anwaar", "https://twitter.com/fpmoles", null),
	                				null, 
	                				null, 
	                				null
	                				)
                		);
    }

    
	public static void main(String[] args) {
		SpringApplication.run(AirlineServiceApplication.class, args);
	}

}
