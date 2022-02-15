package ArraysLAB;

import java.util.Scanner;

public class P06EqualArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        String[] array = input1.split(" ");
        String[] array2 = input2.split(" ");
        int[] arrayNumbers1 = new int[array.length];
        int[] arrayNumbers2 = new int[array2.length];
        boolean isDifferent = false;
        int difference = 0;
        int sum = 0;

        for (int i=0; i<array.length; i++) {
            arrayNumbers1[i] = Integer.parseInt(array[i]);
            arrayNumbers2[i] = Integer.parseInt(array2[i]);
            sum += arrayNumbers1[i];
            if (arrayNumbers1[i] != arrayNumbers2[i]) {
                isDifferent = true;
                difference = i;
                break;
            }
        }
        if (isDifferent) {
            System.out.printf("Arrays are not identical. Found difference at %d index.", difference);
        } else {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
