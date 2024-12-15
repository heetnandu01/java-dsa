/*
    1
  2   2
 3      3
 44444444
 */

 import java.util.Scanner;

 public class hollowpyramid{
     public static void main(String[] args) {
         Scanner input= new Scanner(System.in);
         int r = input.nextInt();
         for (int i = 1;i<=r;i++){
             for (int j = 1;j<=r-i;j++){
                System.out.print(" ");
            }
             for (int k = 1;k<=2*i-1;k++){
                if(k==1||k==2*i-1||i==r){
                System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
