import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите два числовых значения :");         // Задание 1
        Scanner variable = new Scanner(System.in);
        CompareService compare = new CompareService();
        CalculatorService calc = new CalculatorService();
        double a = variable.nextDouble();
        double b = variable.nextDouble();

        compare.comp(a, b);
        calc.calculator(a, b);
        calc.sub(a, b);
        calc.div(a, b);
        calc.mult(a, b);

        System.out.println("Введите два слова :");                     // Задание 2
        Scanner word = new Scanner(System.in);
        StringCompareService text = new StringCompareService();
        String c = word.next();
        String d = word.next();
        text.com(c, d);

        System.out.println("Четные числа из массива :");               // Задание 3
        ArrayService array = new ArrayService();
        array.numbersOfArray();
    }
}



