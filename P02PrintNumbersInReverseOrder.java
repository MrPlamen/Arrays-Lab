package ArraysLAB;

import java.util.Scanner;

public class P02PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] array = new int[n];

        for (int i = 0; i <= n - 1; i++) {
            array[i] = Integer.parseInt(sc.nextLine());
        }
        for (int j = array.length; j >= 1; j--) {
            System.out.print(j + " ");
        }
    }
}
