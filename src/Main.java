import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        int firstNumber = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
        int secondNumber = new Scanner(System.in).nextInt();

        int addition = firstNumber + secondNumber;
        System.out.println("Сумма: " + addition);
        int subtraction = firstNumber - secondNumber;
        System.out.println("Разность: " + subtraction);
        int multiplication = firstNumber * secondNumber;
        System.out.println("Произведение: " + multiplication);
        double division = (double) firstNumber / secondNumber;
        System.out.println("Частное: " + division);

    }

}
