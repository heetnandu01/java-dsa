/*
123456
1    6
123456
 */




import java.util.Scanner;

public class hollownum {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int c = input.nextInt();
        for(int i =1; i<=r;i++){
            for(int j =1; j<=c; j++){
                if(i == 1 || i==r || j== 1 || j==c)
                System.out.print(j);
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
