
// import java.util.*;

// 1.) Checks sorted or not

// class Codechef {
// static boolean sorted(int arr[], int idx) {
// if (idx == arr.length - 1) {
// return true;
// }
// return arr[idx] < arr[idx + 1] && sorted(arr, idx + 1); // next idx se check
// }

// static boolean sorted(int arr[], int idx) {
// if (idx == arr.length - 1) {
// return true;
// }

// if (arr[idx] >= arr[idx + 1]) {
// return false;
// }
// return sorted(arr, idx + 1);
// }

// public static void main(String args[]) {
// int arr[] = { 12, 300, 890 };
// System.out.println(sorted(arr, 0));
// }
// }

// 2.) checks if the target el is equal to which index

class Main {
    static int find(int arr[], int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index; // jis bhi idx pr vo element hai
        } else {
            return find(arr, target, index + 1);
        }
    }

    // static boolean findindex(int arr[], int target, int index) {
    // if (index == arr.length - 1) {
    // return false;
    // }
    // if (arr[index] == target) {
    // return true;
    // } else {
    // return findindex(arr, target, index + 1);
    // }
    // }

    public static void main(String args[]) {
        int arr[] = { 2, 56, 100, 190, 89 };
        int target = 1000;
        int result = find(arr, target, 0);
        System.out.println("found at index : " + result);
    }
}
