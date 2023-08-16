//import java.util.*;

public class LargestNumber {

    public static int getlargest(int my_array[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < my_array.length; i++) {
            if (largest < my_array[i]) {

                largest = my_array[i];

            }

        }
        return largest;
    }

    public static void main(String[] args) {

        int my_array[] = { 45, 78, 89, 5, 6 };
        int result = getlargest(my_array);

        System.out.println("largest element of arary is : " + result);

    }

}
