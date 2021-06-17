public class Uzdevums1 {
    public static void main(String[] args) {
        BankCard bankCard = new BankCard();

        System.out.println(bankCard.bankName);
        System.out.println(bankCard.expDate);
        System.out.println(bankCard.nameOnCard);
        bankCard.getBlance();
        bankCard.withdraw(1000);
        bankCard.deposit(20000);
    }
}
