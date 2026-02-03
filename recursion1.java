
// class Main {
// public static void message() {
// System.out.println("Hello World");
// }

// static void mesg() {
// System.out.println("Hello World");
// }

// public static void main(String args[]) {
// message();
// mesg();

// }
// }

// class Main { // function call stack
// static void mesg() {
// System.out.println("hello");
// mesg1();
// }

// static void mesg1() {
// System.out.println("hi");
// mesg2(); // function is calling another function
// }

// static void mesg2() {
// System.out.println("hey");
// }

// public static void main(String args[]) {
// mesg();
// }
// }

// q.) print no's 1 2 3 4 5 BY USING FUNCTION CALL STACK

// class Main {
// static void print1(int n) {
// System.out.println(n);
// print2(n + 1); // print2(2)
// }

// static void print2(int n) {
// System.out.println(n);
// print3(n + 1); // print3(3)
// }

// static void print3(int n) {
// System.out.println(n);
// print4(4); // print4(4)
// }

// static void print4(int n) {
// System.out.println(n);
// print5(5);
// }

// static void print5(int n) {
// System.out.println(n);
// }

// public static void main(String args[]) {
// print1(1);
// }
// }

// q.) print no's 1 2 3 4 5 BY USING RECURSION

// class Main {
// public static void print_num(int n) {
// if (n == 10) {
// System.out.println(n); /// base condition
// return;
// }
// System.out.println(n); // body
// print_num(n + 1); // n = 2 -> 4 -> 8 -> 16 // recursive call
// }

// public static void main(String args[]) {
// print_num(1);
// }
// }

// class Main {
// public static void print_num(int n) {
// if (n > 8) {
// // System.out.println(n);
// return;
// }
// System.out.println(n);
// print_num(n * 2); // n = 2 -> 4 -> 8 -> 16
// }

// public static void main(String args[]) {
// print_num(2);
// }
// }

// q.) print nth fibonacci number

import java.util.Scanner;

// class Main {
// public static int fibonacci(int n) {
// // if (n < 2) {
// // return n;
// // }
// if (n == 0) {
// return 0;
// }
// if (n == 1) {
// return 1;
// }
// return fibonacci(n - 1) + fibonacci(n - 2);
// }

// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// System.out.println(fibonacci(n));
// }
// }

// q.) binary seaarch

// class Codechef {
// static int binarySearch(int arr[], int target, int st, int end) {
// if (st > end) {
// return -1;
// }
// int mid = st + (end - st) / 2;

// if (arr[mid] == target) {
// return mid;
// }
// if (target > arr[mid]) {
// return binarySearch(arr, target, mid + 1, end);
// }
// return binarySearch(arr, target, st, mid - 1);
// }

// public static void main(String args[]) {
// int arr[] = { 1, 34, 56, 78, 88, 90, 99 };
// int target = 990;
// System.out.println(binarySearch(arr, target, 0, arr.length - 1));
// }
// }

// import java.util.*;

// q.) print numbers from n to 5 using recursion

// class Codechef {
// public static void print_Num(int n) {
// if (n == 5) {
// return;
// }
// System.out.println(n);
// print_Num(n - 1);
// // System.out.println(n);
// }

// public static void main(String args[]) {
// // Scanner sc = new Scanner(System.in);
// // int n = sc.nextInt();
// print_Num(10);
// }
// }

// q.) print n to 5 and back to n O(n)

// class Main {
// static void fun(int n) {
// if (n == 0) {
// return;
// }
// System.out.println(n);
// fun(n - 1);
// }

// static void funRev(int n) {
// if (n == 0) {
// return;
// }
// funRev(n - 1);
// System.out.println(n);
// }

// static void funBoth(int n) {
// if (n == 0) {
// return;
// }

// System.out.println(n); // 🔴 before call → descending
// funBoth(n - 1);
// System.out.println(n); // 🟢 after call → ascending
// }

// public static void main(String args[]) {
// funBoth(5);
// }
// }

// q.) factorial using recursion

// class Main {
// static int fact(int n) {
// if (n == 0) {
// return 1;
// }
// if (n == 1) {
// return 1;
// }
// return n * fact(n - 1);
// }

// public static void main(String args[]) {
// int ans = fact(5);
// System.out.println(ans);
// }
// }

// q.) sum of n natural numbers using recursion
// class Main {
// static int sumN(int n) {
// if (n == 0) {
// return 0;
// }
// return n + sumN(n - 1); // 5 + sumN(4)
// // 4 + sumN(3)
// // 3 + sumN(2)
// // 2 + sumN(1)
// }

// public static void main(String args[]) {
// int ans = sumN(5);
// System.out.println(ans);
// }
// }

// q.) sum of a digit

// class Main {
// static int sumofdigits(int n){
// if (n == 0){
// return 0;
// }
// return (n % 10) + sumofdigits(n/10);
// }
// public static void main (String args[]){
// int ans = sumofdigits(1342);
// System.out.println(ans);
// }
// }

// q.) product of a digit

// class Main {
// static int sumofdigits(int n) {
// if (n % 10 == n) {
// return n;
// }
// return (n % 10) * sumofdigits(n / 10);
// }

// public static void main(String args[]) {
// int ans = sumofdigits(134);
// System.out.println(ans);
// }
// }

// n-- VS --n in recursion

// class Codechef {
// static void fun(int n) {
// if (n == 0) {
// return;
// }
// System.out.println(n);
// fun(--n);
// // fun(n--); // Infinite times chlta jayega
// }

// public static void main(String args[]) {
// fun(5);
// }
// }

// q.) Reverse a number

// class Main {
// public static void main (String args[]){
// int n = 1234;
// int rev = 0;
// if (n == 0){
// return ;
// }
// while (n != 0){
// int digit = n % 10;
// rev = rev * 10 + digit;
// n = n/10;
// }
// System.out.println(rev);
// }
// }

// q.) Reverse a number using recursion

// class Main {
// static int reverse = 0;

// static void reverseNum(int n) {
// if (n == 0) {
// return;
// }

// int digit = n % 10;
// reverse = reverse * 10 + digit;
// reverseNum(n / 10);
// }

// public static void main(String[] args) {
// System.out.println(reverseNum(1234));
// }
// }

// q.) check palindrome simple

// class Main {
// public static void main(String args[]) {
// int n = 1210;
// int rev = 0;
// // int temp = n;
// int Original = n;
// while (n != 0) {
// int digit = n % 10;
// rev = rev * 10 + digit;
// n = n / 10;
// }
// if (rev == Original) {
// System.out.println("yes");
// } else {
// System.out.println("No");
// }
// }
// }

// q.) check palindrome using recursion

// class Main {

// static int reverse(int n, int rev) {
// if (n == 0) {
// return rev;
// }
// return reverse(n / 10, rev * 10 + n % 10);
// }

// static boolean isPalindrome(int n) {
// return n == reverse(n, 0);
// }

// public static void main(String[] args) {
// int num = 121;

// if (isPalindrome(num)) {
// System.out.println("Palindrome");
// } else {
// System.out.println("Not Palindrome");
// }
// }
// }

// q.) Count numbers of 0 in a number using recursion

class Main {
    static int count = 0;

    static int count_zero(int n) {
        if (n == 0) {
            return count;
        }
        int digit = n % 10;
        if (digit == 0) {
            count++;
        }
        count_zero(n / 10);
        return count;
    }

    public static void main(String args[]) {
        int ans = count_zero(10203040);
        System.out.println(ans);
    }
}