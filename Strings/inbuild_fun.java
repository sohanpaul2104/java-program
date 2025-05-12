//import java.util.*;
public class inbuild_fun {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str);
        System.out.println("Length of string : " + str.length());// print length of string
        System.out.println("2nd Element : " + str.charAt(3));// fetch element of particular index
        System.out.println("index of l : " + str.indexOf('l'));// fetch index of particular character of first occurance
        System.out.println("ll is present " + str.contains("ll"));// check if a substring are contain in the string or not => return true or false 
        System.out.println("Uppercase : " + str.toUpperCase());// change uppercase
        System.out.println("Lowercase : " + str.toLowerCase());// change lowercase
        String s1 = "abc";
        String s2 = "def";
        System.out.println(s1.concat(s2));//concate two string in one string
    }
}
