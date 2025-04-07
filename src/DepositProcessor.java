public class DepositProcessor {
    private IPaymentService paymentService;
    public DepositProcessor(IPaymentService paymentService){
        this.paymentService=paymentService;
    }
}
