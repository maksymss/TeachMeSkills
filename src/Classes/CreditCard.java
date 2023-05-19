package Classes;

public class CreditCard {

       private String accountNumber;
       private double accountBalance;
       private double transaction;

       public CreditCard(String cardNumber, double balance) {
       this.accountNumber = cardNumber;
       this.accountBalance = balance;
       }



    void addMoney(double transaction) {
    accountBalance = accountBalance + transaction;
            System.out.println("Your new balance is: " + this.accountBalance);
        }
        void withdrawMoney(double transaction) {
        accountBalance = accountBalance - transaction;
            System.out.println("Your new balance is: " + this.accountBalance);
        }
        void getCreditCardInfo() {
            System.out.println("Your credit card number is: " + this.accountNumber);
            System.out.println("Your balance is: " + this.accountBalance);

        }
}
