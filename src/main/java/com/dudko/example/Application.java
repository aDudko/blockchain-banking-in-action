package com.dudko.example;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
        info = @Info(
                title = "Blockchain Banking",
                description = "Example of blockchain technology on simple banking transactions",
                version = "v3.2.5",
                contact = @Contact(
                        name = "Dudko Anatol",
                        email = "anatoly_dudko@icloud.com"
                )
        )
)
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
