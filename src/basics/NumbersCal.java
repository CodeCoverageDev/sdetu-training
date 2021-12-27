package basics;

public class NumbersCal {

    public static void main(String[] args) {
	System.out.println("Program is starting");
	printName();
	int numA = 10;
	int numB = 20;
	addNumbers(numA, numB);
	int product = multipleNumbers(numA, numB);
	System.out.println("The product of numbers " + product);
    }
    static void printName() {
	System.out.println("My name is Chris.");
    }

    static void addNumbers(int numberA, int numberB) {
        // this function will add 2 numbers
	int sum = numberA + numberB;
	System.out.println("The sum of numbers " + numberA + " and " + numberB + " is " + sum);
    }

    static int multipleNumbers(int valueA, int valueB) {
        int product = valueA * valueB;
        addNumbers(product, product);
        return product;
    }
}
