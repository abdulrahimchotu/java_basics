package src.basics;

public class Basics {
    public static void main(String[] args) {
        int num = 10;
        double decimal = 5.5;
        char letter = 'A';
        boolean flag = true;
        String text = "Java Basics";

        if(num > 5) {
            System.out.println("Number is greater than 5");
        }
        else {
            System.out.println("Number is less than or equal to 5");
        }

        for(int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int count = 0;
        while(count < 5) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println();

        int[] numbers = {1, 2, 3, 4, 5};
        for(int n : numbers) {
            System.out.print(n + " ");
        }

        String reversed = new StringBuilder(text).reverse().toString();
        System.out.println("\nReversed string: " + reversed);

        int x = 10, y = 20;
        System.out.println("Sum: " + (x + y));
        System.out.println("Difference: " + (x - y));
        System.out.println("Product: " + (x * y));
        System.out.println("Division: " + (y / x));
    }
}