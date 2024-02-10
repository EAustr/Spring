package rvt.Sorters;

public class Sorter {

    public static int smallest(int[] array) {
        int maz = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < maz) {
                maz = array[i];
            }
        }
        return maz;
    }

    
    
}
