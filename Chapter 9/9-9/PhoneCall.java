
public abstract class PhoneCall{
    String phoneNumber;
    double price;

    abstract String getPhoneNumber();
    abstract double getPrice();
    abstract void getInfo();

    public PhoneCall(String phoneNumber){
        this.phoneNumber = phoneNumber;
        this.price = 0.0;
    }

    public void setPrice(double price){
        this.price = price;
    }
}