package formation.afiuna.springboot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {
    
      @Bean
  public OpenAPI springShopOpenAPI() {
      return new OpenAPI()
              .info(new Info().title("A transfert API")
              .description("A transfert app")
              .version("v0.0.1")
              .license(new License().name("Apache 2.0").url("http://github.com")))
              .externalDocs(new ExternalDocumentation()
              .description("A transfert Wiki Documentation")
              .url("https://springshop.wiki.github.org/docs"));
  }


}
