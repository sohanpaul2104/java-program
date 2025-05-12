// Using break to exit from nested loops
public class break_exit {
    public static void main(String[] args) {
        outer: for(int i = 0;i<3;i++){
            System.out.println("Pass "+ i +":");
            for(int j = 0;j<10;j++){
                if(j== 5) break outer;
                System.out.print(j + " ");
            }
            System.out.println("Not executed ");
        }
        System.out.println("Complete loop");
    }    
}
