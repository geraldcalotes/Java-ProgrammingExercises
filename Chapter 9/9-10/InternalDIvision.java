// Write your code here

public class InternationalDivision extends Division{
    String country;
    String language;

    public InternationalDivision(String divisionTitle,String acctnum,String country,String language){
        super(divisionTitle,acctnum);
        this.country = country;
        this.language = language;
    }

    public void display(){
        System.out.printf("International Division: %s Acct# %s%n",divisionTitle,acctNum);
        System.out.println("Located in "+this.country);
        System.out.println("Language is "+this.language);
    }
}