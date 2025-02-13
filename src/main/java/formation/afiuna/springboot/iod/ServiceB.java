package formation.afiuna.springboot.iod;

//@Getter
public class ServiceB {
    private int value;
    private double coefficient;

    public ServiceB(int value, double coefficient) {
        this.value = value;
        this.coefficient = coefficient;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public int getValue() {
        return value;
    }
}
