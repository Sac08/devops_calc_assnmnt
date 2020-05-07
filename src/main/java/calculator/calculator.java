package calculator;
import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");

        // nextDouble() reads the next double from the keyboard
        int first = reader.nextInt();
        int second = reader.nextInt();

        System.out.print("Enter an operator (+, -, *): ");
        char operator = reader.next().charAt(0);

        int result;

        switch(operator)
        {
            case '+':
                result = first + second;
                break;

            case '-':
                result = first - second;
                break;

            case '*':
                result = first * second;
                break;


            // operator doesn't match any case constant (+, -, *, /)
            default:
                System.out.printf("Error! operator is not correct");
                return;
        }

        System.out.printf("%d %c %d = %d", first, operator, second, result);
    }
}
