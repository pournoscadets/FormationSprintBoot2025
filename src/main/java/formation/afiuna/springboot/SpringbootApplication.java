package formation.afiuna.springboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import formation.afiuna.springboot.iod.ServiceA;
import formation.afiuna.springboot.iod.ServiceC;

@SpringBootApplication
public class SpringbootApplication {
	
	public static void main(String[] args) {				
		
		try (AnnotationConfigApplicationContext context =
                  new AnnotationConfigApplicationContext("formation.afiuna.springboot")) {

					ServiceA serviceA = context.getBean(ServiceA.class);
					ServiceC serviceC = context.getBean(ServiceC.class);
					System.out.println("\nServiceA result : "+ serviceA.calcule()+"\n");
					System.out.println("ServiceC result : "+ serviceC.calcule());
    }			

		//SpringApplication.run(SpringbootApplication.class, args);
	}	

}
