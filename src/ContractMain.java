import java.util.Arrays;

public class ContractMain {
    public static void main(String[] args) {
        Contract contract = new Contract(5);
        contract.addCourse(new Course("DSA", Course.Type.FOUNDAMENTAL, Course.Stream.ENGLISH, 6));
        contract.addCourse(new Course("OOP", Course.Type.FOUNDAMENTAL, Course.Stream.ENGLISH, 3));
        contract.addCourse(new Course("DB", Course.Type.DISCIPLINE, Course.Stream.GERMAN, 1));
        contract.addCourse(new Course("SM", Course.Type.FOUNDAMENTAL, Course.Stream.FRENCH, 5));
        contract.addCourse(new Course("PLM", Course.Type.SPECIALIZATION, Course.Stream.GERMAN, 78));

        System.out.println("Unsorted contract:");
        contract.display();

        Arrays.sort(contract.courses);
        System.out.println("\n\n\nSorted contract:");
        contract.display();

        contract.deleteCourse(Course.Type.FOUNDAMENTAL, Course.Stream.ENGLISH, "DSA");
        System.out.println("\n\n\n[After deleting DSA]");
        contract.display();

        contract.store("courses.txt");
    }
}
