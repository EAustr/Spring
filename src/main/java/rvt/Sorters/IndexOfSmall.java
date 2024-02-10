package rvt.Sorters;

public class IndexOfSmall {
    public static int indexOfSmallest(int[] array){

        int smallestIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[smallestIndex]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;        
    }
}
