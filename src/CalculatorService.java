public class CalculatorService {



    public double calculator(double a, double b) {      // Сложение
        double sum = (a + b);
        System.out.println("Результат сложения :" + sum);
        return sum;
    }

    public double sub(double a, double b) {       // Вычитание
        double subtraction = (a - b);
        System.out.println("Результат вычитания :" + subtraction);
        return subtraction;
    }

    public double div(double a, double b) {        // Деление
        if(b <= 0){
            System.out.println("Результат деления : На ноль делить нельзя !!!");
        } else {
            b = b;
            double division = (a / b);
            System.out.println("Результат деления :" + division);
        }
        return 0;
    }

    public double mult(double a, double b) {        // Умножение
        double multiplication = (a * b);
        System.out.println("Результат умножения :" + multiplication);
        return multiplication;
    }
}
