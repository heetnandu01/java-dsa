/*
121212
212121
121212
212121
 */




import java.util.Scanner;

public class numericalpattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int c = input.nextInt();
        for(int i =1; i<= r;i++){
            for(int j = 1; j<=c ;j++){
                if((i +j) % 2 == 0){
                    System.out.print(1);
                }else{
                    System.out.print(2);
                }
            }
            System.out.println();
        }
    }
}









