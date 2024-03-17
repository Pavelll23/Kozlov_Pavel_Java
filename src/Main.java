import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите два числовых значения :");         // Задание 1
        Scanner variable = new Scanner(System.in);
        CompareService compare = new CompareService();
        CalculatorService calc = new CalculatorService();
        double a = variable.nextDouble();
        double b = variable.nextDouble();
        String comparison = compare.comp(a, b);
        double result;
        System.out.println("Результат сравнения :" + comparison);
        double addition = calc.calculator(a, b);
        System.out.println("Результат сложения :" + addition);
        double subtract = calc.sub(a, b);
        System.out.println("Результат вычитания :" + subtract);
        double divide = calc.div(a, b);
        System.out.println("Результат деления :" + divide);
        double multiply = calc.mult(a, b);
        System.out.println("Результат умножения :" + multiply);

        System.out.println("Введите два слова :");                     // Задание 2
        Scanner word = new Scanner(System.in);
        StringCompareService text = new StringCompareService();
        String c = word.next();
        String d = word.next();
        String eaqelsWord = text.com(c , d);
        System.out.println(eaqelsWord);

    }
}
