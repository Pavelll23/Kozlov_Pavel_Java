import java.util.Scanner;

public class CompareService {

    public String comp(double a, double b) {            // Сравнение
        String result = "";
        if (a > b) {
            result = "a > b";
        } else if (a < b) {
            result = "a < b";
        } else if (a == b) {
            result = "a = b";
        }
        System.out.println("Результат сравнения :" + result);
        return result;
    }
}


