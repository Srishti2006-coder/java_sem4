
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

// 8.) Addition of