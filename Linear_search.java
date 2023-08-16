import java.util.*;

class Linear_search {

    public static int FindLinearSearch(int linear[], int key) {

        for (int i = 0; i < linear.length; i++) {

            if (linear[i] == key) {
                return i;
            }

        }
        return -1;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Eneter size of array");

        int size = sc.nextInt();

        int linear[] = new int[size];

        for (int i = 0; i < size; i++) {

            linear[i] = sc.nextInt();

        }

        System.out.println("your array is: ");

        for (int i = 0; i < size; i++) {

            System.out.print(linear[i] + " ");
        }

        System.out.println("");

        System.out.println("Enter your key:");

        int key = sc.nextInt();

        int result = FindLinearSearch(linear, key);

        if (result == -1) {
            System.out.println("not found");
        } else {
            System.out.println("Found at index: " + result);
        }

        sc.close();
    }

}