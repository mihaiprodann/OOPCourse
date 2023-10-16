import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IOException {
        Person[] persons ={
                new Person("George", LocalDate.of(1970,1,1),'m'),
                new Person("John", LocalDate.of(1970,1,1),'m'),
                new Person("George", LocalDate.of(1980,1,1),'m'),
                new Person("George", LocalDate.of(1980,1,1),'m'),
                new Person("George", LocalDate.of(1970,1,1),'f'),
        };
        String filename = "persons.txt";
        PrintWriter writer = new PrintWriter(new FileWriter(filename));
        writer.print("");
        for (Person p: persons) {
            System.out.println(p);
            p.store(filename);
        }
    }
}
