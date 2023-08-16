public class Trapped_Water {

    public static int find_Trappedwater(int my_height[]) {

        int n = my_height.length;

        // find first left max heights

        int max_left[] = new int[n];
        max_left[0] = my_height[0];

        for (int i = 1; i < n; i++) {
            max_left[i] = Math.max(my_height[i], max_left[i - 1]);
        }

        // find right max heights

        int max_right[] = new int[n];
        max_right[n - 1] = my_height[n - 1];

        for (int i = n - 2; i >= 0; i--) {

            max_right[i] = Math.max(my_height[i], max_right[i + 1]);
        }

        int TrappedWater = 0;
        for (int i = 0; i < n; i++) {
            // waterlavel = min(riht_height , lef_height)
            int water_lavel = Math.min(max_left[i], max_right[i]);

            // traped water =( water_lavel - height ) * weidth(1);

            TrappedWater += water_lavel - my_height[i];

        }

        return TrappedWater;

    }

    public static void main(String[] args) {
        int my_height[] = { 4, 2, 0, 6, 3, 2, 5 };

        System.out.println(find_Trappedwater(my_height));
    }
}
