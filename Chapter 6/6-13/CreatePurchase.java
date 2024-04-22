// Write your code here
import java.util.Scanner;

public class CreatePurchase{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double sales;
        int inv;

        System.out.print("Enter invoice number >> ");
        inv = in.nextInt();
        while ((inv < 1000) || (inv >8000)){
            System.out.print("Enter invoice number >> ");
            inv = in.nextInt();
        }
        System.out.print("Enter sale amount >> ");
        sales = in.nextDouble();

        while (sales < 0){
            System.out.print("Enter sale amount >> ");
            sales = in.nextDouble();
        }
        Purchase pr = new Purchase();
        pr.setInvoiceNumber(inv);
        pr.setSaleAmount(sales);
        pr.display();
        // testing

    }
}