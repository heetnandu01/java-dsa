// example of an if-else statement 

import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.println("Enter the age: ");
        // int age = input.nextInt();
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        // program to write a number which is even and divsible by 3

        // if(num % 2 == 0 && num % 3 == 0){
        //     System.out.println("even");
        // }else{
        //     System.out.println("odd");
        // }
         
        // program to print the value if it is divsible by 3 or 5 
        
        if(num % 3 == 0 || num % 5 == 0){
            System.out.println(num);
        }





        // if(num % 2 == 0){
        // System.out.println("the number is even");
        // }
        // else{
        // System.out.println("the number is odd");
        // }

        // example of an if else if statement

        // if(age <= 12 ){
        // System.out.println("child");
        // }else if (age > 12 && age <= 18) {
        // System.out.println("teenager");
        // }else{
        // System.out.println("adult");
        // }

        // example of an nested if-else statement

        // if (age <= 12) {
        //     if (age <= 5) {
        //         System.out.println("todler");
        //     } else {
        //         System.out.println("child");
        //     }
        // } else if (age > 13 && age <= 18) {
        //     System.out.println("teenager");
        // } else {
        //     System.out.println("adult");
        // }

        // String ans;
        // ans = (num % 2 == 0) ? "even" : "odd";
        // System.out.println(ans);


    }
}
