
public class IncomingPhoneCall extends PhoneCall{

    public IncomingPhoneCall(String phoneNumber){
        super(phoneNumber);
        setPrice(0.02);
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public double getPrice(){
        return price;
    }

    public void getInfo(){
        System.out.printf("Incoming phone call %s $%.2f per call. Total is $%.2f%n%n",phoneNumber,price,price);
    }
}