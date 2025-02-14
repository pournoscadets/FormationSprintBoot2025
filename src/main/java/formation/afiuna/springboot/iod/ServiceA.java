package formation.afiuna.springboot.iod;

public class ServiceA {
    private final ServiceB serviceB;

    // Pour que cela fonctionne nous verrons comment Spring l'implemente en dessous du capot à la branche 03_principe_injection_dependance_goal_implementation
    public ServiceA(ServiceB serviceB) {        
        this.serviceB = serviceB;
    }

    public double calcule() {
        return this.serviceB.getValue() * this.serviceB.getCoefficient();        
    }
}
