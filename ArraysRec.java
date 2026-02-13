
// import java.util.*;

class Codechef {
    // static boolean sorted(int arr[], int idx) {
    // if (idx == arr.length - 1) {
    // return true;
    // }
    // return arr[idx] < arr[idx + 1] && sorted(arr, idx + 1); // next idx se check
    // }

    static boolean sorted(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }

        if (arr[idx] >= arr[idx + 1]) {
            return false;
        }
        return sorted(arr, idx + 1);
    }

    public static void main(String args[]) {
        int arr[] = { 12, 300, 890 };
        System.out.println(sorted(arr, 0));
    }
}
