// Write your code here

import java.util.Scanner;

public class TwelveDays{

    public static void main(String[] args){
        String[] xdays = new String[]{
            "A partridge in a pear tree",
            "Two turtle doves and",
            "Three French hens,",
            "Four calling birds,",
            "Five golden rings,",
            "Six geese a-laying,",
            "Seven swans a-swimming,",
            "Eight maids a-milking,",
            "Nine ladies dancing,",
            "Ten lords a-leaping,",
            "Eleven pipers piping,",
            "Twelve drummers drumming,"
        };

        int start;
        Scanner in = new Scanner(System.in);
        System.out.println("From what day do you want to start");
        System.out.print("the song The Twelve Days of Christmas? >> ");
        start = in.nextInt();

        System.out.printf("On the %d%s day of Christmas%n",start,getDay(start));
        System.out.println("My true love gave to me");

        for(int i=start-1;i!=0;i--){
            System.out.println(xdays[i]);
        }
       System.out.print("A partridge in a pear tree."); 
    }

    private static String getDay(int day){
        String sday;
        switch (day){
            case 1:
               sday="st";
               break;
            case 2:
                sday = "nd";
                break;
            case 3:
                sday = "rd";
                break;
            default:
                sday="th";
        }
        return sday;
    }
}