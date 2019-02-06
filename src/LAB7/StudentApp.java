package LAB7;

public class StudentApp {

    public static void main(String[] args) {

        //create object of Student class
        Student std = new Student();
        System.out.println(std.getName());

        std.setId("STD0031");
        std.setName("KOSAN");
        std.setAge(33);

        System.out.println(std.getId());
        System.out.println(std.getName());
        System.out.println(std.getage());

        std.setAge(23);
        System.out.println(std.getage());


    }
}
