package formation.afiuna.springboot.iod;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

// @@Component
@Service
@RequiredArgsConstructor
public class ServiceA {    

    private final ServiceB serviceB;


    public double calcule() {
        
        return serviceB.calculeValueAndCoefficient();   
    }
}
