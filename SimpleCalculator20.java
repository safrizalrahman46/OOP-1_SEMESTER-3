import java.util.Scanner;

public class SimpleCalculator20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input numbers and operator
        System.out.print("Masukkan NOMOR NYA 1: ");
        double number1 = scanner.nextDouble();
        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        System.out.print("Masukkan NOMOR NYA 2: ");
        double number2 = scanner.nextDouble();

        double result = 0;
        boolean validOperation = true;

        // Perform calculation
        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    System.out.println("Error: Division by zero.");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                validOperation = false;
        }

        if (validOperation) {
            System.out.println("Result: " + result);
        }
    }
}
