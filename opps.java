
// 1.) simple class and objects example

/*
 * class student {
 * String name;
 * int age;
 * 
 * void display() {
 * System.out.println("Name is : " + name);
 * System.out.println("Age is : " + age);
 * System.out.println("Hello World");
 * }
 * 
 * public static void main(String args[]) {
 * student s1 = new student();
 * s1.name = "Srishti";
 * s1.age = 20;
 * s1.display();
 * }
 * }
 */

// 2.) Default constructor example

/*
 * class student {
 * String name;
 * int age;
 * float percentaege;
 * 
 * student() {
 * System.out.println("This is default constructor");
 * this.name = "srishti";
 * System.out.println("name is : " + name);
 * this.age = 20;
 * System.out.println("age is : " + age);
 * this.percentaege = 85.5f;
 * System.out.println("percentage is : " + percentaege);
 * 
 * System.out.println("hy i am constructor");
 * }
 * 
 * // void display() {
 * // System.out.println("Named is :" + name);
 * // System.out.println("age is : " + age);
 * // System.out.println("percentage is : " + percentaege);
 * // }
 * 
 * public static void main(String args[]) {
 * student s1 = new student(); // obj creation
 * // yaha const turant call ho jayega isliye const ke andr jo statement hai vo
 * // print ho jayega
 * // s1.display(); // and then displaye ke anadr vala print
 * }
 * 
 * }
 */

// 3.) Parameterized constructor

// class Univeristy {
// String subjects;
// int year;

// Univeristy(String subjects, int year) {
// System.out.println("Subjects is : " + subjects);
// // this.subjects = subjects;
// System.out.println("Year is : " + year);
// // this.year = year;
// }

// void display() {
// System.out.println("Subjects is : " + subjects);
// System.out.println("Year is : " + year);
// }

// public static void main(String args[]) {
// Univeristy s1 = new Univeristy("Java , C++", 2024);
// // s1.display();
// }
// }

/* Without this keyword */

// class Univeristy {
// String subjects;
// int year;

// Univeristy(String subjects, int year) {
// System.out.println("Constructor Output:");
// System.out.println("Subjects is : " + subjects);
// System.out.println("Year is : " + year);
// }

// // Constructor me sahi print
// // But object me kuch store nahi hua (null, 0)

// void display() {
// System.out.println("Display Output:");
// System.out.println("Subjects is : " + subjects);
// System.out.println("Year is : " + year);
// }

// public static void main(String args[]) {
// Univeristy s1 = new Univeristy("Java , C++", 2024);
// s1.display();
// }
// }

/* With this keyword */

// class Univeristy {
// String subjects;
// int year;

// Univeristy(String subjects, int year) {
// this.subjects = subjects;
// this.year = year;

// System.out.println("Constructor Output:");
// System.out.println("Subjects is : " + subjects);
// System.out.println("Year is : " + year);
// }

// void display() {
// System.out.println("Display Output:");
// System.out.println("Subjects is : " + subjects);
// System.out.println("Year is : " + year);
// }

// public static void main(String args[]) {
// Univeristy s1 = new Univeristy("Java , C++", 2024);
// s1.display();
// }
// }

// 4.) Copy constructor

// class Student{
// String name;
// int age;

// Student(String name, int age){
// this.name = name;
// this.age = age;
// }

// Student(Student s){
// this.name = s.name;
// this.age = s.age;
// }

// void display(){
// System.out.println(name);
// System.out.println(age);
// }
// }
// class Main {
// public static void main(String[] args) {
// Student s1 = new Student("Shreya",20);
// s1.display();
// }
// }

// 5.) Constructor overloading

// //constructor overloading
// class Student{
// String name;
// int age;

// Student(){
// name="Shreya";
// age=20;
// }

// Student(String name, int age){
// this.name = name;
// this.age = age;
// }

// Student(Student s){
// this.name = s.name;
// this.age = s.age;
// }

// void display(){
// System.out.println(name);
// System.out.println(age);
// }
// }
// public class classObject {
// public static void main(String[] args) {
// Student s1 = new Student();
// Student s2 = new Student("Srishti",19);
// Student s3 = new Student(s1);
// s1.display();
// s2.display();
// s3.display();
// }
// }

// 5.) Set value example

// class DummyClass {

// int length, width;

// void setValues(int l, int w) {
// length = l;
// width = w;
// }

// int area() {
// return (length * width);
// }
// }

