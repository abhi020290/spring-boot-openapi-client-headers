package com.springbootopenapi.springbootopenapi.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(new Info())
                .components(new Components()
                        .addSecuritySchemes("client-name", new SecurityScheme()
                                .type(SecurityScheme.Type.APIKEY)
                                .in(SecurityScheme.In.HEADER)
                                .name("X-CLIENT"))
                        .addSecuritySchemes("client-id", new SecurityScheme()
                                .type(SecurityScheme.Type.APIKEY)
                                .in(SecurityScheme.In.HEADER)
                                .name("X-CLIENT-ID"))
                        .addSecuritySchemes("client-secret", new SecurityScheme()
                                .type(SecurityScheme.Type.APIKEY)
                                .in(SecurityScheme.In.HEADER)
                                .name("X-CLIENT-SECRET")))
                .addSecurityItem(new SecurityRequirement().addList("client-name"))
                .addSecurityItem(new SecurityRequirement().addList("client-id"))
                .addSecurityItem(new SecurityRequirement().addList("client-secret"));
    }
}
