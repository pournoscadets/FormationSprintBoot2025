public interface IPaymentService {
    public double payment();
}

public class CardPayment implements IPaymentService { 
    @Override   
    public double payment() {
        return 1.0;
    }
}

public class PaymentService{
    private IPaymentService paymentService;

    // Injection de dépendance via le constructeur
    public PaymentService(IPaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public double executePayment(){ 
        return paymentService.payment();        
    }
}

public class MainClass{
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService(new CardPayment());
        System.out.println(paymentService.executePayment());
    }
}