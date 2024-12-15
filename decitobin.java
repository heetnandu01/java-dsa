import java.util.Scanner;

public class decitobin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int decimal = input.nextInt();
        int ans = 0; // binary number

        int num = 1; // power of 10

        while (decimal > 0) {
            int parity = decimal % 2;
            ans = ans + (parity * num);
            num = num*10;
            decimal = decimal/2;
        }
        System.out.println(ans);
    }
}
