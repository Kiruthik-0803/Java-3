import java.util.Scanner;

public class star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int input = sc.nextInt();
        for(int i = 0; i < input; i++){
        for(int j = input; j>0; j--){
            System.out.print("*");
            sc.close();
        }
        System.out.println("\n");
        }
}
}