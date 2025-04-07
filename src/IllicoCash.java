public class IllicoCash implements IPaymentService{
    private String IllicoID;
    public IllicoCash(String IllicoID){
        this.IllicoID=IllicoID;
    }

    @Override
    public void DepositMoney(String PhoneNumber, double amount) {
        System.out.println("the illicoId is :" + IllicoID);
        System.out.println("Deposit" + amount + "USD to" + PhoneNumber + "via Illicocash");
    }
}
