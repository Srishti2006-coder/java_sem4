
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

/*class Main {
    public static void main(String args[]) {
        int n = 5; // 0101
        int i = 1; // 1 idx bit agar 0 hai to set it to 1
        n = n | (1 << i); // 0111
        System.out.println(n);
    }
}*/

// q.) 7. Clear ith Bit

/*class Main {
    public static void main(String args[]) {
        int n = 5; // 0101
        int i = 2;
        n = n & ~(1 << i); // 0001
        System.out.println(n);

    }
}  */

// q.) 8. toggle ith bit

class Main {
    public static void main(String[] args) {
        int n = 5; // 0101
        int i = 3; // 1 -> 0 and 0 -> 1
        n = n ^ (1 << i);// 1101
        System.out.println(n);
    }
}
