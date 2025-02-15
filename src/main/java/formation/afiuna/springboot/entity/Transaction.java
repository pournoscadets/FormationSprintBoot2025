package formation.afiuna.springboot.entity;


public class Transaction {

    private int id;
    private double accountId;
    private User destination;
    private User reciever;

    public Transaction(){}

    public Transaction(int id, double accountId, User destination, User reciever) {
        this.id = id;
        this.accountId = accountId;
        this.destination = destination;
        this.reciever = reciever;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getAccountId() {
        return accountId;
    }
    public void setAccountId(double accountId) {
        this.accountId = accountId;
    }
    public User getDestination() {
        return destination;
    }
    public void setDestination(User destination) {
        this.destination = destination;
    }
    public User getReciever() {
        return reciever;
    }
    public void setReciever(User reciever) {
        this.reciever = reciever;
    }

}
