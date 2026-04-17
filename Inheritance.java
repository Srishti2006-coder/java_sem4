
/* Single Inheritance */
// class Rectangle {
// void area(int l, int b) {
// int area = l * b;
// System.out.println("Area : " + area);
// }
// }

// class Rectangle2 extends Rectangle {
// void perimeter(int l, int b) {
// int perimeter = 2 * (l + b);
// System.out.println("Perimeter is : " + perimeter);
// }
// }

// class Main {
// public static void main(String args[]) {
// Rectangle2 r1 = new Rectangle2();
// r1.area(4, 5);
// r1.perimeter(10, 20);
// }
// }

/* Multilevel Inheritance */

// 1.)

// class Number {
// int n = 10;
// }

// class Addition extends Number {
// void add() {
// int add = n + n;
// System.out.println(add);
// }
// }

// class Cube extends Addition {
// void mul() {
// int mull = n * n * n;
// System.out.println(mull);
// }
// }

// class Main {
// public static void main(String args[]) {
// Cube obj = new Cube();
// obj.mul();
// obj.add();
// }
// }

/*
 * 2>)
 * 
 * class Number {
 * int a = 10;
 * int b = 20;
 * }
 * 
 * class Addition extends Number {
 * void add() {
 * int add = a + b;
 * System.out.println(add);
 * }
 * }
 * 
 * class Subtraction extends Addition {
 * void sub() {
 * int sub = a - b;
 * System.out.println(sub);
 * }
 * }
 * 
 * class Multiplication extends Subtraction {
 * void mul() {
 * int mul = a * b;
 * System.out.println(mul);
 * }
 * }
 * 
 * class Main {
 * public static void main(String args[]) {
 * Multiplication m1 = new Multiplication();
 * m1.add();
 * m1.sub();
 * m1.mul();
 * }
 * }
 */

/* Hierarichal inheritance */

// class Calculator {
// int a = 10, b = 5;

// void add() {
// System.out.println("Addition: " + (a + b));
// }
// }

// class Subtraction extends Calculator {
// void subtract() {
// System.out.println("Subtraction: " + (a - b));
// }
// }

// class Multiplication extends Calculator {
// void multiply() {
// System.out.println("Multiplication: " + (a * b));
// }
// }

// class Main {
// public static void main(String[] args) {

// Subtraction s = new Subtraction();
// Multiplication m = new Multiplication();

// s.add(); // parent method
// s.subtract(); // own

// m.add(); // parent method
// m.multiply(); // own

// // m.subtract(); ❌ ERROR
// // s.multiply(); ❌ ERROR
// }
// }

/* Super class */

// 1.) super keyword is used to refer immediate parent class instance variable.

// class A {
// int a = 10;
// // void show(){
// // System.out.println("a is : " +a);
// // }
// }

// class B extends A {
// int b = 20;

// void show() {
// System.out.println(b);
// System.out.println(super.a);
// }
// }

// class Main {
// public static void main(String args[]) {
// B obj = new B();
// obj.show();
// }
// }

// 2.)

// class A {
// void show() {
// System.out.println("Hello viewer");
// }
// }

// class B extends A {
// void show() {
// System.out.println("Bye viewer");
// super.show();
// }
// }

// class Main {
// public static void main(String args[]) {
// B obj = new B();
// obj.show();
// }
// }

/* Default const */

// class A {
// A() {
// System.out.println("Hello ");
// }
// }

// class B extends A {
// // void show () {
// // System.out.println("Bye");
// // }

// // Yaha B() const by default bn gya hidden tabhi print ho gya void me bhi
// // Prints both A and B kyuiki yaha super keyword reserved hota hai by
// defaualt
// // mention kro to bdiya vrna by default use ho jata hai

// B() {

// super();
// System.out.println("Byee");

// }
// }

// class Test {
// public static void main(String args[]) {
// B obj = new B();
// // obj.show();
// }
// }

/* Paramterized const */

// class A {

// A(int a) {
// System.out.println("Hello : " + a);
// }
// }

// class B extends A {
// B() {

// // System.out.println("Hy");

// // Pehle parent ka constructor call hona zaroori hai
// // Tabhi child properly initialize hoga

