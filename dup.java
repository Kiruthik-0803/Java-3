public class dup {
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,1,5,2,3,6,3,27};
        for(int fix=0;fix<a.length;fix++){
        if(a[fix]==-1)
          continue;
         for(int j=fix+1;j<a.length;j++){
            if(a[fix]==a[j]){
                a[j]=-1;
            }
        }
    }
        for(int i:a){
            if(i!=-1)
            System.out.print(i+" ");
        }
    }
}

