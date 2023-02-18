import java.util.InputMismatchException;
import java.util.Scanner;

public class Program1 {
    /**
     * вычисление треугольного n числа
     */
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = 0;
            boolean inputError = true;
            while (inputError ) {
                try {
                    System.out.print("Введите число n: ");
                    n = input.nextInt();
                    inputError = false;
                } catch (InputMismatchException e) {
                    System.out.println("Некорректный ввод!");
                    input.next();                
                }
                
            }
            int result = triangularNumber(n);
            System.out.println("Треугольное число " + n + " равно: " + result);
        }
    }
    public static int triangularNumber(int x) {
        return (x* (x + 1))/2;
        
    }
}