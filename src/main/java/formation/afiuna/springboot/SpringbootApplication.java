package formation.afiuna.springboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import formation.afiuna.springboot.iod.ServiceA;

@SpringBootApplication
public class SpringbootApplication {
		
	private static ServiceA serviceA;
	
	public static void main(String[] args) throws InterruptedException {				

		serviceA = new ServiceA();
		double result = serviceA.calcule();		

		System.out.println(result);


		//SpringApplication.run(SpringbootApplication.class, args);
	}	

}
