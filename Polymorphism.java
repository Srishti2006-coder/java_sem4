
/*  Compile time  */

// class A {
//     void add() {
//         int a = 10, b = 100, c = 0;
//         int sum = a + b + c;
//         System.out.println(sum);
//     }

//     void add(int a, int b, int c) {
//         int sum2 = a + b + c;
//         System.out.println(sum2);
//     }

//     void add(int s, int b) {
//         int sum2 = s + b;
//         System.out.println(sum2);
//     }

//     public static void main(String args[]) {
//         A aa = new A();
//         aa.add();
//         aa.add(0, 0, 10);
//         aa.add(100, 9);
//     }
// }

/* Runtime poly morphism  */

// class shape {
//     void draw () {
//         System.out.println("Heeloo");
//     }
// }

// class sq extends shape {
//     void draw () {
//         System.out.println("Beyyy");
//     }
// }

// class Main {
//     public static void main (String args[]) {
//         shape r = new sq();
//         r.draw();

//     }
// }
// Output = Beyyy

// class shape {
//     void draw () {
//         System.out.println("Heeloo");
//     }
// }

// class sq extends shape {
//     void draw () {
//         System.out.println("Beyyy");
//     }
// }

// class Main {
//     public static void main (String args[]) {
//         shape r = new shape();    // output = Hello
//         r.draw();

//     }
// }

// class shape {
//     void draw () {
//         System.out.println("Heeloo");
//     }
// }

// class sq extends shape {
//     void draw2 () {
//         System.out.println("Beyyy");
//     }
// }

// class Main {
//     public static void main (String args[]) {
//         shape r = new sq();      // output = Hello
//         r.draw();

//     }
// }

/* Runtime poly morphism  */

// class shape {
//     void draw () {
//         System.out.println("Heeloo");
//     }
// }

// class sq extends shape {
//     void draw () {
//         System.out.println("Beyyy");
//     }
// }

// class Main {
//     public static void main (String args[]) {
//         shape r = new sq();
//         r.draw();

//     }
// }
// Output = Beyyy

// class shape {
//     void draw () {
//         System.out.println("Heeloo");
//     }
// }

// class sq extends shape {
//     void draw () {
//         System.out.println("Beyyy");
//     }
// }

// class Main {
//     public static void main (String args[]) {
//         shape r = new shape();    // output = Hello
//         r.draw();

//     }
// }

class shape {
    void draw() {
        System.out.println("Heeloo");
    }
}

class sq extends shape {
    void draw() {
        super.draw();
        System.out.println("Beyyy");
    }
}

class Main {
    public static void main(String args[]) {
        sq r = new sq(); // output = Hello , Beyyy
        r.draw();

    }
}
