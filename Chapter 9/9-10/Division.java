// Write your code here
public abstract class Division{
    String divisionTitle;
    String acctNum;
    abstract void display();

    public Division(String divisionTitle,String acctNum){
        this.divisionTitle = divisionTitle;
        this.acctNum = acctNum;
    }

}