import java.util.Scanner;

public class DemoPhoneCalls{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
    
        String pnum,str;
        char input=' ';
        int time=0;

        while (input!='Q'){
            System.out.println("Is this call (I)ncoming or (O)utgoing?");
            System.out.print("Or enter Q to quit >> ");
            str = in.nextLine();
            input = str.charAt(0);
            if (input=='Q')break;
            System.out.print("Enter the phone number >> ");
            pnum = in.nextLine();
            PhoneCall pCall = null;
            switch(input){
                case 'I':
                    IncomingPhoneCall iCall = new IncomingPhoneCall(pnum);
                    pCall=iCall;
                    break;
                case 'O':
                    System.out.print("Enter minutes >> ");
                    time = in.nextInt();in.nextLine();
                    OutgoingPhoneCall oCall = new OutgoingPhoneCall(pnum,time);
                    pCall=oCall;
                    break;
            }
            pCall.getInfo();
            input=' ';
        }
    }
}