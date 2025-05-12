import java.util.*;
public class for_each_2d_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements : ");
        int num[][] = new int[3][4];
        for(int i = 0;i<3;i++){
            for(int j = 0;j<4;j++){
                num[i][j] = sc.nextInt();
            }
        }
        for(int x[]:num){
            for(int y:x){
                System.out.print(y);
            }
            System.out.println();
        }
        sc.close();

    }    
}
