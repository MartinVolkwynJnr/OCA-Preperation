package Chapter_4;

public class CreatingConstructors {
    private String s1;
    private int i1;

    public CreatingConstructors(){
        this("",3);
    }

    public CreatingConstructors(String s1, int i1) {
        this.s1 = s1;
        this.i1 = i1;
    }
}
