/*
   1
  121
 12321
1234321
 */
import java.util.Scanner;

public class numpyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        for(int i =1; i<=r;i++){
            for(int j =1; j<= r-i;j++){
                System.out.print(" ");
            }
            // print 1 to i
            for(int k =1; k<=i; k++){
                System.out.print(k);
            }
            // print i-1 to 1
            for(int l = i-1; l >= 1; l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}





















