import java.util.Scanner;

class A {
    int number;
    int value;

    void rev() {
        while (number != 0) {
            value = number % 10;
            System.out.print(value);
            number = number / 10;
        }
    }
}

public class rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine(); 
        System.out.println("GIVEN NUMBER IS " + number);
        A obj = new A();
        obj.number = number; 
        obj.rev();
        sc.close();
    }
}