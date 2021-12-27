package oop;

public class BankAccountApp {

    public static void main(String[] args) {
        // create a new  bank account >> think instantiate an object
        BankAccount acc1 = new BankAccount();
        acc1.accountNumber = "0615877";
        //acc1.name = "john doe";
        /// with encapsulation
        acc1.setName("john doe");
        System.out.println(acc1.getName());

        acc1.balance = 10000;
        // polymorphism through overriding
        System.out.println(acc1.toString());
        System.out.println("--------");
        acc1.deposit(10000);
        acc1.withdraw(100);
        System.out.println(acc1.toString());
        acc1.setRate();
        acc1.increaseRate();

        // polymorphism through overloading
        BankAccount acc2 = new BankAccount("Checking account");
        acc2.accountNumber = " 5656778";

        BankAccount acc3 = new BankAccount("Saving Account", 5000);
        acc3.accountNumber = "454848";
        acc3.checkBalance();

//        System.out.println(acc1.routingNumber);
//        System.out.println(acc2.routingNumber);
//        System.out.println(acc3.routingNumber);

        //Demo for inheritance
        System.out.println("---------");
        CDAccount cd1 = new CDAccount();
        cd1.balance = 3000;
//        cd1.name = "Juan";
        cd1.setName("Juan");
        cd1.accountType = "CD Account";
        System.out.println(cd1.toString());


        // Testing Interfaces
        BankAccount acc4 = new BankAccount();
        acc4.increaseRate();
        acc4.setRate();

        LoanAccount loanAcc = new LoanAccount();
        loanAcc.increaseRate();
        loanAcc.setRate();
    }
}
