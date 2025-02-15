package formation.afiuna.springboot.entity;


public class Compte {
    private Long id;
    private int compteNumber;
    private double amount;
    private User user;

    public Compte() {
    }

    public Compte(Long id, int compteNumber, double amount, User user) {
        this.id = id;
        this.compteNumber = compteNumber;
        this.amount = amount;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCompteNumber() {
        return compteNumber;
    }

    public void setCompteNumber(int compteNumber) {
        this.compteNumber = compteNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
