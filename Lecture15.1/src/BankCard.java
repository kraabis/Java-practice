public class BankCard {

    String bankName = "Citadele Banka";
    String paymentProcessor = "Master Card";
    String nameOnCard = "John Doe";
    String cardNumber = "4444 4444 4444 4444";
    String expDate = "12/2001";
    int SecurityCode = 123;

    public void getBlance() {
        System.out.println("your balance is 2 000 000 dollars");
    }

    public void deposit (int cashIn){
        System.out.println("You deposited " + cashIn);
    }
    public void withdraw (int cashOut) {
        System.out.println("You have withdrawn " + cashOut);
    }
}
