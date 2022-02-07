package searchalgorithms.binarysearch;

import arrayhelper.ArrayHelper;

//Binary search works much more efficient, but this algorithm needs sorted list
public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        bs.binarySearch(ArrayHelper.SORTED_ARRAY_OF_INT, 55);
    }

    public int binarySearch(int[] array, int searchNumber) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        while (startIndex <= endIndex) {
            int midIndex = (startIndex + endIndex) / 2;
            if (array[midIndex] == searchNumber) {
                System.out.println("Search number is on " + midIndex + " index of array");
                return midIndex;
            } else if (array[midIndex] < searchNumber) {
                startIndex = midIndex + 1;
            } else if (array[midIndex] > searchNumber) {
                endIndex = midIndex - 1;
            }
        }
        System.out.println("Number: " + searchNumber + " not found!");
        return -1;
    }
}
