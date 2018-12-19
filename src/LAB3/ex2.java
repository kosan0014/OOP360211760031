package LAB3;

public class ex2 {
    public static void main(String[] args) {
        int score = 300;
        // 0-49   = F
        // 50-59  = D
        // 60-69  = c
        // 70-79  = B
        // 80-100 = A
        if (score>=0 && score <=49 )
            System.out.println("Grad F.");
         else if (score>=50 && score <=59 )
            System.out.println("Grad D.");
      else if (score>=60 && score <=69 )
            System.out.println("Grad C.");
       else if (score>=70 && score <=79 )
            System.out.println("Grad B.");
       else if (score>=80 && score <=100 )
            System.out.println("Grad A.");
       else
           System.out.println("Invalid Score.");






    }//main
}//ciass
