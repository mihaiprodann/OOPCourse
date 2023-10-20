import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        // PERSONS
        Person[] persons ={
            new Person("George", LocalDate.of(1970,1,1),'m'),
            new Person("John", LocalDate.of(1970,1,1),'m'),
            new Person("George", LocalDate.of(1980,1,1),'m'),
            new Person("George", LocalDate.of(1980,1,1),'m'),
            new Person("George", LocalDate.of(1970,1,1),'f'),
        };
        String personsFile = "persons.txt";
        PrintWriter writer = new PrintWriter(new FileWriter(personsFile));
        writer.print("");
        System.out.println("-------PERSONS-------");
        for (Person p: persons) {
            System.out.println(p);
            p.store(personsFile);
        }
        System.out.println("---------------------");


        // ACCOUNT
        Account[] accounts = {
            new DebitAccount("RO1111", 15400),
            new DebitAccount("RO3333", 15400),
            new DebitAccount("RO2222", 15400),
            new CreaditAccount("RO0000", 15400, 1000),
            new CreaditAccount("RO4444", 15400, 1000),
            new CreaditAccount("RO5555", 15400, 1000),
            new CreaditAccount("RO0000", 15400, 1000),
            new DebitAccount("RO0000", 124134),
        };

        System.out.println("-------ACCOUNTS-------");
        for (Account aThat: accounts){
            System.out.println(aThat);
        }
        System.out.println("---------------------");
        Arrays.sort(accounts);
        System.out.println();
        System.out.println("-------ACCOUNTS AFTER SORTING-------");
        for(Account aThat: accounts){
            System.out.println(aThat);
        }
        System.out.println("------------------------------------");


    }
}
