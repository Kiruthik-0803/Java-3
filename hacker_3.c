#include <stdio.h>

int series_term(int n, int a, int b, int c) {//5,1,2,3 
    if (n == 1) {
        return a;
    } else if (n == 2) {
        return b;
    } else if (n == 3) {
        return c;
    } else {
        return series_term(n - 1, a, b, c) + series_term(n - 2, a, b, c) + series_term(n - 3, a, b, c);
    }
}

int main() {
    int n, a, b, c;

    printf("Enter the value of n: ");
    scanf("%d", &n);

    printf("Enter the first three terms (a, b, c): ");
    scanf("%d %d %d", &a, &b, &c);

    if (n < 1) {
        printf("Invalid input: n must be at least 1.\n");
        return 1;
    }

    int nth_term = series_term(n, a, b, c);
    printf("The %dth term of the series is: %d\n", n, nth_term);

    return 0;
}
