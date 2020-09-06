package net.isogen.factorio.blueprintcatalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class BlueprintCatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlueprintCatalogApplication.class, args);
	}

}
