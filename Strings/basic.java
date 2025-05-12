import java.util.*;
public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Hello";
        System.out.println(str);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        System.out.println("Display the stirng : " + s);
        System.out.println("Length of string : " + s.length());// print length of string
        System.out.println("2nd Element : " + s.charAt(1));// fetch element of particular index
        System.out.println("index of l : " + str.indexOf('l'));// fetch index of particular character of first occurance
        System.out.println("ll is present " + str.contains("ll"));// check if a substring are contain in the string or not => return true or false 
        sc.close();
    }
}
