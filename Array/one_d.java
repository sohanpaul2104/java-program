import java.util.*;
public class one_d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter size of array : ");
        n = sc.nextInt();
        int arr[];
        arr = new int[n];
        System.out.println("Enter array element : ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Print array element : ");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }    
}
