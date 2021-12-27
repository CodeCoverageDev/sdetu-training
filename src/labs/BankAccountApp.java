package labs;

public class BankAccountApp {

    public static void main (String[] args) {
	BankAccount acc1 = new BankAccount("456547878", 1000);
	acc1.setName("John Doe");
	System.out.println(acc1.getName());
	acc1.makeDeposit(500);
	acc1.makeDeposit(600);
	acc1.payBill(1000);
	acc1.accrue();
	System.out.println(acc1.toString());
    }
}

class BankAccount implements IInterest{
    // Properties of bank account
    private static int iD = 1000;
    private String accountNumber; // ID + Random 2-digit number + first 2 of SNN
    private static final String routingNumber = "0054000657";
    private String name;
    private String SNN;
    double balance;

    // Constructor
    public BankAccount(String SNN, double initDeposit) {
	balance = initDeposit;
	this.SNN = SNN;
	iD++;
	setAccountNumber();
    }

    private void setAccountNumber() {
	int random = (int) (Math.random() * 100);
	accountNumber = iD + "" + random + SNN.substring(0,2);
	System.out.println("Your Account Number: " + accountNumber);
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public void payBill(double amount) {
	balance = balance - amount;
	System.out.println("Paying bill: " + amount);
	showBalance();
    }
    public void makeDeposit(double amount) {
	balance = balance + amount;
	System.out.println("Making Deposit: " + amount);
	showBalance();
    }
    public void showBalance() {
	System.out.println("Balance: " + balance);
    }


    @Override
    public void accrue() {
	balance = balance * (1 + rate/100);
	showBalance();
    }

    public String toString() {
	return  "[Name:" + name + " ]\n[Account Number: " + accountNumber + "]\n" + "[Routing Number: " + routingNumber
	    + "]\n" + "[Balance: " + balance + "]";
    }
}