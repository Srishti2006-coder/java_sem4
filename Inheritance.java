
/*                     Single Inheritance                */
// class Rectangle {
//     void area(int l, int b) {
//         int area = l * b;
//         System.out.println("Area :  " + area);
//     }
// }

// class Rectangle2 extends Rectangle {
//     void perimeter(int l, int b) {
//         int perimeter = 2 * (l + b);
//         System.out.println("Perimeter is : " + perimeter);
//     }
// }

// class Main {
//     public static void main(String args[]) {
//         Rectangle2 r1 = new Rectangle2();
//         r1.area(4, 5);
//         r1.perimeter(10, 20);
//     }
// }

/*                     Multilevel Inheritance                */

// class Number {
//     int n = 10;
// }

// class Addition extends Number {
//     void add() {
//         int add = n + n;
//         System.out.println(add);
//     }
// }

// class Cube extends Addition {
//     void mul() {
//         int mull = n * n * n;
//         System.out.println(mull);
//     }
// }

// class Main {
//     public static void main(String args[]) {
//         Cube obj = new Cube();
//         obj.mul();
//         obj.add();
//     }
// }

/*class Number {
    int a = 10;
    int b = 20;
}

class Addition extends Number {
    void add() {
        int add = a + b;
        System.out.println(add);
    }
}

class Subtraction extends Addition {
    void sub() {
        int sub = a - b;
        System.out.println(sub);
    }
}

class Multiplication extends Subtraction {
    void mul() {
        int mul = a * b;
        System.out.println(mul);
    }
}

class Main {
    public static void main(String args[]) {
        Multiplication m1 = new Multiplication();
        m1.add();
        m1.sub();
        m1.mul();
    }
}  */

/*         Super class         */

// 1.) super keyword is used to refer immediate parent class instance variable.

// class A {
//     int a = 10;
//     // void show(){
//     // System.out.println("a is : " +a);
//     // }
// }

// class B extends A {
//     int b = 20;

//     void show() {
//         System.out.println(b);
//         System.out.println(super.a);
//     }
// }

// class Main {
//     public static void main(String args[]) {
//         B obj = new B();
//         obj.show();
//     }
// }

// 2.) 

// class A {
//     void show() {
//         System.out.println("Hello viewer");
//     }
// }

// class B extends A {
//     void show() {
//         System.out.println("Bye viewer");
//         super.show();
//     }
// }

// class Main {
//     public static void main(String args[]) {
//         B obj = new B();
//         obj.show();
//     }
// }

/*        Default const  */
class A {
    A() {
        System.out.println("Hello ");
    }
}

class B extends A {
    // void show () {
    // System.out.println("Bye");
    // }

    // Yaha B() const by default bn gya hidden tabhi print ho gya void me bhi
    // Prints both A and B kyuiki yaha super keyword reserved hota hai by defaualt
    // mention kro to bdiya vrna by default use ho jata hai

    B() {

        super();
        System.out.println("Byee");

    }
}

class Test {
    public static void main(String args[]) {
        B obj = new B();
        // obj.show();
    }
}
