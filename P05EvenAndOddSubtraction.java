package ArraysLAB;

import java.util.Scanner;

public class P05EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] array = input.split(" ");
        int[] arrayNumbers = new int[array.length];
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < array.length; i++) {
            arrayNumbers[i] = Integer.parseInt(array[i]);
            if (arrayNumbers[i]%2 == 0) {
                sumEven+=arrayNumbers[i];
            } else {
                sumOdd+=arrayNumbers[i];
            }
        }
        System.out.println(sumEven-sumOdd);
    }
}
