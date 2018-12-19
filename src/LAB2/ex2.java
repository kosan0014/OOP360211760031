package LAB2;

import javax.swing.text.Style;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        String name;
        System.out.println("What is you name?:");
        name = scanner.nextLine();
        System.out.print("How old are you?: ");
        age = scanner.nextInt();
        //Display
        System.out.println("Hi, "+name);
        System.out.println("You are "+age+" year old  ");
    }//main

}//ciass
