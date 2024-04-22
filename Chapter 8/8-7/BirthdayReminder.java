// Write your code here
import java.util.Scanner;

public class BirthdayReminder{
    public static void main(String[] args){
        final int MAX=10;
        Scanner in = new Scanner(System.in);
        String[] names = new String[MAX];
        String[] bdays = new String[MAX];
        //test

        System.out.print("Enter a name >> ");
        names[0] = in.nextLine();
        System.out.print("Enter birthdate with slashes between the month, day, and year >> ");
        bdays[0]=in.nextLine();
        String name="";
        int x=1;
        for(int cnt=1;cnt<MAX;cnt++){
            System.out.print("Enter a name or ZZZ to quit >> ");
            name=in.nextLine();
            if (name.equals("ZZZ")) break;
            names[cnt]=name;
            System.out.print("Enter birthdate with slashes between the month, day, and year >> ");
            bdays[cnt] = in.nextLine();
            x++;
        }
        System.out.printf("Count of names entered: %s%n",x);
        for(int i=0;i<x;i++){
            System.out.println(names[i]);
        }
        
        String search="";
        while (!search.equals("ZZZ")){
            System.out.print("Enter a name to search for or ZZZ to quit >> ");
            search = in.nextLine();
            if (search.equals("ZZZ")) break;
            int id=-1;
            for(int i=0;i<x;i++){
                if (names[i].equals(search)){
                    id=i;
                    break;
                }
            }
            if (id>0){
                System.out.printf("%s's birthdate is %s%n",search,bdays[id]);
            }else{
                System.out.printf("Sorry, no entry for %s%n",search);
            }
        }
    
    } 
}