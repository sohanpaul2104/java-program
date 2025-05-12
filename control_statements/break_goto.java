// Using break as a civilized form of goto.
public class break_goto {
    public static void main(String[] args) {
        boolean t = true;

        first: {
            second: {
                third: {
                    System.out.println("third block");
                    if(t) break second;
                    System.out.println("not executed");
                }
                System.out.println("not executed");
            }
            System.out.println("After break");
        }
    }
}
