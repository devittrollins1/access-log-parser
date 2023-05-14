import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        int firstNumber = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
        int secondNumber = new Scanner(System.in).nextInt();

        int addition = firstNumber + secondNumber;
        System.out.println(addition);
        int subtraction = firstNumber - secondNumber;
        System.out.println(subtraction);
        int multiplication = firstNumber * secondNumber;
        System.out.println(multiplication);
        double division = (double) firstNumber / secondNumber;
        System.out.println(division);

    }

}
