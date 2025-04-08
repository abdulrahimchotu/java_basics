package src.exceptions;

public class ExceptionDemo {
    public static void main(String[] args) {
        basicTryCatch();
        tryCatchFinally();
        customExceptionDemo();
    }

    static void basicTryCatch() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }

    static void tryCatchFinally() {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        } finally {
            System.out.println("Finally block always executes");
        }
    }

    static void customExceptionDemo() {
        try {
            checkAge(15);
        } catch (CustomException e) {
            System.out.println("Custom exception: " + e.getMessage());
        }
    }

    static void checkAge(int age) throws CustomException {
        if(age < 18) {
            throw new CustomException("Age must be 18+");
        }
        System.out.println("Age validation passed");
    }
}