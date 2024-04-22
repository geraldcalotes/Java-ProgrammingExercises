// Write your code here
import java.util.Arrays;
import java.util.Scanner;

public class Alphabetize{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] txtArray = new String[3];
        String[] clone;

        System.out.print("Enter first string >> ");
        txtArray[0] = in.nextLine().toLowerCase();
        System.out.print("Enter second string >> ");
        txtArray[1] = in.nextLine().toLowerCase();
        System.out.print("Enter third string >> ");
        txtArray[2] = in.nextLine().toLowerCase();
        clone = txtArray.clone();
        Arrays.sort(clone);
        if (Arrays.equals(txtArray,clone)){
            System.out.println("Yes, the strings entered are in alphabetical order");
        }else{
            System.out.println("No, the strings entered are not in alphabetical order");
        }

       in.close(); 
    }
}