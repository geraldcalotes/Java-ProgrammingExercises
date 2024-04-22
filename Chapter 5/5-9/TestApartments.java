// Write your code here
// Apt #102    2 bedrooms, and 1.5 baths. Rent $775.0
// Apt #103    3 bedrooms, and 2.0 baths. Rent $870.0
// Apt #104    3 bedrooms, and 2.5 baths. Rent $960.0
// Apt #105    3 bedrooms, and 3.0 baths. Rent $1100.0
// public Apartment(int aptNumber,int bedrooms,int baths,double rent){

import java.util.Scanner;

public class TestApartments{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Apartment apt1 = new Apartment(101,1,1.0,500);
        Apartment apt2 = new Apartment(102,2,1.5,775);
        Apartment apt3 = new Apartment(103,3,2.0,870);
        Apartment apt4 = new Apartment(105,3,2.5,960);
        Apartment apt5 = new Apartment(105,3,3.0,1100);
        int beds;
        double rent,baths;

        
        System.out.print("Enter minimum number of bedrooms needed >> ");
        beds = in.nextInt();
        System.out.print("Enter minimum number of bathrooms needed >> ");
        baths =  in.nextDouble();
        System.out.print("Enter maximum rent willing to pay >> ");
        rent = in.nextDouble();



    }
}