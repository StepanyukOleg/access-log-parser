import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Программа расчёта суммы, разницы, произведения и частного по введенным числам \nВведите первое число:");
        int firstNumber = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число: ");
        int secondNumber = new Scanner(System.in).nextInt();
        int summ = firstNumber + secondNumber;
        int razn=firstNumber - secondNumber;
        int proizv=firstNumber * secondNumber;
        double chastnoe= (double) firstNumber / secondNumber;
        System.out.println("Сумма: " + summ);
        System.out.println("Разница: " + razn);
        System.out.println("Произведение: " + proizv);
        System.out.println("Частное: " + chastnoe);
    }
}
