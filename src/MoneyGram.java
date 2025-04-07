public class MoneyGram implements IPaymentService{
    private String ClientID;
    public MoneyGram(String ClientID){
        this.ClientID=ClientID;
}
    @Override
    public void DepositMoney(String PhoneNumber, double amount) {
        System.out.println("the ClientId is :" + ClientID);
        System.out.println("Deposit" + amount + "USD to" + PhoneNumber + "via MoneyGram Counter");
        }
}

