
/*                     Single Inheritance                */
class Rectangle {
    void area(int l, int b) {
        int area = l * b;
        System.out.println("Area :  " + area);
    }
}

class Rectangle2 extends Rectangle {
    void perimeter(int l, int b) {
        int perimeter = 2 * (l + b);
        System.out.println("Perimeter is : " + perimeter);
    }
}

class Main {
    public static void main(String args[]) {
        Rectangle2 r1 = new Rectangle2();
        r1.area(4, 5);
        r1.perimeter(10, 20);
    }
}