public class ex {
    public static void main(String[] args) {
        String n = "hello";
        String n1 = "hello,world";
        String str =new String("ABCD");
        System.out.println(n.equals(n1));
        System.out.println(n.concat(str));
        System.out.println(n.compareTo(n1));
        System.out.println(n.contains(n1));
        System.out.println(n.indexOf(n1));
        System.out.println(n.trim());
        System.out.println(remove(str));
        if(n==n1){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
    }

    public static String remove(String str) {
        return str;
    }
}