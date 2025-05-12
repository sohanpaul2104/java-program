public class equals {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        System.out.println(s1==s2);// return true because same address... "==" compare address first if equal then true else false..
        System.out.println(s1==s3);// return false because different address.....
        System.out.println(s1.equals(s3));// return true ...."equals()" compare address first if different then compare strings..
    }
}
