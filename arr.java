public class arr {
    
    public static int length;

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int arr1[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int arr2[][]=new int[arr.length][arr1.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                for (int k = 0; k < arr[0].length; k++) {
                    arr2[i][j] += arr[i][k] * arr1[k][j];
                    System.out.print(arr2[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}