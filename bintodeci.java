// binary to decimal conversion


import java.util.Scanner;

public class bintodeci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int binary = input.nextInt();
        int ans = 0; // converted decimal number
        int num = 1; // 2 ^ 0 = 1 power of 2
        while (binary > 0){
            int unit_digit = binary % 10;
            ans = ans + unit_digit *num;
            binary = binary/10;
            num = num *2;
        }
        System.out.println(ans);
    }
}
 