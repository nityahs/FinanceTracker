package com.example.api_gateway.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI bookingApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("API Gateway")
                        .description("API documentation for the Finance Tracker")
                        .version("1.0"));
    }
}
