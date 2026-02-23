
// q.> 1. And Operator (&)

/*
 * class Main {
 * public static void main(String args[]) {
 * int a = 5;
 * int b = 8;
 * 
 * int result = a & b;
 * System.out.println("And of a & b : " + result);
 * }
 * }
 */

// q.) 2. OR Operator (|)

/*
 * class Main {
 * public static void main(String args[]) {
 * int a = 5;
 * int b = 8;
 * 
 * int result = a | b;
 * System.out.println("And of a & b : " + result);
 * }
 * }
 */

// q.) 3. XOR Operator (^)

/*
 * class Main {
 * public static void main(String[] args) {
 * 
 * int a = 5;
 * int b = 3;
 * 
 * int result = a ^ b;
 * 
 * System.out.println("XOR = " + result);
 * 
 * }
 * }
 */

// q.) 4. NOT Operator (~)

/*
 * class Main {
 * public static void main(String[] args) {
 * 
 * int a = 5;
 * 
 * int result = ~a;
 * 
 * System.out.println("NOT = " + result);
 * 
 * }
 * }
 */

/*
 * class Main {
 * public static void main(String[] args){
 * 
 * int a = 5;
 * int b = 3;
 * 
 * System.out.println(a & b);
 * System.out.println(a | b);
 * System.out.println(a ^ b);
 * System.out.println(~a);
 * 
 * }
 * }
 */

// q.) 5. Application - Check ith bit

/*
 * class Main {
 * public static void main(String args[]) {
 * int n = 5; // 0101
 * int i = 2; // 3 idx
 * if ((n & (1 << i)) != 0) {
 * System.out.println("Bit is On : 1");
 * } else {
 * System.out.println("Bit is off : 0");
 * }
 * }
 * }
 */

// q.) 6. Set ith Bit

/*
 * class Main {
 * public static void main(String args[]) {
 * int n = 5; // 0101
 * int i = 1; // 1 idx bit agar 0 hai to set it to 1
 * n = n | (1 << i); // 0111
 * System.out.println(n);
 * }
 * }
 */

// q.) 7. Clear ith Bit

/*
 * class Main {
 * public static void main(String args[]) {
 * int n = 5; // 0101
 * int i = 2;
 * n = n & ~(1 << i); // 0001
 * System.out.println(n);
 * 
 * }
 * }
 */

// q.) 8. toggle ith bit

/*
 * class Main {
 * public static void main(String[] args) {
 * int n = 5; // 0101
 * int i = 3; // 1 -> 0 and 0 -> 1
 * n = n ^ (1 << i);// 1101
 * System.out.println(n);
 * }
 * }
 */

// q.) 9. find unique element

/*
 * class Main {
 * public static void main(String[] args) {
 * int[] arr = { 1, 2, 3, 4, 3, 5, 2, 5, 1 };
 * int ans = 0;
 * for (int num : arr) {
 * ans ^= num;
 * }
 * System.out.println(ans);
 * }
 * }
 */

// q.) 10. //ques - find missing number in array

/*
 * class Main {
 * public static void main(String[] args) {
 * int n = 5;// length of array
 * int[] arr = { 0, 1, 3, 4, 5 };// start from 0 to n but 2 is missing
 * int ans = 0;
 * for (int i = 0; i <= n; i++) {
 * ans ^= i;
 * }
 * for (int num : arr) {
 * ans ^= num;
 * }
 * System.out.print(ans);
 * }
 * }
 */

// ques 11. - power set

/*
 * class Main {
 * public static void main(String[] args) {
 * int[] arr = { 1, 2, 3 };
 * int n = arr.length;
 * 
 * for (int i = 0; i < (1 << n); i++) {
 * for (int j = 0; j < n; j++) {
 * if ((i & (1 << j)) != 0) {
 * System.out.print(arr[j] + " ");
 * }
 * }
 * System.out.println();
 * }
 * }
 * }
 */

// ques 12. Complement of a number

/*
 * class Main {
 * public static void main(String[] args) {
 * 
 * int n = 5;
 * 
 * int bits = Integer.toBinaryString(n).length();
 * 
 * int mask = (1 << bits) - 1;
 * 
 * int result = mask ^ n;
 * 
 * System.out.println(result);
 * 
 * }
 * }
 */
