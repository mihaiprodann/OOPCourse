import java.sql.SQLOutput;
import java.util.*;
import java.time.LocalDate;

public class EmployeeList {
    public static void main(String[] args){
        ArrayList<Employee> empList=new ArrayList<>();
        empList.add(new Employee("a", "123456789", LocalDate.of(2022, 01,05), "Engineer", 50000.0));
        empList.add(new Employee("b", "987654321", LocalDate.of(2022,02,01), "Manager", 60000.0));
        empList.add(new Employee("c", "111223344", LocalDate.of(2022,03,12), "Analyst", 45000.0));
        empList.add(new Employee("d", "555667788", LocalDate.of(2022,07,13), "Designer", 55000.0));
        empList.add(new Employee("e", "999000111", LocalDate.of(2022,03,12), "Developer", 70000.0));
        empList.add(new Employee("f", "222333444", LocalDate.of(2022,04,24), "Tester", 48000.0));
        empList.add(new Employee("g", "777888999", LocalDate.of(2022,01,26), "Engineer", 52000.0));
        empList.add(new Employee("h", "444555666", LocalDate.of(2022,06,01), "Manager", 62000.0));
        empList.add(new Employee("i", "666777888", LocalDate.of(2022,11,29), "Analyst", 47000.0));
        empList.add(new Employee("j", "333444555", LocalDate.of(2022,12,14), "Designer", 56000.0));
        //displaying
        System.out.println("Displaying employees");
        Iterator<Employee> empIterator=empList.iterator();
        while(empIterator.hasNext()) {
            Employee employee=empIterator.next();
            System.out.println(employee);//nu e nevoie de toString, se apeleaza automat
        }
        System.out.println("----------------------------------");
        //backwards
        ListIterator<Employee> listIterator = empList.listIterator(empList.size());
        System.out.println("Displaying employees using ListIterator backwards");
        while(listIterator.hasPrevious()){
            Employee employee=listIterator.previous();
            System.out.println(employee);
        }
        System.out.println("-----------------------------------");
        // add an element at the middle
        int middleIndex=empList.size()/2;
        listIterator=empList.listIterator(middleIndex);
        empList.add(middleIndex, new Employee("new", "000000000", LocalDate.of(2022,11,01), "New role", 60000.0));
        // displaying after the new element
        System.out.println("Displaying employees: ");
        empIterator=empList.iterator();
        while(empIterator.hasNext()){
            Employee employee=empIterator.next();
            System.out.println(employee);
        }
        System.out.println("-----------------------------------");
        //adding emp with the same attributes
        empList.add(new Employee("g", "777888999", LocalDate.of(2022,01,26), "Engineer", 52000.0));
        //display with duplicates (we have 2 g)
        System.out.println("Displaying employees with duplicates: ");
        empIterator=empList.iterator();
        while(empIterator.hasNext()){
            Employee employee=empIterator.next();
            System.out.println(employee);
        }
        System.out.println("-----------------------------------");
        //add hash set
        Set<Employee> empSet=new HashSet<>(empList);
        System.out.println("Displaying employees from HashSet");
        Iterator<Employee> setIterator=empSet.iterator();
        while(setIterator.hasNext()){
            Employee employee=setIterator.next();
            System.out.println(employee);
        }
        System.out.println("-----------------------------------");
        //tree set
        TreeSet<Employee> empTreeSet= new TreeSet<>(empList);
        System.out.println("Displaying employees from TreeSet");
        Iterator<Employee> treeSetIterator=empTreeSet.iterator();
        while(treeSetIterator.hasNext()){
            Employee employee = treeSetIterator.next();
            System.out.println(employee);
        }
        //hashset-elementele nu sunt pastrate in vreo ord
        //treeset-sunt stocate in ord
    }
}
