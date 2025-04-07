public class Main {
    public static void main(String[] args) {
        IPaymentService illicoService= new IllicoCash("AIN23456");
        DepositProcessor IllicoProcessor=new DepositProcessor(illicoService);
        IllicoProcessor.depositprocess("0746377654",3000);
        
    }
}