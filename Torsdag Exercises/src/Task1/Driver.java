package Task1;

public class Driver {
    //1.a
    private String name;
    private int age;


    //1.b constructor
    public Driver(String name, int age){
        this.name = name;
        this.age = age;

    }
    //1.g
    @Override
    public String toString() {
        return "is driven by " + name;
    }
}
