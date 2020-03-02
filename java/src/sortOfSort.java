public class sortOfSort {

    public static void sortOfSort(int[] array) {
        int count = 0;
        int temp;

        for (int i = 0; i < array.length; i++) {
            if (count <= 2) {
                if(i + 1 < array.length) {
                    if (array[i] > array[i + 1]) {
                        temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                        count++;
                    }
                }
            }
        }


    }
}
