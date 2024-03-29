#include <stdio.h>
#include <string.h>

void digit_frequency(char num[]) {
    // Initialize an array to store the frequency of each digit (0 to 9)
    int digit_freq[10] = {0};
    
    // Iterate through each character in the string
    for (int i = 0; num[i] != '\0'; i++) {
        // Check if the character is a digit
        if (num[i] >= 48 && num[i] <= 57) {
            // Convert the character to an integer and update its frequency
            digit_freq[num[i] - '0']++;
        }
    }
    
    // Print the frequencies of each digit separated by space
    for (int i = 0; i < 10; i++) {
        printf("%d ", digit_freq[i]);
    }
}

int main() {
    char num[100]; // Assuming the string length is less than 100
    
    // Input the string
    printf("Enter a string consisting of alphabets and digits: ");
    scanf("%s", num);
    
    // Call the function to calculate and print the digit frequency
    digit_frequency(num);
    
    return 0;
}
