package balancingbrackets.main;

import balancingbrackets.balancelogic.StackBalance;

import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bracket string: ");
        String input = sc.nextLine();
        if(input.length()<1){
            System.out.println("String is empty...");
        }
        StackBalance sb = new StackBalance();
        if(sb.checkBalanceBracket(input)) {
            System.out.println("String is Balanced!!");
        }else{
            System.out.println("String is not Balanced!!");
        }
    }
}
