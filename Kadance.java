public class Kadance {

    public static void Kandance(int array[]) {

        int max = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < array.length; i++) {
            cs = cs + array[i];
            if (cs < 0) {

                cs = 0;
            }

            max = Math.max(cs, max);

        }

        System.out.println("Maximum sum of sub array is : " + max);

    }

    public static void main(String[] args) {
        int array[] = { -2, -3, 4, -1, -2, 1, 5, -3 };

        Kandance(array);
    }
}
