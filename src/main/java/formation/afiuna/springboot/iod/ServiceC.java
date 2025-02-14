package formation.afiuna.springboot.iod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ServiceC {
    
    @Autowired
    @Qualifier("serviceBWith2Argument")
    private ServiceB serviceB;

    public double calcule() {        
        return serviceB.calculeValueAndCoefficient();
    }
}
