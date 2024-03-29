import java.util.Scanner;


class circle {
    float radius;

    void calculate() {
        System.out.println((float) (3.14 * radius * radius));
    }
}


class rectangle {
    static int height;
    static int length;
    static int breadth;

    void calculate() {
        System.out.println((float) (length * breadth * height));
    }
}


public class d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int height = sc.nextInt();
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int radius = sc.nextInt();

        circle c = new circle();
        rectangle r = new rectangle();
    }
}