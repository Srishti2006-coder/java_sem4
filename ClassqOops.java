
import java.util.*;

// 1.) Create a class student .......

/*
 * class Student {
 * String name;
 * int rollNo;
 * 
 * Student(String name, int rollNo) {
 * this.name = name;
 * this.rollNo = rollNo;
 * }
 * void display () {
 * System.out.println("Name is : " +name);
 * System.out.println("RollNo is : " +rollNo);
 * }
 * public static void main (String[] args) {
 * Student s1 = new Student("Srishti", 1542);
 * 
 * s1.display();
 * }
 * }
 */

// 2. Static Variable Craete a class Employee with :

/*
 * class Employee {
 * String name;
 * int salary;
 * static String company = "Apple";
 * 
 * Employee(String name, int salary){
 * this.name = name;
 * this.salary = salary;
 * }
 * 
 * void display() {
 * System.out.println("Name  is : " +name);
 * System.out.println("salary is : " +salary);
 * System.out.println("Company is : " +company);
 * System.out.println("-------------");
 * }
 * 
 * public static void main (String args[]) {
 * Employee s1 = new Employee("Srishti", 10);
 * s1.display();
 * 
 * Employee s2 = new Employee("Sejal", 10);
 * s2.display();
 * }
 * }
 */

// 3. Create a class Rectangle
// * Constructor with no parameters
// * Constructor with length & breadth
// * Method area()

/*
 * class Rectangle {
 * float length;
 * float breadth;
 * 
 * Rectangle() { // Constructor with no parameters
 * length=7;
 * breadth=8;
 * }
 * Rectangle(float length, float breadth){ // Constructor with length & breadth
 * this.length = length;
 * this.breadth = breadth;
 * }
 * float area() { // Method area
 * return length * breadth;
 * }
 * 
 * public static void main(String args[]) {
 * 
 * Rectangle r1 = new Rectangle(); // default constructor
 * System.out.println("Area = " + r1.area());
 * 
 * // Object using parameter constructor
 * Rectangle r2 = new Rectangle(5, 4);
 * System.out.println("Area = " + r2.area());
 * }
 * }
 */

// 4.) Single Inheritance
// Create a class Animal
// Class Dog extends Animal Add methods and test inheritance

/*
 * class Animal {
 * void eat () {
 * System.out.println("Animals are carnivores");
 * }
 * }
 * 
 * class Dog extends Animal {
 * void bark () {
 * System.out.println("Dog barks");
 * }
 * 
 * public static void main (String args[]) {
 * Dog d1 = new Dog();
 * // d1.eat();
 * d1.bark();
 * d1.eat();
 * }
 * }
 */

// 5.) Method Overrinding

// Create class Vehicle with method start().
// Create subclass Car that overrides i

/*
 * class Vehicle{
 * void start() {
 * System.out.println("Bike starts");
 * }
 * }
 * class Car extends Vehicle {
 * 
 * @Override
 * void start() {
 * System.out.println("Car starts with key");
 * }
 * 
 * public static void main (String args[]) {
 * Car c1 = new Car();
 * c1.start();
 * 
 * Vehicle v1 = new Vehicle();
 * v1.start();
 * }
 * 
 * }
 */

// 6.) Dynamic Method Dispatch
// Use runtime polymorphism with Animal and catch

// Dynamic Method Dispatch means:

// 👉 Parent class reference
// 👉 Child class object
// 👉 Method call decided at runtime

/*
 * class Animal {
 * void sound() {
 * System.out.println("Animal makes sound");
 * }
 * }
 * 
 * class Cat extends Animal {
 * void sound() {
 * System.out.println("Cat meows");
 * }
 * public static void main(String args[]) {
 * 
 * Animal a1 = new Cat(); // Parent reference, child object
 * a1.sound(); // Runtime method call
 * 
 * Animal a2 = new Animal(); // Parent ref but class name change
 * a2.sound();
 * }
 * }
 */

// 7.) Question 7 – super Keyword
// Create parent class Person and child class Student.
// Use super to call parent constructor

/*
 * class Person {
 * 
 * String name;
 * 
 * // Parent constructor
 * Person(String name) {
 * this.name = name;
 * System.out.println("Person Name: " + name);
 * }
 * }
 * 
 * class Student extends Person {
 * 
 * int rollNo;
 * 
 * // Child constructor
 * Student(String name, int rollNo) {
 * 
 * super(name); // Call parent constructor
 * 
 * this.rollNo = rollNo;
 * System.out.println("Roll No: " + rollNo);
 * }
 * 
 * public static void main(String args[]) {
 * 
 * Student s1 = new Student("Srishti", 101);
 * 
 * }
 * }
 */

// Question 9 – Multilevel Inheritance
// Create: ● Class A
// ● Class B extends A
// ● Class C extends B
// Call methods from all levels

// class A {

// void methodA() {
// System.out.println("Method from A");
// }
// }

// class B extends A {

// void methodB() {
// System.out.println("Method from B");
// }
// }

// class C extends B {

// void methodC() {
// System.out.println("Method from C");
// }

// public static void main(String args[]) {

// C obj = new C();

// obj.methodA();
// obj.methodB();
// obj.methodC();
// }
// }

/*
 * class Shape {
 * 
 * void area() {
 * System.out.println("Area of shape");
 * }
 * }
 * 
 * class Circle extends Shape {
 * 
 * double radius = 5;
 * 
 * @Override
 * void area() {
 * System.out.println("Circle Area = " + (3.14 * radius * radius));
 * }
 * }
 * 
 * class Rectangle extends Shape {
 * 
 * int length = 4;
 * int breadth = 3;
 * 
 * @Override
 * void area() {
 * System.out.println("Rectangle Area = " + (length * breadth));
 * }
 * }
 * 
 * class Main {
 * 
 * public static void main(String args[]) {
 * 
 * Shape s;
 * 
 * s = new Circle(); // Circle object
 * s.area();
 * 
 * s = new Rectangle(); // Rectangle object
 * s.area();
 * }
 * }
 */