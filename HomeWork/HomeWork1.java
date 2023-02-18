package Java.Seminar1.HomeWork;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        int num = UserInput();
        // System.out.println(num);
        int result = TringleDigitCalculation(num);
        // System.out.println(result);
        // WTF(result);
        
        
    }
    public static int UserInput() {
        Scanner iScanner = new Scanner(System.in);
        // Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите порядок треугольного числа для расчета:");
        String input = iScanner.nextLine();
        int result = Integer.parseInt(input);
        // System.out.printf("%d Хороший выбор!", result);
        // System.out.println();
        iScanner.close();
        return result;
    }

    public static int TringleDigitCalculation(int num) {
        int result = num*(num+1)/2;
        return result;
    }
}