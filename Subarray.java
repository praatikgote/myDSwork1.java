public class Subarray {

    public static void Cal_Subarray(int my_array[]) {

        int total_subarray = 0;

        int max_sum_subarray = Integer.MIN_VALUE;
        int min_sum_subarray = Integer.MAX_VALUE;
        for (int i = 0; i < my_array.length; i++) {
            int start = i;

            for (int j = i; j < my_array.length; j++) {
                int end = j;
                // calculate the sum of each subarray also;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    sum += my_array[k];
                    System.out.print(my_array[k] + " ");
                }

                total_subarray++;

                System.out.println("");

                System.out.println("sum of subarray is: " + sum);

                // calculate max and min sum of subarray

                if (sum > max_sum_subarray) {

                    max_sum_subarray = sum;

                }
                if (sum < min_sum_subarray) {

                    min_sum_subarray = sum;

                }

            }

            System.out.println("");

        }

        System.out.println("Total number of subarray = : " + total_subarray);

        System.out.println("minimum sum of subarray is : " + min_sum_subarray + "maximum sum of subarray is : "
                + max_sum_subarray);
    }

    public static void main(String[] args) {
        int my_array[] = { 2, 4, 6, 8, 10 };
        Cal_Subarray(my_array);
    }
}