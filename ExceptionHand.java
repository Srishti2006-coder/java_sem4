
// 1.) Exception handling in java

// class Codechef {
// public static void main(String[] args) throws java.lang.Exception {
// System.out.println("Hello"); // This will be printed

// int a = 10, b = 0, c;
// c = a / b; // Exception in thread "main" java.lang.ArithmeticException
// System.out.println(c);

// System.out.println("By"); // This will not beacuse at line 9 exception occurs
// and program terminates
// }
// }

// class Codechef {
// public static void main(String[] args) throws java.lang.Exception {
// System.out.println("Hello");

// float a = 10, b = 100, c;
// c = a / b; // 10 / 100 = 0.1 : 0.1 → integer me convert → 0
// System.out.println(c);

// System.out.println("By");
// }
// }

// 3.) Multiple catch

// class Main {
// public static void main (String args[]){
// System.out.println("Main method start");

// int a = 10, b = 0, c;
// try{
// c = a/b;
// System.out.println(c);
// }
// catch(Exception e){
// System.out.println("General error");
// }
// // catch(ArithmeticException e){
// // System.out.println("Arithmetic error");
// // }
// // Order of catch block is important, if we put general exception first then
// it will catch all the exceptions and specific exception will never be reached
// System.out.println("Main method ended");
// }
// }

// 4.) Multiple catch with order imp

// class Main {
// public static void main (String args[]){
// System.out.println("Main method start");

// int a = 10, b = 0, c;
// try{
// c = a/b;
// System.out.println(c);
// }
// catch(ArithmeticException e){
// System.out.println("Arithmetic error");
// }
// catch(Exception e){
// System.out.println("General error");
// }

// System.out.println("Main method ended");
// }
// }

/* 5.) NullPointerException */

// class Main {
// public static void main(String args[]) {

// String str = null;
// System.out.println(str.toUpperCase()); // Exception in thread "main"
// java.lang.NullPointerException
// }
// }

// class Main {
// public static void main (String args[]) {

// String st = null;
// System.out.println(st);
// }
// }

// 6.