public class Pair {

    public static void cal_pair(int my_array[]) {

        int total_pair = 0;
        for (int i = 0; i < my_array.length; i++) {

            int current = my_array[i];

            for (int j = i + 1; j < my_array.length; j++) {

                System.out.print("(" + current + "," + my_array[j] + ")");
                total_pair++;

            }
            System.out.println("");

        }

        System.out.println("Total pairs=" + total_pair);
    }

    public static void main(String[] args) {
        int my_array[] = { 2, 4, 6, 8, 10 };

        cal_pair(my_array);
    }

}
