package com.example.signup.config;

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
                        .title("Signup page ")
                        .description("Signup Page for finance tracker")
                        .version("1.0"));
    }
}
