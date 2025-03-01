package formation.afiuna.springboot;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import formation.afiuna.springboot.domain.repositories.UserRepository;

@SpringBootApplication
public class SpringbootApplication {
	
	@Autowired
	private UserRepository userRepository;
	
	@Bean
	public CommandLineRunner starter() {
			return args -> {
				userRepository.findById(1L)
				.ifPresent(u -> {
					u.setUsername("changeMyName"+new Random().nextInt());
					userRepository.save(u);
				});

				// userRepository.save(User.builder()
				// .username("admin"+Math.max(1, 100))
				// .build());	
			};
		
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

}
