package formation.afiuna.springboot.iod;

public class ServiceC {
    private ServiceB serviceB;

    // On se débarasse de ce constructeur
    // public ServiceC(ServiceB serviceB) {        
    //     this.serviceB = serviceB;
    // }

    public double calcule() {
        return this.serviceB.getValue() * this.serviceB.getCoefficient() * 2;        
    }
}
