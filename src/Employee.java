import java.time.LocalDate;
import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private String name;
    private String CNP;
    private LocalDate hiringDate;
    private String specialization;
    private double salary;

    public Employee(String name, String CNP, LocalDate hiringDate, String specialization, double salary){
        this.name=name;
        this.CNP=CNP;
        this.hiringDate=hiringDate;
        this.specialization=specialization;
        this.salary=salary;
    }

    public int hashCode() {
        return Objects.hash(name, CNP, hiringDate, specialization, salary);
    }

    @Override
    public String toString() {
        return "Employee: " +
                "name= " + name  +
                ", CNP= " + CNP  +
                ", hiringDate= " + hiringDate  +
                ", specialization= " + specialization  +
                ", salary=" + salary;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null||getClass()!=o.getClass()) return false;
        Employee employee=(Employee) o;
        return Double.compare(employee.salary, salary)==0 &&
                Objects.equals(name, employee.name) &&
                Objects.equals(CNP, employee.CNP) &&
                Objects.equals(hiringDate, employee.hiringDate) &&
                Objects.equals(specialization, employee.specialization);
    }
    @Override
    public int compareTo(Employee o){
        if (o == null){
            throw new Error("(!) Comparing with null.");
        }
        int nameComparison = this.name.compareTo(o.name);
        if (nameComparison != 0){
            return nameComparison;
        }
        int cnpComparison = this.CNP.compareTo(o.CNP);
        if (cnpComparison != 0){
            return cnpComparison;
        }
        return Double.compare(this.salary, o.salary);
    }

    public String getSpecialization() {
        return specialization;
    }
}
