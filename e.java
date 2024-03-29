
public class e {
    public static void main(String[] args) {
    int arr[]=new  int[]{1,2,3,3,4,1,2,4};
    boolean visited[]=new boolean [arr.length];
    for(int i=0;i<arr.length;i++)
    {
     visited[i]=false;
    }
    for(int i=0;i<arr.length;i++)
    {
     visited[arr[i]]=true;
    }    
    for(int i=0;i<visited.length;i++){
        if(visited[i]==true)
        {
        System.out.println(i);
        }
    }
}
}
