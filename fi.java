public class fi {
    final void add(int a){
        System.out.println("add");
    }

    public static void main(String[] args) {
         fi f=new fi();
         f.add(10);
         hi h=new hi();
         h.add();
    }
    
}
class hi extends fi {
 
    void add(){
        System.out.println("add");
    }
    }
