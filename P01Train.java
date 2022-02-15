package ArraysLAB;

import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wagons = Integer.parseInt(sc.nextLine());
        int[] array = new int[wagons];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sc.nextLine());
            sum += array[i];
        }
        for (int var : array) {
            System.out.print(var + " ");
        }
        System.out.println("\n" + sum);
    }
}
