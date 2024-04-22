import java.util.Arrays;
import java.util.Scanner;

public class Alphabetize2{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] txtArray = new String[3];

        System.out.print("Enter first string >> ");
        txtArray[0] = in.nextLine();
        System.out.print("Enter second string >> ");
        txtArray[1] = in.nextLine();
        System.out.print("Enter third string >> ");
        txtArray[2] = in.nextLine();
        Arrays.sort(txtArray,String.CASE_INSENSITIVE_ORDER);
        for(String str:txtArray){
            System.out.printf("%s ",str);
        }
       in.close(); 
    }
}
