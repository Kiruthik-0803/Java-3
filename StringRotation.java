public class StringRotation {
    public static void main(String[] args) {
        String str1 = "abcde", str2 = "deabc";

        if (str1.length() != str2.length()) {
            System.out.println("Second string is not a rotation of the first string");
        } else {
            str1 = str1.concat(str1);
            if (str1.indexOf(str2) != -1)
                System.out.println("Second string is a rotation of the first string:"+ str1);
            else
                System.out.println("Second string is not a rotation of the first string");
        }
    }
}