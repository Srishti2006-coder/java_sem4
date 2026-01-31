
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

class Main {
    static void mesg() {
        System.out.println("hello");
        mesg1();
    }

    static void mesg1() {
        System.out.println("hi");
        mesg2();
    }

    static void mesg2() {
        System.out.println("hey");
    }

    public static void main(String args[]) {
        mesg();
    }
}