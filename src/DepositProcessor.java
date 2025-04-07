public class DepositProcessor {
    private IPaymentService paymentService;
    public DepositProcessor(IPaymentService paymentService){
        this.paymentService=paymentService;
    }
    public void depositprocess(String Number, double amount){
        paymentService.DepositMoney(Number, amount);
    }
}
