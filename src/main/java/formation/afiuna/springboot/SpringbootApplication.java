package formation.afiuna.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import formation.afiuna.springboot.iod.ServiceA;

@SpringBootApplication
public class SpringbootApplication {

	private static final ServiceA serviceA;
	
	public static void main(String[] args) {				

		serviceA.calcule();

		SpringApplication.run(SpringbootApplication.class, args);
	}	

}
