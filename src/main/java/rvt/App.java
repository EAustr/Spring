package rvt;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.core.net.SyslogOutputStream;

import java.util.ArrayList;
import java.util.Arrays;
import rvt.Sorters.IndexOfSmall;
import rvt.Sorters.Sorter;
import rvt.Sorters.Swap;
import rvt.excercises.Person;
import rvt.excercises.Student;
import rvt.excercises.Teacher;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        
        //SpringApplication.run(App.class, args);

        //Money();
        // Sorter();
        // IndexOfSmall();
        // IndexOfSmallFrom();
        // Swap();
        Person();
    }
    
    public static void Money(){
        Money macins1 = new Money(5, 70);
        Money macins2 = new Money(5, 69);
        Money macins3 = macins1.plus(macins2);
        System.out.println("Maciņš1 + Maciņš2: "+macins3); // 15.91e
        System.out.println("Maciņš1 ir lielāks par Macinš2 " + macins1.less(macins2)); // false
        Money macins4 = macins1.minus(macins2);
        System.out.println("Maciņš1 - Maciņš2: "+macins4); // 4.53e
        System.out.println(macins1.equals(macins4)); // false

    }

    public static void Sorter(){
        int[] array = {8, 3, 7, 9, 1, 2, 4};
        int smallest = Sorter.smallest(array);
        System.out.println("Smallest: " + smallest);
    }

    public static void IndexOfSmall(){
        int[] array = {8, 3, 7, 9, 1, 2, 4};
        int smallestIndex = IndexOfSmall.indexOfSmallest(array);
        System.out.println("Index of smallest: " + smallestIndex);
    }

    public static void IndexOfSmallFrom(){
        int[] array = {8, 3, 7, 9, 1, 2, 4,-1};
        System.out.println(rvt.Sorters.IndexOfSmallFrom.indexOfSmallestFrom(array, 0));
        System.out.println(rvt.Sorters.IndexOfSmallFrom.indexOfSmallestFrom(array, 2));
        System.out.println(rvt.Sorters.IndexOfSmallFrom.indexOfSmallestFrom(array, 5));
    }

    public static void Swap(){
        int [] array = {3, 2, 5, 4, 8};
        // prints the array
        System.out.println(Arrays.toString(array));
        // swaps the index 1 and 0 values in place
        Swap.swap(array, 1, 0);
        System.out.println(Arrays.toString(array));
        // swaps the index 0 and 3 values in place
        Swap.swap(array, 0, 3);
        System.out.println(Arrays.toString(array));
    }

    // RVT Excercises
    // Person and Student
    public static void Person(){
        Person Lauris = new Person("Lauris", "Rīga");
        Student Jānis = new Student("Jānis", "Rīga");

        System.out.println("Studenta  kredīts: " + Jānis.credits());
        Jānis.study();
        System.out.println("Studentu kredīts: " + Jānis.credits());

        Teacher ada = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
        System.out.println(ada);
        System.out.println(esko);

        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");

        int i = 0;
        while (i < 25) {
        ollie.study();
        i = i + 1;
        }
        System.out.println(ollie);
    }

    public static void PersonArray(String[] args) {
    ArrayList<Person> persons = new ArrayList<Person>();
    persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
    persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

    printPersons(persons);
    }
    
    public static void printPersons(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
