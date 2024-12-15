// inverted code

// import java.util.Scanner;

// public class pratice {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int r = input.nextInt();
//         for(int i =r; i >= 1;i--){
//             for(int j =1; j<= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// traingular code


// import java.util.Scanner;

// public class pratice {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int r = input.nextInt();
//         for(int i = 1; i<= r;i++){
//             for(int j = 1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// rectangular code

import java.util.Scanner;

public class pratice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int c = input.nextInt();

        for(int i = 1; i<= r;i++){
            for(int j = 1; j<= c;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}