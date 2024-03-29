import java.util.Arrays;

public class bc {

    public static void main(String[] args) {
        int[] array1 = {4, 2, 6};
        int[] array2 = {1, 5, 3};
        int sum=0;

        int length = array1.length + array2.length;

        int[] result = new int[length];
        int pos = 0;
        for (int element : array1) {
            result[pos] = element;
            pos++;
        }

        for (int element : array2) {
            result[pos] = element;
            pos++;
        }

        for(int element:result) {
            System.out.print(element + " ");
    
    }
         Arrays.sort(result);
         System.out.println(result);
        int mid=result.length/2;
     sum=result[mid-1]+result[mid];

System.out.println("\nSum of two middle elements is :"+sum);
}
}