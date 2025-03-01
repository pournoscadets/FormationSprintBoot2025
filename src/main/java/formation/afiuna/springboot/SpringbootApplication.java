package formation.afiuna.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import formation.afiuna.springboot.domain.entities.User;
import formation.afiuna.springboot.domain.repositories.UserRepository;

@SpringBootApplication
public class SpringbootApplication {
	
	@Autowired
	private UserRepository userRepository;
	
	@Bean
	public CommandLineRunner starter() {
			return args -> {
				userRepository.findAll().forEach(System.out::println);

				userRepository.save(User.builder()
				.username("admin"+Math.random())
				.build());	
			};
		
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

}
