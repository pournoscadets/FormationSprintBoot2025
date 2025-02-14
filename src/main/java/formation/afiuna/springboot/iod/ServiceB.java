package formation.afiuna.springboot.iod;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class ServiceB {
    private int value;
    private int coefficient;
    
    public ServiceB() {        
    }
    
    public ServiceB(int coefficient) {
        System.out.println("\n=> Constructor with 1 argument "+this.hashCode());
        this.coefficient = coefficient;
        this.value = 1;
    }

    public ServiceB(int coefficient,int value) {
        System.out.println("\n=> Constructor with 2 arguments "+this.hashCode());
        this.coefficient = coefficient;
        this.value = value;
    }

    public int calculeValueAndCoefficient() {
        return value * coefficient;
    }

    @Bean(name = "serviceBWith1Argument")
    @Primary
    public ServiceB getServiceBWith1Argument(){
        return new ServiceB(10);
    }

    @Bean(name = "serviceBWith2Argument") 
    // @Primary  
    public ServiceB getServiceBWith2Argument(){
        return new ServiceB(10, 20);
    }
        
}
