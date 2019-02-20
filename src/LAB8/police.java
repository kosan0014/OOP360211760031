package LAB8;

public class police extends Person {
    private String workCoutry;

    public police(String name, String pid, String bornYear, String workCoutry) {
        super(name, pid, bornYear);
        this.workCoutry = workCoutry;
    }

    public void introduce() {
        super.introduce();
        System.out.println("I'am police work at "+this.workCoutry);
    }

    public String getworkCoutry() {
        return workCoutry;
    }

    public void setworkCoutry(String workCoutry) {
        this.workCoutry = workCoutry;
    }

}
