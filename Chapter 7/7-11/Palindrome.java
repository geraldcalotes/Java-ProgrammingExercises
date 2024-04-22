// Write your code here
import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str;

        System.out.print("Enter a string >> ");
        str = in.nextLine().trim().replaceAll("\\s","");

        int cnt = str.length();
        boolean isNotPalindrome=false;
        for(char ch:str.toCharArray()){
            char bchar = str.charAt(cnt-1);
            if (ch != bchar){
                System.out.println("No, you did not enter a palindrome");
                isNotPalindrome=true;
                break;
            }
            cnt--;
        }
       if (isNotPalindrome==false){
                System.out.println("Yes, you entered a palindrome");
       } 
    }
}