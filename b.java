import java.util.Scanner;

public class b {
     static int a[] = new int[10];
    static int n = a.length; 


    public static void main(String[] args) {
        int count=2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        n = sc.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < count; i++) {
            a[i] = sc.nextInt();
        }

        for (int iter: a) { 
            System.out.println(iter);

}
System.out.println ("n = " + n);
sc.close(); 
}
} 