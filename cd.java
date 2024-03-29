import java.util.Arrays;

public class cd {
    public static void main(String[] args) {
        int arr[]=new int[]{9,7,1,4,3,5,0,2,6};
        Arrays.sort(arr);
      int start=arr[0];
     int  end = arr.length;
    for(int i=0;i<arr.length;i++){
        System.out.println(start);
        System.err.println(end);
        start++;
        end--; 
      }
  } 
}