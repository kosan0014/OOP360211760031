package LAB4;

public class ex1 {

    public static void B(int x) {
        System.out.println("Hello B." + x);
    }//B
        public  static void main(String[] args){
        A();
        B(5);
        //int num = C(5, 5);
        //System.out.println(num);
    }//main

    public static void A() {
        //to do your code here.
        System.out.println("Hello A.");
    }//A
    public static int C(int x,int y) {

        System.out.println("Hello C."+(x*y));
        return x*y;
    }//C



    }//class
