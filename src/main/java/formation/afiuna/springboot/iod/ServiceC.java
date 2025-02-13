package formation.afiuna.springboot.iod;

public class ServiceC {
    private ServiceB serviceB;

    // On se débarasse de ce constructeur
    // public ServiceC(ServiceB serviceB) {        
    //     this.serviceB = serviceB;
    // }

    public double calcule() {
        double intermediateValue = this.serviceB.getValue() * this.serviceB.getCoefficient();
        return intermediateValue * 3;
    }
}
