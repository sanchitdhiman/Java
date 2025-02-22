import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the operator: ");
        char op = sc.next().charAt(0);

        if (op != '+' && op != '-' && op != '*' && op != '/' && op != '%') {
            System.out.println("Invalid operator!");
            return;
        }

        System.out.print("Enter the first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double b = sc.nextDouble();

        if (op == '/' && b == 0) {
            System.out.println("Division by zero is not possible!");
            return;
        }

        double result = switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            case '%' -> a % b;
            default -> 0.0;
        };

        System.out.println("\nThe result is: " + result);
    }
}
