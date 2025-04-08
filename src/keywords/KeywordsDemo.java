package src.keywords;

public class KeywordsDemo {
    static final double PI = 3.14;
    static int counter = 0;
    final int MAX_VALUE = 100;

    static void printMessage() {
        System.out.println("Static method called");
    }

    static {
        System.out.println("Static block executed");
        counter = 1;
    }

    public static void main(String[] args) {
        printMessage();
        System.out.println("PI value: " + PI);
        System.out.println("Counter: " + counter);

        KeywordsDemo demo = new KeywordsDemo();
        System.out.println("MAX_VALUE: " + demo.MAX_VALUE);

        final String name = "John";
        System.out.println("Name: " + name);

        final StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder: " + sb);
    }
}