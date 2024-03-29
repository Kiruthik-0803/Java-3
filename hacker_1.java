import java.util.Scanner;

public class hacker_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the string
        System.out.print("Enter a string consisting of alphabets and digits: ");
        String num = scanner.nextLine();
        
        // Call the function to calculate and print the digit frequency
        digitFrequency(num);
        
        scanner.close();
    }
    
    public static void digitFrequency(String num) {
        // Initialize an array to store the frequency of each digit (0 to 9)
        int[] digitFreq = new int[10];
        
        // Iterate through each character in the string
        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            // Check if the character is a digit
            if (Character.isDigit(ch)) {
                // Convert the character to an integer and update its frequency
                int digit = Character.getNumericValue(ch);
                digitFreq[digit]++;
            }
        }
        
        // Print the frequencies of each digit separated by space
        for (int i = 0; i < 10; i++) {
            System.out.print(digitFreq[i] + " ");
        }
    }
}
