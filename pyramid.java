import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();

        for(int i =0;i <= r;i++){ // traversing over rows 
            // print r-i spaces

            for(int j =1;j <= r-i;j++){
                System.out.print(" ");
            }
             // print 2*i-1\
            
            for(int k = 1; k <= 2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}