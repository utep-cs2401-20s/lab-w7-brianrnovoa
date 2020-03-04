public class sortOfSort {

    public static void sortOfSort(int[] array) {
        int elements = array.length;
        int index = 0;
        sortOfSortRecursive(array, elements, index);
    }

    public static void swapElements(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void sortOfSortRecursive(int[] array, int elements, int index) {
        int countSwaps = 0;
        int superCount = 0;

        if(index < elements - 1) {
            if (array[index] > array[index + 1]) {
                swapElements(array, index, index + 1);
            }
            else {
                sortOfSortRecursive(array, elements - 1, index + 1);
            }
        }
        if(elements - 1 > 1) {
            sortOfSortRecursive(array, elements - 1, index + 1);
        }

    }










// end of class //
}
