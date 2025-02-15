package formation.afiuna.springboot.services;

public interface TransactionService {
    double tranfert(double amount, int destinationAccountId, int sourceAccountId);
    double recharge(double amount, int userId);
}
