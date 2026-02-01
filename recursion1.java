
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
