package LAB3;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 1;

        while (n != 0) {
            System.out.println("Please enter numeber 0 to exit: ");
            n = scanner.nextInt();
        }

        System.out.println("Bye.");

    }//main
}//class
