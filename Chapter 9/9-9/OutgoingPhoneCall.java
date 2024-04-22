
public class OutgoingPhoneCall extends PhoneCall{

    int time;

    public OutgoingPhoneCall(String phoneNumber,int time){
        super(phoneNumber);
        this.time=time;
        setPrice(0.04);
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public double getPrice(){
        return price;
    }

    public void getInfo(){
        System.out.printf("Outgoing phone call %s %.2f per minute at %d minutes. Total is $%.2f%n%n",phoneNumber,price,time,(price * time));
    }//
}