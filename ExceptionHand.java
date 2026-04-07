
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

// /* 6.) NullPointerException with try catch */

// class Main {
// public static void main(String args[]) {
// String str = null;

// try {
// System.out.println(str.toUpperCase());
// } catch (NullPointerException e) {
// System.out.println("null");
// }
// }
// }

// /* 7.) when str is not null then try will execute without catch */

// class Main {
// public static void main(String args[]) {
// String str = "Ankit";

// try {
// System.out.println(str.toUpperCase());
// } catch (NullPointerException e) {
// System.out.println("null");
// }
// }
// }

// /* 8.) try-catch NumberFormatException without try catch */

// class Main {
// public static void main (String args[]) {
// String str = "ankit";

// int a = Integer.parseInt(str); // Exception in thread "main"
// java.lang.NumberFormatException: For input string: "ankit"
// System.out.println(a);

// System.out.println("Hello");
// }
// }

// /* 9.) try-catch NumberFormatException with try catch */

// class Main {
// public static void main (String args[]){
// String str = "srishti";

// try {
// int a = Integer.parseInt(str);
// System.out.println(a);
// }
// catch(NumberFormatException e){ // this will print
// System.out.println("String ankit can not be converted into integer");
// }
// }
// }

// class Main {
// public static void main (String args[]){
// String str = "123";

// try {
// int a = Integer.parseInt(str);
// System.out.println(a); // prins 123
// }
// catch(NumberFormatException e){
// System.out.println("String ankit can not be converted into integer");
// }
// }
// }

// 10.) abnormal exception as we passing ArithemeticException but it is
// NumberFormatException

// class Main {
// public static void main(String args[]) {
// String str = "ankush";

// try {
// int a = Integer.parseInt(str);
// System.out.println(a);
// } catch (ArithmeticException e) {
// System.out.println("String ankit can not be converted into integer");
// }
// System.out.println("Byeee");
// }
// }

// 11.) finally block

// finally block is used to execute the code which is necessary to be executed
// whether exception occurs or not

// class Main {
// public static void main(String args[]) {

// try {
// System.out.println("Learning");
// int a = 20, b = 2, c; // No exception occur here
// c = a / b;
// System.out.println(c);
// System.out.println("Stop Learning");
// }

// catch (ArithmeticException a) { // this will not execute
// System.out.println("can't divide by zero");
// }

// finally {
// System.out.println("bbbb");
// }

// System.out.println("Ended");
// }
// }

/// 12.) finally block with exception

class Main {
    public static void main(String args[]) {

        try {
            System.out.println("Learning");
            int a = 10, b = 0, c;
            c = a / b;
            System.out.println(c);
            System.out.println("Stop Learning");
        }

        catch (ArithmeticException a) {
            System.out.println("can't divide by zero");
        }

        finally {
            System.out.println("bbbb");
        }

        System.out.println("Ended");
    }
}

// class Main {
// public static void main (String args[]) {

// try{
// System.out.println("Learning"); // This will print
// int a=20, b = 0, c;
// c = a/b;
// System.out.println(c);
// System.out.println("Stop Learning");
// }

// catch(NullPointerException a) { // different exception except original or
// correct one
// System.out.println("can't divide by zero");
// }

// finally {
// System.out.println("bbbb");
// }

// System.out.println("Ended");
// }
// }
