// Write your code here

public class Purchase {
    private int invoiceNumber;
    private double saleAmount;
    private double tax;

    public void setInvoiceNumber(int inv){
        this.invoiceNumber = inv;
    }

    public int getInvoiceNumber(){
        return this.invoiceNumber;
    }

    public void setSaleAmount(double amt){
        this.tax = amt * 0.05;
        this.saleAmount = amt;
    }

    public double getSaleAmount(){
        return this.saleAmount;
    }

    public void display(){
        // System.out.printf("Invoice #%d  Amount of sale: $%.2f Tax: $%.14f%n",this.invoiceNumber,this.saleAmount,this.tax);
        System.out.printf("Invoice #%d  Amount of sale: $%.2f  Tax: $%.16f%n",this.invoiceNumber,this.saleAmount,this.tax);
    }
    //testing   
}