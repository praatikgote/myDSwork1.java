//import java.util.*;

public class Binarry_Search {

    public static int findbinnary(int array[], int key) {
        int start = 0, end = array.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == key) {
                return mid;
            }

            if (array[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {

        int array[] = { 4, 5, 9, 16, 75, 85, 96 };
        int key = 85;
        System.out.println("at the index: " + findbinnary(array, key));

    }
}
