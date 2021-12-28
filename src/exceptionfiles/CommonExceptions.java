package exceptionfiles;

public class CommonExceptions {
    public static void main(String[] args) {
	int a = 5;
	int b = 0;
	// 1. Identify the potential problem area
	// 2. Surround with try-catch block

	try {
	    int c = a/b;
	} catch (ArithmeticException e) {
	    System.out.println("Cannot Divide By Zero");
	    System.out.println(e.toString());
	}


	String[] states = {"CA", "TX", "FL", "NY"};

	for (int i = 0; i < states.length; i++) {
	    try {
		System.out.println(states[i]);
	    } catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Error: Index outside of array domain");
		System.out.println(e.toString());
	    } finally {
		System.out.println("Integrating through array");
	    }
	}

	System.out.println("Program is closing");
    }
}
