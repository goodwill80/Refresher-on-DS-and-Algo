package DataAlgo.SortingAlgo;

public class BasicSorting {

    // BubbleSort
    public static int[] bubbleSort(int[] array) {
        for(int i = array.length - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    // SelectionSort
    public static int[] selectionSort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int minIndex = i; // reset to i after every inner loop
            for(int j = i + 1; j < array.length; j++) {
                if(array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if(i != minIndex) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
        return array;
    }

    // Insertion Sort
    public static int[] insertionSort(int[] array) {
        for(int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1; // item before i
            while(j > -1 && temp < array[j]) {
                array[j+1] = array[j];
                array[j] = temp;
                j--;
            }
        }
        return array;
    }

}
