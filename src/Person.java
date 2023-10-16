import java.io.*;
import java.time.LocalDate;
import java.util.Arrays;

public class Person implements Comparable, Storable{
    //first by name, if names are equal then bday, if bdays are equal
    // then age
    String name;
    LocalDate bday;
    char gender;

    public Person(String name, LocalDate bday, char gender) {
        this.name = name;
        this.bday = bday;
        this.gender = gender;
    }
    public int compareTo(Object ot){
        if(this == ot)
            return 0;
        Person p = (Person) ot;
        if (name.compareTo(p.name) != 0)
            return name.compareTo(p.name);
        //names are equal
        if(bday.compareTo(p.bday) != 0)
            return bday.compareTo(p.bday);
        // names AND bday are equal
        return gender-p.gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", bday=" + bday.getYear() + " "+bday.getMonth().toString()+
                ", gender=" + gender +
                '}';
    }
    @Override
    public void store(String filename) {
        try
        {
            FileWriter fw = new FileWriter(filename, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.newLine();
            bw.write(this.toString());
            bw.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

}
