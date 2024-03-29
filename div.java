import java.util.Arrays;
public class div {
    public static void main(String[] args) {
    int arr[]=new  int[]{1,2,3,3,4,1,2,4,5};
    int visited[]=new int [ arr.length];
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    for(int i=0;i<arr.length;i++)
    {
     visited[arr[i]]++;
    }    
    for(int i=1;i<visited.length;i++){
        if(visited[i]==0){
            continue;
        }
        {
        System.out.println(  i+" "+       visited[i]);
        }
    }

} 
}