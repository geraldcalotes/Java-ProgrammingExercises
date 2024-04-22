// Write your code here
public class DomesticDivision extends Division{
    String state;

    public DomesticDivision(String divisionTitle,String acctnum,String state){
        super(divisionTitle,acctnum);
        this.state = state;
    }

    public void display(){
        System.out.printf("Domestic Division: %s Acct# %s%n",divisionTitle,acctNum);
        System.out.println("Located in "+this.state);
    }
}