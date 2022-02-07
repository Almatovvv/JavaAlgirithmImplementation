package sortingalgorithms.selectionsort;

import arrayhelper.ArrayHelper;

import java.util.Arrays;


public class SelectionSort {

    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        System.out.println(Arrays.toString(ArrayHelper.UNSORTED_ARRAY_OF_INT));
        System.out.println(Arrays.toString(ss.selectionSort(ArrayHelper.UNSORTED_ARRAY_OF_INT)));
    }

    int[] selectionSort(int[] array) {
        int arraySize = array.length;
        for (int i = 0; i < arraySize - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arraySize; j++) {
                if (array[j] < array[minIndex]) minIndex = j;
            }
            if (minIndex != i) swap(array, i, minIndex);
        }
        return array;
    }

    private void swap(int[] array, int leftIndex, int rightIndex) {
        int temp = array[leftIndex];
        array[leftIndex] = array[rightIndex];
        array[rightIndex] = temp;
    }
}
