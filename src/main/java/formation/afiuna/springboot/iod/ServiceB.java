package formation.afiuna.springboot.iod;

import org.springframework.stereotype.Service;

@Service
public class ServiceB {
    private final int VALUE = 10;
    private final int COEFFICIENT = 100;


    public int calculeValueAndCoefficient() {
        return VALUE * COEFFICIENT;
    }

        
}
