package LAB8;

public class Sheriff extends Person {
    private String workState;

    public Sheriff(String name, String pid, String bornYear, String workState) {
        super(name, pid, bornYear);
        this.workState = workState;
    }

    public void introduce() {
        super.introduce();
        System.out.println("I'am sherff work at "+this.workState);
    }

    public String getWorkState() {
        return workState;
    }

    public void setWorkState(String workState) {
        this.workState = workState;
    }

}
