package gure.springframework.recipe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RecipeApplication {

    public static void main(String[] args) {

        SpringApplication.run(RecipeApplication.class, args);
        System.out.println("Checking if I can push");
    }
}
