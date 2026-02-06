
import java.util.*;

class Codechef {
    static boolean sorted(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        return arr[idx] < arr[idx + 1] && sorted(arr, idx + 1); // next idx se check
    }

    public static void main(String args[]) {
        // int arr[] = { 1, 20, 4, 6, 10, 90, 100 , 101};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println(sorted(arr, 0));
    }
}
