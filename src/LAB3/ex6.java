package LAB3;

import java.util.Scanner;

public class ex6 {

    private static String user = "admin" ;
    private static String pass = "1234" ;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String u=null,p=null;
        boolean login = false;
        int count = 0 ;
        do {
            System.out.println("Enter username");
            u = scanner.nextLine();
            System.out.println("Entet passwoed");
            p = scanner.nextLine();
            if (u.equals(user) && p.equals(pass)){
                login = true;
            System.out.println("You had logged in");
        }
            else {
                System.out.println("Inconrrect username or password");
                login = false;
                count++;
                if (count ==3)
                    System.out.println("You account have been logged");
                    break;
            }
        }while (!login);



    }//main
}//class

