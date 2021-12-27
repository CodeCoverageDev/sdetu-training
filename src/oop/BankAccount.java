package oop;


public class BankAccount implements IRate {
    // define variables
    String accountNumber;
    // static belongs to the class not the object instance
    // final >> constant (often static final)
    private static String routingNumber = "013546";

    // Instance Variables
    private String name;
    private String ssn;


    // getters and setters
    public String getSsn() {
	return ssn;
    }

    public void setSsn(String ssn) {
	this.ssn = ssn;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    @Override
    public void setRate() {
	System.out.println("This is bank account setting rate.");
    }

    @Override
    public void increaseRate() {
	System.out.println("This is bank account increasing rate.");
    }

    String accountType;
    double balance = 0;

    //constructor definitions: unique methods
    // 1. They are used to defining / setup / initialize a properties of an object
    // 2. Constructors are Implicitly called upon instantiation
    // 3. The same name as the class itself
    // 4. Constructors have NO return type
    BankAccount() {
	System.out.println("New Account Created");
    }
    // Overloading: call the same method name with different arguments
    BankAccount(String accountType) {
	System.out.println("New Account Created: " + accountType);
    }
    BankAccount(String accountType, double initalDeposit) {
        // initialDeposit, accountType, msg are all local variables
	System.out.println("New Account Created: " + accountType);
	System.out.println("Initial Deposit of: " + initalDeposit);
	String msg = "";
	if (initalDeposit < 1000) {
	    msg = "Error: Min deposit must be at lease $1,000";
	} else {
	    msg = "Thank you for initial deposit of: $" + initalDeposit;
	}
	System.out.println(msg);
	balance = balance + initalDeposit;
    }

    //define methods
    public void deposit(double amount) {
	balance = balance + amount;
	showActivity("deposit");
    }

    void withdraw(double amount) {
	balance = balance - amount;
	showActivity("withdraw");
    }

    // Private: can only be called within the class
    private void showActivity(String activity) {
	System.out.println("Show recent activity: " + activity);
	System.out.println("Your new balance is: " + balance);
    }

    void checkBalance() {
	System.out.println("Balance is: $" + balance);
    }

    void getStatus() {

    }

    @Override
    public String toString() {
	return "[ Name: " + name + ". Account Number:" + accountNumber + ". Routing number: " + routingNumber + ". BALANCE: $" + balance + " ]";
    }


}
