
public class Employee2 {
    private String name;
    private int age;
    public Employee2(String name, int age) {
        this.name = name;
        this.age=age;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Employee: " +
                "name=" + name  +
                ", age=" + age;
    }
}
