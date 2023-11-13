import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmpMain2 {
    public static void main(String[] args) {
        ArrayList<Employee2> employeeList = new ArrayList<>();
        employeeList.add(new Employee2("Andrei",24));
        employeeList.add(new Employee2("Alina",30));
        employeeList.add(new Employee2("Bianca",21));
        employeeList.add(new Employee2("Andreea",34));
        employeeList.add(new Employee2("Cristi",41));
        employeeList.add(new Employee2("Elena",23));
        employeeList.add(new Employee2("Alin",24));
        Map<String, Employee2> employeeMap = new HashMap<>();
        for (Employee2 employee : employeeList) {
            employeeMap.put(employee.getName(), employee);
        }
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a name to find corresponding employee: ");
        String inputName=scanner.nextLine();
        Employee2 foundEmployee=employeeMap.get(inputName);
        if (foundEmployee!=null){
            System.out.println("Employee found: " + foundEmployee.toString());
        }
        else{
            System.out.println("Employee not found for the given name.");
        }
    }
}
