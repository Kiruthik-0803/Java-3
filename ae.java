import java.util.Scanner;

public class ae {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int input = sc.nextInt();
        System.out.println("Given number is:"+input);
        String binaryString = Integer.toBinaryString(input);
    System.out.println("Binary number for the given number is :"+binaryString);
    int countOnes = 0;
    for (char c : binaryString.toCharArray()) {
        if (c == '1') {
            countOnes++;
        }
    }
    
    if (countOnes % 2 == 0) {
        System.out.println("Evil number :" + input);
    } else {
        System.out.println("Good number :" + input);
    }
 sc.close();
    }    
}
