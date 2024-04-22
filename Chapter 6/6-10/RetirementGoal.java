// Write your code here

import java.util.Scanner;

public class RetirementGoal {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int numyrs;
        double save;

        System.out.print("How many years until retirement? >> ");
        numyrs = in.nextInt();
        while(numyrs<=0){
            System.out.print("How many years until retirement? >> ");
            numyrs = in.nextInt();
        }
        System.out.print("How much can you save annually? >> ");
        save = in.nextDouble();
        while (save<=0){
            System.out.print("How much can you save annually? >> ");
            save = in.nextDouble();
        }
        System.out.printf("If you save $%.2f for %d years, you will have $%.2f",save,numyrs,(save*numyrs));
        
        
    }
}