package searchalgorithms.linearsearch;

import arrayhelper.ArrayHelper;

//Linear search work at same efficiency level with sorted and unsorted list
public class LinearSearch {

    public static void main(String[] args) {
        LinearSearch ls = new LinearSearch();
        ls.linearSearch(ArrayHelper.SORTED_ARRAY_OF_INT, 50);
    }

    public int linearSearch(int[] array, int searchNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchNumber) {
                System.out.println("This is " + (i + 1) + " try");
                return i;
            }
        }
        System.out.println("Didn't found the number");
        return -1;
    }
}
