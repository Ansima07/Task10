public class Main {
    public static void main(String[] args) {
        IPaymentService illicoService= new IllicoCash("AIN23456");
        DepositProcessor IllicoProcessor=new DepositProcessor(illicoService);
        IllicoProcessor.depositprocess("0746377654",3000);

        IPaymentService moneyGramService= new MoneyGram("AIN23456");
        DepositProcessor moneyGramProcessor=new DepositProcessor(moneyGramService);
        moneyGramProcessor.depositprocess("0745678654",5000);
    }
}