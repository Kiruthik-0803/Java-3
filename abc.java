import java.util.Arrays;
import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
        
        int arr[]=new int[]{6,5,4,3,2,7,8,1,0,9};
        int min=0,max=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
        for(int i=0;i<arr.length;i++)
        if(arr[i]>max){
            max=arr[i];
        }
        System.out.println("\n"+max);
        for (int i=0;i<arr.length;i++)
        if(arr[i]<min){
             min=arr[i];         
    }
    System.out.println(min);
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter the element:");
    int n=scan.nextInt();
for (int i=0;i<arr.length;i++)
{

}
System.out.println(arr[n-1]);

 scan.close();  
}
}