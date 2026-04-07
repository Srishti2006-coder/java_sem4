
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

// class Main {
// public static void main(String args[]) {

// try {
// System.out.println("Learning"); // This will print
// int a = 10, b = 0, c;
// c = a / b; // directly jumps to catch block
// System.out.println(c);
// System.out.println("Stop Learning");
// }

// catch (ArithmeticException a) { // this will print
// System.out.println("can't divide by zero");
// }

// finally { // this will print whether exception occurs or not
// System.out.println("bbbb");
// }

// System.out.println("Ended"); // this will print because exception is handled
// by catch block
// }
// }

// 13.) finally block with abnormal exception

// class Main {
// public static void main(String args[]) {

// try {
// System.out.println("Learning"); // This will print
// int a = 20, b = 0, c;
// c = a / b;
// System.out.println(c);
// System.out.println("Stop Learning");
// }

// catch (NullPointerException a) { // different exception except original or
// correct one
// System.out.println("can't divide by zero");
// }

// finally {
// System.out.println("bbbb");
// }

// System.out.println("Ended");
// }
// }

// /* 14.) multiple try catch */

// class Main {
// public static void main(String[] args) {

// try {
// int a = 10, b = 0, c;
// c = a / b;
// System.out.println(c);
// } catch (ArithmeticException a) {
// System.out.println("can't be divide by 0");
// }

// try {
// int array[] = { 10, 20, 30, 40 };
// System.out.println(array[2]);
// } catch (ArrayIndexOutOfBoundsException b) {
// System.out.println("array[5] is not declared");
// }

// }
// }

// /* 15.) har ek try ka apna finally hota ha , finally is not global */

// class Main {
// public static void main (String[] args) {

// try{
// int a = 10,b= 0, c;
// c = a/b;
// System.out.println(c);
// }
// catch(ArithmeticException a) {
// System.out.println("can't be divide by 0");
// }

// finally{
// System.out.println("hy");
// }

// try{
// int array[] = {10,20,30,40};
// System.out.println(array[2]);
// }
// catch(ArrayIndexOutOfBoundsException b) {
// System.out.println("array[5] is not declared");
// }

// finally{
// System.out.println("hy");
// }
// }
// }

// class Main {
// public static void main(String[] args) {

// try {
// int a = 10, b = 0, c;
// c = a / b;
// System.out.println(c);
// } catch (ArrayIndexOutOfBoundsException b) {
// System.out.println("can't be divide by 0");
// }

// finally {
// System.out.println("hy"); // Individually try ka apna finally hota ha,
// finally is not global
// }

// try {
// int array[] = { 10, 20, 30, 40 };
// System.out.println(array[2]);
// } catch (ArithmeticException a) {
// System.out.println("array[5] is not declared");
// }

// finally {
// System.out.println("hy");
// }

// }
// }

/* ************************************************************************** */

// Step 2: Exception aaya ❌ (unhandled)
// 🔹 Step 3:

// 👉 JVM bolta hai:

// “Theek hai, jo try chal raha tha uska cleanup kar deta hoon”

// ➡️ 1st finally run hota hai (hy1) ✅

// 🔴 Step 4 (game over)

// 👉 Exception abhi bhi unhandled hai
// 👉 JVM: program terminate 💥

// ❗ IMPORTANT

// 👉 Program yahi khatam ho gaya

// ➡️ Isliye:

// 2nd try ❌ start hi nahi hua
// to uska finally ❌ kaise chalega?

// class Main {
// public static void main(String[] args) {

// try {
// int a = 10, b = 0, c;
// c = a / b;
// System.out.println(c);
// } catch (ArrayIndexOutOfBoundsException b) {
// System.out.println("can't be divide by 0");
// }

// finally {
// System.out.println("hy1"); // executes this only
// }

// try {
// int array[] = { 10, 20, 30, 40 };
// System.out.println(array[2]);
// } catch (ArithmeticException a) {
// System.out.println("array[5] is not declared");
// }

// finally {
// System.out.println("hy");
// }

// }
// }

// 16.) /* Multiple Catch No exception occur */

// class Codechef {
// public static void main(String[] args) {
// try {
// int a = 10;
// int b = 2;
// int c;
// c = a / b;
// System.out.println(c);

// int arr[] = { 10, 20, 30, 40 };
// System.out.println(arr[2]);

// String str = "ankit";
// System.out.println(str.toUpperCase());
// } catch (ArrayIndexOutOfBoundsException a) {
// System.out.println("Array Exception");
// } catch (ArithmeticException e) {
// System.out.println("Arithmetic Exception");
// } catch (Exception x) {
// System.out.println("Super class Exception");
// }
// }
// }

// /* 17.) abh yaha jaise string me exception tha catch me koi matching
// exception nahi tha
// pr kyuki super class Excption tha is liye vo vaha hit ho gya */ //

// class Codechef {
// public static void main (String[] args) {
// try {
// int a = 10;
// int b = 2;
// int c;
// c = a/b;
// System.out.println(c);

// int arr[] = {10,20,30,40};
// System.out.println(arr[2]);

// // String str = "123";
// // int f = Integer.parseInt(str);
// // System.out.println(f);

// String str = null;
// System.out.println(str.toUpperCase()); // Exception
// }
// catch(ArrayIndexOutOfBoundsException a) {
// System.out.println("Array Exception");
// }
// catch(ArithmeticException e) {
// System.out.println("Arithmetic Exception");
// }
// catch(Exception x){
// System.out.println("Super class Exception"); // this will print because there
// is no matching exception for NullPointerException but it is parent class of
// all exceptions
// }
// }
// }

// 18.) Agar sbhi exceptions ho to very first Excp in try is execute and no
// other exception will be executed
// Means to say that whole system crash or terminate there only first exception
// will be executed and no other exception will be executed

// class Codechef {
// public static void main (String[] args) {
// try {
// int a = 10;
// int b = 0;
// int c;
// c = a/b;
// System.out.println(c);

// int arr[] = {10,20,30,40};
// System.out.println(arr[20]);

// String str = null;
// System.out.println(str.toUpperCase());
// }
// catch(ArrayIndexOutOfBoundsException a) {
// System.out.println("Array Exception");
// }
// catch(ArithmeticException e) {
// System.out.println("Arithmetic Exception");
// }
// catch(Exception x){
// System.out.println("Super class Exception");
// }
// }
// }
