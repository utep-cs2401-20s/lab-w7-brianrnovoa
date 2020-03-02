public class Main extends sortOfSort {
    public static void main(String[] args) {
        int[] testArray = {1, 4, 2, 7, 3};

        System.out.println("Before");
        for(int i = 0; i < testArray.length; i++) {
            System.out.print(testArray[i] + " ");
        }
        System.out.println();
        sortOfSort(testArray);
        System.out.println("After");
        for(int i = 0; i < testArray.length; i++) {
            System.out.print(testArray[i] + " ");
        }


    }
}
