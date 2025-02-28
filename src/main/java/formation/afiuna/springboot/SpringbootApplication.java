package formation.afiuna.springboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import formation.afiuna.springboot.iod.ServiceA;

@SpringBootApplication
public class SpringbootApplication {
	
	public static void main(String[] args) {				
		
		try (AnnotationConfigApplicationContext context =
                  new AnnotationConfigApplicationContext("formation.afiuna.springboot")) {

					ServiceA serviceA = context.getBean(ServiceA.class);
					System.out.println(serviceA.calcule());
    }			

		//SpringApplication.run(SpringbootApplication.class, args);
	}	

}
