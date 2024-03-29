abstract class Iphone {
    abstract void processors();
    abstract void ram();
    void camera(){
        System.out.println("Iphone has camera");
    }
    public static void main(String[] args){
        Iphone obj=new Iphone11();
        obj.camera();
        obj.processors();
        obj.ram();
        Iphone obj1=new Iphone12();
        obj1.camera();
        obj1.processors();
        obj1.ram();
   }
}
class Iphone11 extends Iphone {
    void camera(){
        System.out.println("Iphone11 has camera");
    }
    void processors(){
        System.out.println("Iphone11 has processors");
    }
    void ram(){
        System.out.println("Iphone11 has ram");
    }
}
class Iphone12 extends Iphone{
    void camera(){
    System.out.println("Iphone12 has camera");
}
void processors(){
    System.out.println("Iphone12 has processors");
}
void ram(){
    System.out.println("Iphone12 has ram");
}   
}
