import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLOutput;
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
        String filename = "persons.txt";
        PrintWriter writer = new PrintWriter(new FileWriter(filename));
        writer.print("");
        System.out.println("-------PERSONS-------");
        for (Person p: persons) {
            System.out.println(p);
            p.store(filename);
        }
        System.out.println("---------------------");


        // ACCOUNT
        Account[] accounts = {
            new Account("RO3533400",234),
            new Account("RO5341253",2465),
            new Account("RO5134153",124),
            new Account("RO5367893",675),
            new Account("RO5323453",34),
            new Account("RO5355555",897),
            new Account("RO5787777",245)
        };


        for (Account aThat: accounts){
            System.out.println(aThat.getIBAN());
        }
        System.out.println("---------------------");
        Arrays.sort(accounts);
        for(Account aThat: accounts){
            System.out.println(aThat.getIBAN());
        }

        Account account = new Account("123456789", 15400);
        account.store("account.txt");
        System.out.println("Account information stored in 'account.txt'");

    }
}
