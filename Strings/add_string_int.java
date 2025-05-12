public class add_string_int {
    public static void main(String[] args) {
        String str = "abc";
        str = str + "xyz";
        str += 'r';
        str += 20;
        System.out.println(str);
        System.out.println("mno" + 10 + 20);// both same operator so calculate starts from left side
        System.out.println("trr"+ (10+30));// calculate bracect first using BODMAS rule 
    }
}
