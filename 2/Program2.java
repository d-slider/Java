import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program2 {
    /**
     * +Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя
     * количество выполняемых действий к минимуму.
     * Пример 1: а = 3, b = 2, ответ: 9
     * Пример 2: а = 2, b = -2, ответ: 0.25
     * Пример 3: а = 3, b = 0, ответ: 1
     * Пример 4: а = 0, b = 0, ответ: не определено
     * Пример 5
     * входные данные находятся в файле input.txt в виде
     * b 3
     * a 10
     * Результат нужно сохранить в файле output.txt
     */
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("input.txt"));
            sc.useDelimiter("\\s+");
            String aStr = sc.next();
            double a = Double.parseDouble(aStr.substring(aStr.indexOf(":") + 1));
            String bStr = sc.next();
            double b = Double.parseDouble(bStr.substring(bStr.indexOf(":") + 1));
            sc.close();

            double result = Math.pow(a, b);
            System.out.println("Результат возведения в степень: " + result);

            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write(String.valueOf(result));
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл");
        }
    }
}