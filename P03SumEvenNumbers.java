package ArraysLAB;

import java.util.Scanner;

public class P03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = input.split(" ");
        int[] arrayNumbers = new int[arr.length];
        int sum = 0;

        for (int i=0; i< arr.length; i++) {
            arrayNumbers[i] = Integer.parseInt(arr[i]);
            if (arrayNumbers[i]%2 == 0) {
                sum+=arrayNumbers[i];
            }
        }
        System.out.println(sum);
    }
}
