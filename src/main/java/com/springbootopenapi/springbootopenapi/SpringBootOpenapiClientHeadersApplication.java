package com.springbootopenapi.springbootopenapi;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Spring boot OpenApi application", description = "This is an rest api ui for understanding",
        termsOfService = "nothing", license = @License(name = "openapi"), contact = @Contact(email = "sample@test.com"), version = "1.0.0"))
public class SpringBootOpenapiClientHeadersApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootOpenapiClientHeadersApplication.class, args);
    }


}
