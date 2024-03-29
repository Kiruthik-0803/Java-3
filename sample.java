class car{
    int milage=120;
    car()
    {
        System.out.println("good vechicle car");
    }
    car(int a,int b)
    {
        System.out.println(a+b);
    }
    static void add(int z) {
        
        System.out.println(z+z);
    }
}
class tata extends car{
 int milage = 130;
 tata(){
     System.out.println("milage"+super.milage+1);
     System.out.println("good company to buy car");
 }
 tata(int a,int b)
 {
     super(a,b);
     System.out.println(a-b);
     
 }
 static void add(int z,int y)
 {
     System.out.println("add"+(z+y));
 }
}
class punch extends tata{
 int milage =450;
 punch(){
     System.out.println("good model of car in the company");
 }
 punch(String s,String c)
 {
     System.out.println(s+c);
 }
 static void add(String r,String d)
 {
     System.out.println(r+d);
 }
}

class harrier extends punch{
 int milage=743;
 harrier()
 {
     System.out.println("somehow good model ");
 }
 harrier(String s,String c)
 {
     super(s,c);
     System.out.println(s.equalsIgnoreCase(c));
 }
 void print() {
     System.out.println("this is best program");
 }
 
 
}
public class sample {
 public static void main(String[] args) {
    car c =new car(6,7);
    tata t =new tata(9,8);
    punch p =new punch("good","health");
    harrier h = new harrier("good","bad");
    
    h.print();
    c.add(6);
    t.add(4,6);
    p.add("hello","super");
    
}
}