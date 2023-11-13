import java.sql.SQLOutput;
import java.util.*;
import java.time.LocalDate;

public class EmployeeList {
    public static void main(String[] args){
        ArrayList<Employee> employeeList=new ArrayList<>();
        for (int i=0; i<10; i++){
            int rand = (int) (Math.random() * 3);
            String specialization;
            if (rand % 3 == 0) {
                specialization = "Engineer";
            }
            else if (rand % 3 == 1) {
                specialization = "Manager";
            }
            else {
                specialization = "Tester";
            }
            employeeList.add(new Employee("Employee", "123456789", LocalDate.of(2021,01,26), specialization, 1000));
        }

        System.out.println("Initial list: ");
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }


        ListIterator<Employee> listIterator=employeeList.listIterator(employeeList.size());
        while (listIterator.hasPrevious()){
            Employee employee=listIterator.previous();
            if (employee.getSpecialization().equals("Manager")){
                employeeList.add(employeeList.size()/2, new Employee("Employee "+(employeeList.size()/2), "123456789", LocalDate.of(2021,01,26), "Junior Tester", 3000));
                break;
            }
        }

        System.out.println("\nList after adding an element at the middle: ");
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }


        HashSet<Employee> employeeHashSet=new HashSet<>(employeeList);


        Iterator<Employee> iterator=employeeHashSet.iterator();
        System.out.println("\nSet: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }


        TreeSet<Employee> employeeTreeSet=new TreeSet<>(employeeList);
        System.out.println("\nTreeSet: ");
        for (Employee employee : employeeTreeSet) {
            System.out.println(employee.toString());
        }
    }
}
