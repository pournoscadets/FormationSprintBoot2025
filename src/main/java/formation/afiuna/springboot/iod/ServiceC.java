package formation.afiuna.springboot.iod;

public class ServiceC {
    private ServiceB serviceB;

    public ServiceC() {
        //Couplage fort entre le serviceC et le serviceB
        this.serviceB = new ServiceB(10, 1.2);
    }

    public double calcule() {
        double intermediateValue = this.serviceB.getValue() * this.serviceB.getCoefficient();
        return intermediateValue * 3;
    }
}
