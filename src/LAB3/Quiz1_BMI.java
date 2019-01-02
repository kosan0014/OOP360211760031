package LAB3;

public class Quiz1_BMI {
    public static void main(String[] args) {

        int    BMI = 300;
        // 0-18.50      = น้ำหนักน้อย/ผอม
        // 18.50-22.90  = ปกติ (สุขภาพดี)
        // 23-24.90     = ท้วม/โรคอ้วนระดับ1
        // 25-29.90     = อ้วน/โรคอ้วนระดับ2
        // >30          = อ้วนมาก/โรคอ้วนระดับ3
        if (BMI>=0 && BMI <=18.50  )
            System.out.println("น้ำหนักน้อย/ผอม.");
        else if (BMI>=18.50 && BMI <=22.90 )
            System.out.println("ปกติ (สุขภาพดี).");
        else if (BMI>=23 && BMI <=24.90 )
            System.out.println("้วม/โรคอ้วนระดับ1.");
        else if (BMI>=25 && BMI <=29.90 )
            System.out.println("้วน/โรคอ้วนระดับ2.");
        else if (BMI>=30&& BMI <=100 )
            System.out.println("อ้วนมาก/โรคอ้วนระดับ3.");
        else
            System.out.println("Invalid BMI.");











    }//main
}//class
