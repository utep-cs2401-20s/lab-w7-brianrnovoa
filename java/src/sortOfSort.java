public class sortOfSort {

    public static int findMax(int[] array, int start, int end) {
        int indexOfMax = start;

        for(int i = start; i <= end; i++) {
            if(array[i] >= array[indexOfMax]) {
                indexOfMax = i;
                if(i == end) {
                    return indexOfMax;
                }
            }
        }
        return indexOfMax;
    }

    public static void sortOfSort(int[] array) {
        int start = 0;
        int end = array.length - 1;
        int countSwaps = 0;

        while (start < end) {
            if (countSwaps < 2) {
                int indexOfMax = findMax(array, start, end);
                int temp = array[indexOfMax];
                array[indexOfMax] = array[end];
                array[end] = temp;
                countSwaps++;
                end--;
            }
            else {
                int indexOfMax = findMax(array, start, end);
                int temp = array[indexOfMax];
                array[indexOfMax] = array[start];
                array[start] = temp;
                start++;
                countSwaps++;
            }
            if (countSwaps == 4) {
                countSwaps = 0;
            }
        }
    }
}
