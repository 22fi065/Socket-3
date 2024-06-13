//package sorce;
package netpro2024.mid_exam.q2;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        for (int a = 0; a < 5; a++) {
            System.out.print("西暦年を入力してください（4桁の正の整数）：");
            int year = scanner.nextInt();
            String nyann = "";

            if (year == 2000) {
                nyann = "閏年";

            } else if (year % 4 != 0 || year % 100 == 0) {
                // Sysntln("うるう年");
                nyann = "平年";
            } else if (year % 4 == 0) {
                nyann = "閏年";
            }
            System.out.println(nyann);

        }
        scanner.close();

    }

}
