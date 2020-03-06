import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class sortOfSortTester {

    @Test
    // the purpose of this test is to see if it can handle just one element without breaking //
    public void test1 () {
        sortOfSort sOSTest = new sortOfSort();
        int[] array = {1};
        sOSTest.sortOfSort(array);
        int[] expectedArray = {1};
        assertArrayEquals(expectedArray, array);
    }

    @Test
    // the purpose of this test is see if a normal array will get sorted properly //
    public void test2 () {
        sortOfSort sOSTest = new sortOfSort();
        int[] array = {4,2,7,9,1,5};
        sOSTest.sortOfSort(array);
        int[] expectedArray = {5,4,1,2,7,9};
        assertArrayEquals(expectedArray, array);
    }

    @Test
    // the purpose of this test is to see if it sorts duplicates properly and sorts them accordingly //
    public void test3 () {
        sortOfSort sOSTest = new sortOfSort();
        int[] array = {1,1,1,1,2,2,1,2,1,2};
        sOSTest.sortOfSort(array);
        int[] expectedArray = {2,2,1,1,1,1,1,1,2,2};
        assertArrayEquals(expectedArray, array);
    }

    @Test
    // this test is to see if it can sort an odd length array //
    public void test4 () {
        sortOfSort sOSTest = new sortOfSort();
        int[] array = {8,3,7,9,0};
        sOSTest.sortOfSort(array);
        int[] expectedArray = {7,3,0,8,9};
        assertArrayEquals(expectedArray, array);
    }

    @Test
    // this test will see if it can sort negative and zeroes along with non-negative numbers //
    public void test5 () {
        sortOfSort sOSTest = new sortOfSort();
        int[] array = {5,-1,9,11,-5,0,6};
        sOSTest.sortOfSort(array);
        int[] expectedArray = {6,5,-5,-1,0,9,11};
        assertArrayEquals(expectedArray, array);
    }

}
