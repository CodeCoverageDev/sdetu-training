package exceptionfiles;

public class Demo {
    public  static void main(String[] args) {
        System.out.println("Program starts");
        doMath(12, 0);
        System.out.println("Program continues");
    }

    public static void doMath(int a, int b) {

        System.out.println(answer(a, b));
    }

    public static double answer(int x, int y) {
        // catch error here
        return x / y;
    }
}
