package rvt;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Arrays;
import rvt.Sorters.IndexOfSmall;
import rvt.Sorters.Sorter;
import rvt.Sorters.Swap;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        
        SpringApplication.run(App.class, args);

        //Money();
        // Sorter();
        // IndexOfSmall();
        // IndexOfSmallFrom();
        // Swap();
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
}
