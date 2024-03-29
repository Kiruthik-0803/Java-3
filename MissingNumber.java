import java.util.*;

public class MissingNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the total number of elements: ");
        n = sc.nextInt();
        int[] arr = new int[n - 1];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        int total = n * (n + 1) / 2;
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        int missingNumber = total - sum;
        System.out.println("Missing Element is: " + missingNumber);
        sc.close();
    }
}