package formation.afiuna.springboot.iod;

public class ServiceA {
    private ServiceB serviceB;

    public ServiceA() {
        //Couplage fort entre le serviceA et le serviceB
        this.serviceB = new ServiceB(10, 1.2);
    }

    public double calcule() {
        double intermediateValue = this.serviceB.getValue() * this.serviceB.getCoefficient();
        return intermediateValue * 2;
    }
}
