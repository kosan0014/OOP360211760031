package LAB8;

public class PersonApp {
    public static void main(String[] args){

        Person person1,person2,person3;

        person1 = new Person( "jiraporn Thomkeaw","F001","1986" );
        person2 = new Sheriff("Piyapong Senanut","P002", "1984","Thamyai");
        person3 = new police("kosan","O003","1996","nabon");

        person1.introduce();
        person2.introduce();
        person3.introduce();

    }
}
