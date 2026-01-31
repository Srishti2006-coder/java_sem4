
// class Main {
//     public static void message() {
//         System.out.println("Hello World");
//     }

//     static void mesg() {
//         System.out.println("Hello World");
//     }

//     public static void main(String args[]) {
//         message();
//         mesg();

//     }
// }

// class Main { // function call stack
//     static void mesg() {
//         System.out.println("hello");
//         mesg1();
//     }

//     static void mesg1() {
//         System.out.println("hi");
//         mesg2(); // function is calling another function
//     }

//     static void mesg2() {
//         System.out.println("hey");
//     }

//     public static void main(String args[]) {
//         mesg();
//     }
// }

// q.) print no's 1 2 3 4 5 BY USING FUNCTION CALL STACK

class Main {
    static void print1(int n) {
        System.out.println(n);
        print2(n + 1); // print2(2)
    }

    static void print2(int n) {
        System.out.println(n);
        // print3(n + 1); // print3(3)
    }

    // static void print3(int n) {
    // System.out.println(n);
    // print4(n + 1); // print4(4)
    // }

    // static void print4(int n) {
    // System.out.println(n);
    // print5(n + 1);
    // }

    // static void print5(int n) {
    // System.out.println(n);
    // }

    public static void main(String args[]) {
        print1(1);
    }
}
