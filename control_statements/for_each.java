public class for_each {
    public static void main(String[] args) {
        int num[] = {3,5,2,1,8};
        int sum = 0;
        for(int x:num) sum += x;
        System.out.println(sum);
        // The for-each loop is essentially read-only
        for(int x:num) x = x * 10;// No change
        for(int x:num) System.out.println(x + " ");
    }    
}
