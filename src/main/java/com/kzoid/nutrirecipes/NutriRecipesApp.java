package com.kzoid.nutrirecipes;

import com.kzoid.nutrirecipes.configuration.JpaConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages = {"com.kzoid.nutrirecipes"})
public class NutriRecipesApp {

    //-Dspring.profiles.active=local > H2
    //-Dspring.profiles.active=prod > MySql
    public static void main(String[] args) {
        SpringApplication.run(NutriRecipesApp.class, args);
    }
}
