// numbers in a numerical pattern

/*
123456
123456
123456
 */

import java.util.Scanner;

public class num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int c = input.nextInt();
        for(int i = 1; i<= r; i++){
            for(int j = 1;j <= c;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
