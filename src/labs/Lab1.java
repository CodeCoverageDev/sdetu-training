package labs;

public class Lab1 {
    public static void main (String[] args) {
        // Write a function that takes a value N and returns the sum of 1 to n
	sum(4);

	System.out.println("---------");
	// Write a function that computes factorial "hint": use recursion
	System.out.println("Factorial: " + fact(5));
	// 5! = 5 x 4 x 3 x 2 x 1 = 120
	System.out.println("--------");
	// Write 3 functions that returns min, avg and max of an array
	int[] numbers = { 5, -2, 0, 234, -438, 63 };
	System.out.println("Min: " + findMin(numbers));
	System.out.println("Max: " + findMax(numbers));
	System.out.println("Average: " + findAvg(numbers));

    }

    public static int findAvg(int[] arr) {
        // take sum, divide by number of elements
	int sum = 0;
	for (int n=0; n < arr.length; n++) {
	    System.out.println("current iteration: " + n);
	    System.out.println("current sum: " + sum);
	    System.out.println("current array: " + arr[n]);
		sum = sum + arr[n];
	    System.out.println("total sum: " + sum);
	}
	return sum/arr.length;
    }

    public static int findMax(int[] arr) {
	int max = arr[0];
	for (int i = 0; i < arr.length; i++){ // arr is 6 length
	    System.out.println("current iteration: " + i);
	    System.out.println("current arr[i]: " + arr[i]);
	    System.out.println("current min: " + max);
	    System.out.println("array: " + arr[i] + " < min: " + max);
	    if(arr[i] > max) {
		max = arr[i];
		System.out.println("latest min: " + max);
	    }
	}
	return max;
    }

    public static int findMin(int[] arr) {
	int min = arr[0];
	for (int i = 0; i < arr.length; i++){ // arr is 6 length
	    System.out.println("current iteration: " + i);
	    System.out.println("current arr[i]: " + arr[i]);
	    System.out.println("current min: " + min);
	    System.out.println("array: " + arr[i] + " < min: " + min);
	    if(arr[i] < min) {
		min = arr[i];
		System.out.println("latest min: " + min);
	    }
	}
	return min;
    }

    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++ ){
	    System.out.println(sum + " + " + i);
            sum = sum + i;
	    System.out.println(sum);
	}
        return sum;
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
	}
	System.out.println(n);
        return fact(n-1) * n;
    }


}
