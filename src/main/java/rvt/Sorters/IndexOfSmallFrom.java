package rvt.Sorters;

public class IndexOfSmallFrom {

    // public static int[] sort(int[] array){
    //     for (int i = 0; i< array.length; i++){
    //         int IndexOfSmallFrom = IndexOfSmallFrom(array, i);
    //         swap(array, i, IndexOfSmallFrom);
    //     }
    //     return array;
    // }
    
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int smallestIndex = startIndex;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < array[smallestIndex]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }   
}