// class Main {
// public static void main(String[] args) {
// DummyClass o1 = new DummyClass(); // o1 is an object of class
// o1.setValues(5, 18); // Values passes to object o1
// System.out.println(o1.area());
// }
// }

// 6.) Constructor example without set value

// class DummyClass {

// int length, width;

// DummyClass(int l, int w) {
// length = l;
// width = w;
// }

// int area() {
// return (length * width);
// }
// }

// class Main {
// public static void main(String[] args) {
// DummyClass o1 = new DummyClass(4, 5); // Pass values as parametrized
// constructor
// // o1.setValues(5, 18); // Values passes to object o1
// System.out.println(o1.area());
// }
// }

// 7.) Constructor overloading example

// class Student {
// String name;
// int age;
// double marks;

// Student() {
// name = "Srishti";
// age = 20;
// marks = 8.5;
// }

// Student(String name, int age) {
// this.name = name;
// this.age = age;
// }

// Student(String name, int age, double marks) {
// this.name = name;
// this.age = age;
// this.marks = marks;
// }

// void display() {
// System.out.println("Name is : " + name);
// System.out.println("Age is : " + age);
// System.out.println("Marks is : " + marks);
// }

// public static void main(String args[]) {
// Student s1 = new Student();
// Student s2 = new Student("cv", 88);
// Student s3 = new Student("Shreya", 20, 8.5);
// s1.display();
// System.out.println("\n");
// s2.display();
// System.out.println("\n");
// s3.display();
// }
// }

// 8.) Addition of 2 int no,s , 3 int no, and 2 double no,s using method overloading

// class Student {

// // Method 1
// int add(int a, int b) { // method int add() not Student() because we are not
// creating constructor here
// return a + b;
// }

// // Method 2
// int add(int a, int b, int c) {
// return a + b + c;
// }

// // Method 3
// double add(double a, double b) {
// return a + b;
// }

// public static void main(String args[]) {
// Student obj = new Student();

// int result1 = obj.add(5, 3);
// int result2 = obj.add(1, 2, 3);
// double result3 = obj.add(2.5, 3.5);

// System.out.println("Sum 1: " + result1);
// System.out.println("Sum 2: " + result2);
// System.out.println("Sum 3: " + result3);
// }
// }

// 9.) Same example with constructor overloading

// class Student {
//     int a;
//     int b;
//     int c;
//     int add; // instance variable

//     Student() { // default const
//         int a = 8;
//         int b = 8;

//         add = a + b;
//     }

//     Student(int a, int b, int c) { // para const
//         this.a = a;
//         this.b = b;
//         this.c = c;
//         int sum = a + b + c;
//         System.out.println("sum is : " + sum);
//     }

//     Student(double a, double b) { // para
//         this.a = (int) a; // int -> double
//         this.b = (int) b;
//         double sum1 = a + b;
//         System.out.println("sum is : " + sum1);
//     }

//     void display() {
//         System.out.println("a + b : " + add); // default ke liye
//     }

//     public static void main(String args[]) {
//         Student s2 = new Student();
//         s2.display(); // default call
//         Student s1 = new Student(1, 3, 4); // para
//         Student s3 = new Student(10.0, 100.0); // para
//     }
// }

// 10.) Const overloading example with default const 

// class Demo {

//     // Method 1: no arguments
//     void add() {
//         int a = 10;
//         int b = 20;
//         int sum = a + b;
//         System.out.println("Sum of 2 integers: " + sum);
//     }

//     void addThree() {
//         int a = 1;
//         int b = 2;
//         int c = 3;
//         int sum = a + b + c;
//         System.out.println("Sum of 3 integers: " + sum);
//     }

//     void addDouble() {
//         double a = 2.5;
//         double b = 3.5;
//         double sum = a + b;
//         System.out.println("Sum of 2 doubles: " + sum);
//     }

//     // display method
//     void display() {
//         add(); // calling method 1
//         addThree(); // calling method 2
//         addDouble(); // calling method 3
//     }

//     public static void main(String args[]) {
//         Demo obj = new Demo();
//         obj.display(); // only one call
//     }
// }

// 11.) Final keyword example

// class Demo {
//     final int x = 100;

//     void show (){ 
//         x = 90;      // gives an error because x is final and cannot be changed
//         System.out.println(x);
//     }
//     public static void main (String args[]){
//         Demo s1 = new Demo();
//         s1.show();
//     }
// }

class Demo {
    final int x = 100;

    void show() {
        System.out.println(x);
    }

    public static void main(String args[]) {
        Demo s1 = new Demo();
        s1.show();
    }
}
