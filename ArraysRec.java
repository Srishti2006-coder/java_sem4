
import java.util.*;

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