// super(100); // In paramterized super keyword likhna must hai
// System.out.println("byeee ");
// }
// }

// class Main {
// public static void main(String args[]) {
// B obj = new B();
// }
// }

/* Override */

/* example 1.) */

// class Parent {
// void show() {
// System.out.println("Parent");
// }
// }

// class Child extends Parent {
// void show() {
// super.show();
// System.out.println("Child");
// }

// public static void main(String[] args) {
// Child c = new Child();
// // super.show();
// c.show(); // Child

// // Parent p = new Parent();
// // p.show();
// }
// }

/* example 2.) */

// class Calculation {
// void calculate(int a, int b) {
// System.out.println("Sum: " + (a + b));
// }
// }

// class Result extends Calculation {
// void calculate(int a, int b) { // overriding
// super.calculate(a, b);
// System.out.println("Subtraction: " + (a - b));
// }
// }

// class Main {
// public static void main(String[] args) {
// Result obj = new Result();
// obj.calculate(10, 5);
// obj.calculate(100, 9);
// }
// }

// /* Hash Map , Hash Set, ArrayList */  //

// 1.) ArrayList 

import java.util.*;

// class TestArrayList {
//     public static void main(String[] args) {

//         // Declaration
//         ArrayList<Integer> list = new ArrayList<>();

//         // 1. Duplicate allowed ✔
//         list.add(10);
//         list.add(20);
//         list.add(10); 

//         // 2. Order maintained ✔
//         System.out.println(list); // [10, 20, 10]

//         // 3. Index-based access ✔

//         System.out.println("Element at index 1: " + list.get(1));

//         list.add(null);   // 4. Allows null ✔
//         System.out.println("After adding null: " + list);

//         // 5. Size
//         System.out.println("Size: " + list.size());

//         // 6. Remove by index
//         list.remove(0);
//         System.out.println("After removal: " + list);

//         // 7. Iteration

//         for(Integer x : list){
//             System.out.print(x + " ");
//         }
//     }
// }

// 2.) HashMap 

// class HashMaptest {
//     public static void main(String[] args) {

//         HashMap<Integer, String> map = new HashMap<>();

//         // 1. Key-Value pair ✔

//         map.put(1, "A");
//         map.put(2, "B");

//         // 2. Duplicate key NOT allowed ❌ (overwrite)
//         map.put(1, "C"); 
//     //         key, value

//         // 3. Multiple values duplicate allowed ✔
//         map.put(3, "B");

//         System.out.println(map);  // {1=C, 2=B, 3=B}

//         // 4. One null key 
//         map.put(null, "X");

//         // 5. Multiple null values 
//         map.put(4, null);
//         map.put(5, null);

//         // 6. Order NOT maintained 
//         System.out.println("HashMap: " + map);

//         // 7. Access
//         System.out.println("Value of key 1: " + map.get(1));

//         // 8. Contains
//         System.out.println("Contains key 2? " + map.containsKey(2));
//         System.out.println("Contains value B? " + map.containsValue("B"));

//         // 9. Remove
//         map.remove(2);
//         System.out.println("After removal: " + map);

//         // 10. Size
//         System.out.println("Size: " + map.size());

//         // 11. Iteration

//         for(Map.Entry<Integer, String> e : map.entrySet()){
//             System.out.print(e.getKey() + " -> " + e.getValue());
//         }
//     }
// }

// 3.) HashSet

import java.util.*;

class TestHashSet {
    public static void main(String[] args) {

        // Declaration
        HashSet<Integer> set = new HashSet<>();

        // 1. Duplicate NOT allowed ❌
        set.add(10);
        set.add(20);
        set.add(10); // ignored

        // 2. Order NOT maintained ❌
        System.out.println("HashSet: " + set);

        // 3. Only one null allowed ✔
        set.add(null);
        set.add(null); // ignored
        System.out.println("After adding null: " + set);

        // 4. No index access ❌ (get() nahi hota)

        // 5. Contains check
        System.out.println("Contains 20? " + set.contains(20));

        // 6. Remove
        set.remove(10);
        System.out.println("After removal: " + set);

        // 7. Size
        System.out.println("Size: " + set.size());

        // 8. Iteration
        for (Integer x : set) {
            System.out.println(x);
        }
    }
}