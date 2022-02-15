package ArraysLAB;

import java.util.Scanner;

public class P04ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] array = input.split(" ");


        for (int j=array.length-1;j>=0; j--) {
            System.out.print(array[j] + " ");
        }
    }
}
