
// import java.util.Scanner;

// class BitwiseOperations {
// public static void main(String[] args) {
// int a = 5; // Binary: 0101
// int b = 3; // Binary: 0011

// // Bitwise AND
// int andResult = a & b; // Binary: 0001
// System.out.println("Bitwise AND: " + andResult); // Output: 1

// // Bitwise OR
// int orResult = a | b; // Binary: 0111
// System.out.println("Bitwise OR: " + orResult); // Output: 7

// // Bitwise XOR
// int xorResult = a ^ b; // Binary: 0110
// System.out.println("Bitwise XOR: " + xorResult); // Output: 6

// // Bitwise NOT
// int notResult = ~a; // Binary: ...11111010 (two's complement)
// System.out.println("Bitwise NOT: " + notResult); // Output: -6

// // Left Shift
// int leftShiftResult = a << 1; // Binary: 1010
// System.out.println("Left Shift: " + leftShiftResult); // Output: 10

// // Right Shift
// int rightShiftResult = a >> 1; // Binary: 0010
// System.out.println("Right Shift: " + rightShiftResult); // Output: 2
// }
// }

// class binaryToDecimal {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int binary_num = sc.nextInt();
// int decimal_num = 0;

// int power = 1; // 2^0 = 1

// while (binary_num > 0) {
// int last_digit = binary_num % 10;
// decimal_num += last_digit * power;
// power = power * 2;
// binary_num = binary_num / 10;
// }
// System.out.println(decimal_num);
// }
// }

// 1.) Decimal to binary

// class Main {
// public static void main(String[] args) {
// int decimal = 5;

// String binary = Integer.toBinaryString(decimal);

// System.out.println("Binary = " + binary);
// }
// }

// 2.) Binary to decimal

// class Main {
// public static void main(String[] args) {
// String binary = "101";

// int decimal = Integer.parseInt(binary, 2);

// System.out.println("Decimal = " + decimal);
// }
// }

// 1.) Constructors

// class Algebra {

// Algebra() {
// System.out.println("This is a constructor");
// }

// int add(int a, int b) {
// return a + b;
// }
// }

// public class bitwise {
// public static void main(String args[]) {
// Algebra obj = new Algebra();
// // int sum = obj.add(5, 10);
// Scanner sc = new Scanner(System.in);
// int x = sc.nextInt();
// int y = sc.nextInt();
// int sum = obj.add(x, y);
// System.out.println("Sum = " + sum);
// }
// }

// 2.) Parameterized Constructors

// class Algebra {
//     int a;
//     int b;

//     Algebra(int x, int y) {
//         System.out.println("This is a parameterized constructor");
//         a = x;
//         b = y;
//     }

//     int add() {
//         return a + b;
//     }

//     int sub() {
//         return a - b;
//     }

//     int mul() {
//         return a * b;
//     }
// }

// public class bitwise {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         int y = sc.nextInt();

//         Algebra obj = new Algebra(x, y); // obj1

//         int sum = obj.add();
//         int difference = obj.sub();
//         int product = obj.mul();

//         System.out.println("Sum = " + sum);
//         System.out.println("Difference = " + difference);
//         System.out.println("Product = " + product);

//         Algebra obj2 = new Algebra(20, 10); // obj2

//         System.out.println("Sum = " + obj2.add());
//         System.out.println("Difference = " + obj2.sub());
//         System.out.println("Product = " + obj2.mul());
//     }
// }

// Access Modifiers in Java

// public class bitwise {
//     public String name = "Srishti";

//     void display() {
//         System.out.println("Hello, " + name);
//     }

//     public static void main(String args[]) {
//         bitwise obj = new bitwise();
//         obj.display(); // Calls the display method const call
//         System.out.println("Name: " + obj.name); // Accesses the public variable 'name'
//     }
// }

// 

public class bitwise {
    public static void main(String args[]) {

    }
}