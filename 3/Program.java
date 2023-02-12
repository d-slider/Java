
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    static int countPaths(int x, int y, int N) {
        if (x == N - 1 && y == N - 1) {
            return 1;
        }
        if (x > N - 1 || y > N - 1) {
            return 0;
        }
        return countPaths(x + 1, y, N) + countPaths(x, y + 1, N);
    }

    /**
     * Дана прямоугольная карта размера MxN (N, M меньше 20)
     * На карте стоит фигура в точке(Х, Y), которая может ходить на одну клеточку
     * вправо или вниз за один ход
     * Посчитать количество маршрутов, которым фигура может попасть в нижнюю правую
     * клетку
     * Задачу разбить на методы
     */
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            boolean inputError = true;
            while (inputError) {
                try {
                    System.out.print("Введите размер поля: ");

                    int z = input.nextInt();
                    System.out.print("Введите позицию фигуры (номер строки): ");
                    int q = input.nextInt() - 1;
                    System.out.print("Введите позицию фигуры (номер столбца): ");
                    int w = input.nextInt() - 1;

                    inputError = false;

                    int result = countPaths(q, w, z);
                    System.out.println("Количество маршрутов: " + result);

                } catch (InputMismatchException e) {
                    System.out.println("Некорректный ввод!");
                    input.next();
                }
            }
        }
    }
}