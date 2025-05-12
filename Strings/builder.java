// String is immutable but StringBuilder is mutable.........
public class builder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Rohit");
        str.append(" Khanra");// add strings..
        System.out.println(str);
        str.setCharAt(0, 'M');// change a particular index..
        System.out.println(str);
        str.insert(2, 'e');// insert element in particular index not change...
        System.out.println(str);
        str.deleteCharAt(2);// delete element in particular index....
        System.out.println(str);
        str.reverse();// reverse string...
        System.out.println(str);
        str.reverse();
        str.delete(2, 4);// delete index start from 2 and end with (4-1) = 3;
        System.out.println(str);
        // some strings inbuild functions are also here....
    }
}
