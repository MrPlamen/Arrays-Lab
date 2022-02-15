package ArraysLAB;

import java.util.Scanner;

public class P01DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] daysOfTheWeek = {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        };
        if (n>=1 && n<=7) {
            System.out.println(daysOfTheWeek[n-1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
