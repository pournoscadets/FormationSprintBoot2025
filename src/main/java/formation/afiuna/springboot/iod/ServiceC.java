package formation.afiuna.springboot.iod;

public class ServiceC {
    private final ServiceB serviceB;

    public ServiceC(ServiceB serviceB) {        
        this.serviceB = serviceB;
    }

    public double calcule() {
        return this.serviceB.getValue() * this.serviceB.getCoefficient() * 2;        
    }
}
