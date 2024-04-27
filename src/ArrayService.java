public class ArrayService {

    public  int[] numbersOfArray () {
        int number[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                System.out.println(" Number: " + number[i]);
            }
        }
        return number;
    }
}
