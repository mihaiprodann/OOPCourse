import java.time.LocalDate;
import java.util.Arrays;

public class Person implements Comparable{
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
        if(this == ot) return 0;
        Person p= (Person) ot;
        if(name.compareTo(p.name)!=0)
            return name.compareTo(p.name);
        //names are equal
        if(bday.compareTo(p.bday)!=0)
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
    public static void main(String[] args) {
        Person[] persons ={
                new Person("George", LocalDate.of(1970,1,1),'m'),
                new Person("John", LocalDate.of(1970,1,1),'m'),
                new Person("George", LocalDate.of(1980,1,1),'m'),
                new Person("George", LocalDate.of(1980,1,1),'m'),
                new Person("George", LocalDate.of(1970,1,1),'f'),
        };
        for(Person p : persons)
            System.out.println(p);
        System.out.println("==========================================");
        Arrays.sort(persons); //this modifies the array
        for(Person p : persons)
            System.out.println(p);
    }

}
