
// import java.util.*;

// 1.) Checks sorted or not

// class Codechef {
// static boolean sorted(int arr[], int idx) {
// if (idx == arr.length - 1) {
// return true;
// }
// return arr[idx] < arr[idx + 1] && sorted(arr, idx + 1); // next idx se check
// }

// /*
// * static boolean sorted(int arr[], int idx) {
// * if (idx == arr.length - 1) {
// * return true;
// * }
// *
// * if (arr[idx] >= arr[idx + 1]) {
// * return false;
// * }
// * return sorted(arr, idx + 1);
// * }
// */

// public static void main(String args[]) {
// int arr[] = { 12, 300, 890 };
// System.out.println(sorted(arr, 0));
// }
// }

// 2.) checks from front if the target el is equal to which index and return its
// index

// class Main {
// static int find(int arr[], int target, int index) { // static int hai
// if (index == arr.length) { // last idx ke ek next mtlb array ke bhr
// return -1;
// }
// if (arr[index] == target) {
// return index; // jis bhi idx pr vo element hai
// } else {
// return find(arr, target, index + 1);
// }
// }

// public static void main(String args[]) {
// int arr[] = { 2, 56, 190, 100, 89, 190 };
// int target = 190;
// int result = find(arr, target, 0); // front se check
// // int result = find(arr, target, arr.length - 1); // back se check
// System.out.println(result);
// }
// }

// 3.) checks from back if the target el is equal to which index and return its
// index

/*
 * class Main {
 * static int find(int arr[], int target, int index) {
 * if (index < 0) {
 * return -1;
 * }
 * if (arr[index] == target) {
 * return index; // jis bhi idx pr vo element hai
 * } else {
 * return find(arr, target, index - 1); // -1 -1 -1 back back back
 * }
 * }
 * 
 * public static void main(String args[]) {
 * int arr[] = { 2, 56, 190, 100, 89, 190};
 * int target = 190;
 * int result = find(arr, target, arr.length-1); // back se check
 * System.out.println(result);
 * }
 * }
 */

// 4.) checks and returns boolean ans

// class Main {
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

// public static void main(String args[]) {
// int arr[] = { 2, 56, 190, 100, 89, 190 };
// int target = 190;
// int result = findindex(arr, target, 0); // front se check
// System.out.println(result);
// }
// }

// 5.) finding index from last by using arraylist

// import java.util.*;

/*
 * class Main {
 * static ArrayList<Integer> list = new ArrayList<>();
 * 
 * static void lastIndex(int[] arr, int target, int index) {
 * if (index < 0)
 * return;
 * 
 * if (arr[index] == target)
 * list.add(index);
 * lastIndex(arr, target, index - 1); // -1 -1 hote 0 ko corss kr jaygea when it
 * reaches -1 then it will return
 * }
 * 
 * public static void main(String[] args) {
 * int[] arr = { 1, 4, 6, 7, 4, 8, 4 };
 * lastIndex(arr, 4, arr.length - 1); // last element
 * System.out.print(list);
 * }
 * }
 */

// 6.) Finding index from first and push them into a list

// import java.util.ArrayList;
/*
 * // class Main {
 * // static ArrayList<Integer> list = new ArrayList<>();
 * // static void find(int arr[], int target, int index) {
 * // if (index == arr.length) {
 * // return;
 * // }
 * // if (arr[index] == target) {
 * // list.add(index);
 * // }
 * // find(arr, target, index + 1);
 * // }
 * 
 * // public static void main(String args[]) {
 * // int arr[] = { 12, 99, 90, 78, 65, 99, 100, 99 };
 * // int target = 99;
 * // find(arr, target, 0);
 * // System.out.println(list);
 * // }
 * // }
 */

// 7.) add all elements in arrayList
/*
 * // class Main {
 * // static ArrayList<Integer> findAllIndex(int[] arr, int target, int index,
 * // ArrayList<Integer> list) {// {arr,[]}
 * // if (index == arr.length) {
 * // return list; // return bhi list hi krege
 * // }
 * // if (arr[index] == target) {
 * // list.add(index);
 * // }
 * // return findAllIndex(arr, target, index + 1, list); // pass by value by the
 * // reference
 * // }
 * 
 * // public static void main(String[] args) {
 * // int[] arr = { 1, 2, 3, 4, 5, 4, 6, 7, 4, 8 };
 * // System.out.println(findAllIndex(arr, 4, 0, new ArrayList<>())); //
 * arguments
 * // }
 * // }
 */

// 8.) When all referencing var not pointing to the same obj then we can use
// this approach
// like when we going donwn the stack every time new list is being created with
// updated ans not the same list is being updated with previous answers

