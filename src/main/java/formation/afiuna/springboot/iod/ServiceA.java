package formation.afiuna.springboot.iod;

public class ServiceA {
    private ServiceB serviceB;

    public ServiceA(ServiceB serviceB) {        
        this.serviceB = serviceB;
    }

    public double calcule() {
        double intermediateValue = this.serviceB.getValue() * this.serviceB.getCoefficient();
        return intermediateValue * 2;
    }
}
