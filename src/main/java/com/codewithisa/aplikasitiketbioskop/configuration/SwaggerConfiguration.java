package com.codewithisa.aplikasitiketbioskop.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {

    @Bean
    public OpenAPI demoApi(@Value("Aplikasi untuk memesan tiket bioskop secara online") String appDescription,
                           @Value("v1.0.0") String appVersion) {
        return new OpenAPI()
                .info(new Info()
                        .title("Aplikasi Tiket Bioskop")
                        .version(appVersion)
                        .description(appDescription)
                        .termsOfService("http://swagger.io/terms")
                        .license(new License()
                                .name("Apache 2.0")
                                .url("http://springdoc.org")));
    }
}
