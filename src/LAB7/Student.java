package LAB7;

public class Student {
    //class private
    private String id;
    private String name;
    private int age;
    //constructer
    public  Student(){}
    public Student (String id,String name,int age){
        this.id = id;
        this.name = name;
        this.age = age;

    }
      //getter and setter methods
      //getter -> อ่านข้อมูลจาก prop
        //

    public  String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getage(){
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
