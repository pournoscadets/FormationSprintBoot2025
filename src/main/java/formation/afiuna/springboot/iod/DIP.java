// Principe de Segregation
//Principe de Responsabilité unique
public interface IPaymentService {
    public double payment();
    public double paymentInstanne();           
}

// Principe de Segregation
public interface IRetraitService {
    public double retrait();
}


public class CardPayment implements IPaymentService { 
    @Override   
    public double payment() {
        return 1.0;
    }
}

public class WavePayment implements IPaymentService { 
    @Override   
    public double payment() {
        return 2.0;
    }
}

public class RetraitEspece implements IRetraitService { 
    @Override   
    public double retrait() {
        return 1.0;
    }
}

//Principe de Responsabilité unique
public class PaymentService{
    //Principe de substitution de Liskov
    private IPaymentService paymentService;

    // Injection de dépendance via le constructeur
    public PaymentService(IPaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public double executePayment(){ 
        return paymentService.payment();        
    }

    public double executePaymentInstanee(){ 
        return paymentService.paymentInstanne();        
    }
}

//Principe de Responsabilité unique
public class RetraitService{
    //Principe de substitution de Liskov
    private IRetraitService retraitService;

    // Injection de dépendance via le constructeur
    public RetraitService(IRetraitService retraitService) {
        this.retraitService = retraitService;
    }

    public double executeRetrait(){ 
        return retraitService.retrait();        
    }
}
public class MainClass{
    public static void main(String[] args) {
        
        PaymentService paymentCardService = new PaymentService(new CardPayment());
        //Principe de Open/Closed
        PaymentService paymentWaveService = new PaymentService(new WavePayment());

        RetraitService retraitService = new RetraitService(new RetraitEspece());
        System.out.println(paymentWaveService.executePayment());
    }
}