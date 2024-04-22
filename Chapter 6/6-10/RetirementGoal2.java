// Write your code here

import java.util.Scanner;

public class RetirementGoal2{
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
        System.out.printf("If you save $%.2f for %d years without interest, you will have $%.2f%n",save,numyrs,(save*numyrs));
        double compounded=0;
        for(int i=0;i<numyrs;++i){
           compounded += save; 
           compounded = compounded + compounded * 0.04; 
        }
        System.out.printf("If you save $%.2f for %d years, with 4.0%% interest, you will have $%.12f",save,numyrs,compounded);

    }
}