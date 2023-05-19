package Classes;

public class MainCreditCardClass {
    public static void main(String[] args) {

    CreditCard citi = new CreditCard("5378-3400-4311-7750", 500 );

    CreditCard chase = new CreditCard("7533-8866-1207-2347", 1000);

    CreditCard wellsFargo = new CreditCard("7746-2300-1234-9876", 2000);


    citi.addMoney(564.7);
    chase.addMoney(4598);
    wellsFargo.withdrawMoney(73.6);

    System.out.println();

    citi.getCreditCardInfo();
        System.out.println();
    chase.getCreditCardInfo();
        System.out.println();
    wellsFargo.getCreditCardInfo();
    }

}
