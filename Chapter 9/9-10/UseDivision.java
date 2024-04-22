// Write your code here

import java.util.Scanner;

public class UseDivision{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input;

        System.out.print("Is this for a (D)omestic or (I)nternational division? >> ");
        input = in.nextLine();
        char ch = input.charAt(0);
        if (ch=='D'){
            String title,acct,state;
            System.out.print("Enter division name >> ");
            title = in.nextLine();
            System.out.print("Enter acct number >> ");
            acct = in.nextLine();
            System.out.print("Enter state >> ");
            state = in.nextLine();
            DomesticDivision dom = new DomesticDivision(title,acct,state);
            dom.display();
        }else if (ch=='I'){
            String title,acct,country,language;
            System.out.print("Enter division name >> ");
            title = in.nextLine();
            System.out.print("Enter acct number >> ");
            acct = in.nextLine();
            System.out.print("Enter country >> ");
            country = in.nextLine();
            System.out.print("Enter language >> ");
            language = in.nextLine();
            InternationalDivision im = new InternationalDivision(title,acct,country,language);
            im.display();
        }
    }