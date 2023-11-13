import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Employee2Main {
    public static void main(String[] args) {

        ArrayList<Employee2> employeeList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            employeeList.add(new Employee2("Employee " + i, i*10));
        }


        Map<String, Employee2> employeeMap = new HashMap<>();
        for (Employee2 employee : employeeList) {
            employeeMap.put(employee.getName(), employee);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = scanner.nextLine();
        if (employeeMap.containsKey(name)) {
            System.out.println(employeeMap.get(name).toString());
        }
        else {
            System.out.println("(!) Employee not found.");
        }
    }
}
