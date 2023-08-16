public class ArrayRevers {

    public static void reverse(int my_array[]) {

        int start = 0;
        int last = my_array.length - 1;
        while (start < last) {
            int temp = my_array[last];
            my_array[last] = my_array[start];
            my_array[start] = temp;

            start++;
            last--;
        }
    }

    public static void main(String[] args) {
        int my_array[] = { 1, 5, 6, 9, 8 };

        reverse(my_array);

        for (int i = 0; i < my_array.length; i++) {

            System.out.print(my_array[i] + " ");
        }

    }

}
