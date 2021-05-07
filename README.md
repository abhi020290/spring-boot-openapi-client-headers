# spring-boot-openapi
spring-boot-openapi

This is url for swagger api
https://localhost:9091/swagger-ui.html

https://localhost:9091/v3/api-docs

		<dependency>
			<groupId>org.springdoc</groupId>
			<artifactId>springdoc-openapi-ui</artifactId>
			<version>1.5.5</version>
		</dependency>

Below annotation is required

    @OpenAPIDefinition(info = @Info(title = "Sing boot OpenAPi application", description = "This is an rest api ui for understanding",
    termsOfService = "nothing", license = @License(name = "openapi"), contact = @Contact(email = "sample@test.com"), version = "1.0.0"))

Below Config is required for Authorize

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
