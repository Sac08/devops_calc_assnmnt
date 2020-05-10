package calculator;
import java.util.Scanner;

public class calculator {
    public static int add(int first, int second) {
        return first + second;
    }
    public static int subtract(int first, int second) {
        return first - second;
    }
    public static int multiply(int first, int second) {
        return first * second;
    }
    public static int divide(int first, int second) {
        return first / second;
    }
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");

        // nextDouble() reads the next double from the keyboard
        int first = reader.nextInt();
        int second = reader.nextInt();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = reader.next().charAt(0);

        int result;

        switch(operator)
        {
            case '+':
                result = add(first, second);
                break;

            case '-':
                result = subtract(first, second);
                break;

            case '*':
                result = multiply(first, second);
                break;
            case '/':
            	result = divide(first, second);
            	break;

            // operator doesn't match any case constant (+, -, *, /)
            default:
                System.out.printf("Error! operator is not correct");
                return;
        }

        System.out.printf("%d %c %d = %d", first, operator, second, result);
    }
}
