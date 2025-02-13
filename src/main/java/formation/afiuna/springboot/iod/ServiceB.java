package formation.afiuna.springboot.iod;

import java.util.Random;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;

@Getter
@Configuration
public class ServiceB {
    private final int value;
    private final int coefficient;

    // Nécessaire pour que l'injection de dépendance puisse se faire, sans quoi ça ne sera pas possible
    public ServiceB() {
        this.value = 0;
        this.coefficient = 0;        
    }

    public ServiceB(int value, int coefficient) {
        this.value = value;
        this.coefficient = coefficient;
    }
    
    public ServiceB(int value) {
        this.value = value;
        this.coefficient = new Random().nextInt();
    }

    @Bean
    public ServiceB createBeanB(){
        return new ServiceB(10, 5);
    }

    @Bean    

    public ServiceB createBeanBB(){        

        return new ServiceB(10);
    }
        
}
