package LAB6;

import java.util.StringTokenizer;

public class ex3 {
    public static void main(String[] args) {

        String mystr = "Hello, Welcome to RUTS SAIYAI";
        StringTokenizer mytoken = new StringTokenizer(mystr);
        System.out.println(mytoken.countTokens());
        while (mytoken.hasMoreTokens()){
            System.out.println(mytoken.nextToken());
        }




    }//main
}//class