/*
 * // class Main {
 * // static ArrayList<Integer> findAllindex(int arr[], int target, int index,
 * // ArrayList<Integer> list) {
 * // // ArrayList<Integer> list = new ArrayList<>();
 * 
 * // if (index == arr.length) {
 * // return list;
 * // }
 * // if (arr[index] == target) {
 * // list.add(index);
 * // }
 * // ArrayList<Integer> ansFromBelowCalls = findAllindex(arr, target, index +
 * 1);
 * // list.addAll(ansFromBelowCalls); // add all the elements of
 * ansFromBelowCalls
 * // to list
 * // return list;
 * // }
 * 
 * // public static void main(String args[]) {
 * // int arr[] = { 12, 99, 90, 78, 65, 99, 100, 99 };
 * // int target = 99;
 * // System.out.println(findAllindex(arr, target, 0));
 * // }
 * // }
 */

// 9.) Rotated Binary Search

/*
 * // class Codechef {
 * // static int search(int arr[], int target, int st, int end) {
 * // // Base case
 * // if (st > end) {
 * // return -1;
 * // }
 * 
 * // int mid = st + (end - st) / 2;
 * 
 * // // Target mil gaya
 * // if (arr[mid] == target) {
 * // return mid;
 * // }
 * 
 * // // 🔹 Check karo kaunsa half sorted hai
 * 
 * // // Left half sorted
 * // if (arr[st] <= arr[mid]) {
 * 
 * // // Target left range me hai?
 * // if (target >= arr[st] && target < arr[mid]) {
 * // return search(arr, target, st, mid - 1);
 * // }
 * // // Warna right me
 * // else {
 * // return search(arr, target, mid + 1, end);
 * // }
 * // }
 * 
 * // // 🔹 Right half sorted
 * 
 * // else {
 * // // Target right range me hai?
 * // if (target > arr[mid] && target <= arr[end]) {
 * // return search(arr, target, mid + 1, end);
 * // }
 * // else {
 * // return search(arr, target, st, mid - 1);
 * // }
 * // }
 * // }
 * 
 * // public static void main(String args[]) {
 * 
 * // int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
 * 
 * // int target = 0;
 * 
 * // int result = search(arr, target, 0, arr.length - 1);
 * 
 * // System.out.println(result);
 * // }
 * // }
 */

// SORTING BEGINS HERE

// import java.util.Scanner;

// 10.) Bubble sort

// class Main {

// static void bubbleSort(int arr[], int n) {
// if (n == 1) { // if arr me 1 element h that means arr sorted hai
// return;
// }

// for (int i = 0; i < n - 1; i++) {
// if (arr[i] > arr[i + 1]) {
// int temp = arr[i];
// arr[i] = arr[i + 1];
// arr[i + 1] = temp;
// }
// }
// bubbleSort(arr, n - 1); // recursive call
// // last elment sort ho chuka and the largest element reaches at its position
// // therefore we check with next recursive call n-1
// // n = 5, 4, 3 and at last when n reaches 1 then return
// }

// public static void main(String[] args) {
// int arr[] = { 5, 3, 8, 4, 2 };

// bubbleSort(arr, arr.length);

// System.out.println("Sorted array:");
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }
// }

// import java.util.Scanner;

/*
 * class Main {
 * 
 * static void bubbleSort(int arr[], int n) {
 * if (n == 1) {
 * return;
 * }
 * 
 * for (int i = 0; i < n - 1; i++) {
 * if (arr[i] > arr[i + 1]) {
 * int temp = arr[i];
 * arr[i] = arr[i + 1];
 * arr[i + 1] = temp;
 * }
 * }
 * 
 * bubbleSort(arr, n - 1);
 * }
 * 
 * public static void main(String args[]) {
 * 
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.println("Enter size:");
 * int n = sc.nextInt();
 * 
 * int arr[] = new int[n];
 * 
 * System.out.println("Enter elements:");
 * for (int i = 0; i < n; i++) {
 * arr[i] = sc.nextInt();
 * }
 * 
 * bubbleSort(arr, n);
 * 
 * System.out.println("Sorted array:");
 * for (int i = 0; i < n; i++) { // i = arr.length
 * System.out.print(arr[i] + " ");
 * }
 * }
 * }
 */

// 11.) Selection sort 

// class Main {
//     static void SelectionSort(int arr[], int n, int index) {
//         if (index == n - 1) { // n = 5 and , index == 4 it means last element already sorted
//             return; // beacause small elements move towards left thereferore larger one rest beside
//         }

//         int minIndex = index;

//         for (int i = index + 1; i < n; i++) {
//             if (arr[i] < arr[minIndex]) {
//                 minIndex = i;
//             }
//         }
//         int temp = arr[index];
//         arr[index] = arr[minIndex];
//         arr[minIndex] = temp;

//         SelectionSort(arr, n, index + 1);
//     }

//     public static void main(String args[]) {
//         int arr[] = { 5, 3, 8, 4, 2 };
//         int n = arr.length;

//         SelectionSort(arr, n, 0);

//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }\

//12.) Merge sort 
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;

        int left[] = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int right[] = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    public static int[] merge(int left[], int right[]) {
        int mix[] = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mix[k] = left[i];
                i++;
            } else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            mix[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;
    }

    public static void main(String args[]) {
        int[] arr = { 8, 3, 4, 12, 6, };
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
