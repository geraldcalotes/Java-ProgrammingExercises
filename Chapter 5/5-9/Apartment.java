// Write your code here
// Create a class named Apartment that holds an apartment number as aptNumber, number of bedrooms as bedrooms, number of baths as baths, and rent amount as rent.

// Create a default constructor that accepts no arguments and an overloaded constructor that accepts values for each data field.

// Also create a get method for each field.

public class Apartment{
    public int aptNumber;
    public int bedrooms;
    public double baths;
    public double rent;

    public Apartment(){}

    public Apartment(int aptNumber,int bedrooms,double baths,double rent){
        this.aptNumber = aptNumber;
        this.bedrooms = bedrooms;
        this.baths = baths;
        this.rent = rent;

    }

    public int getAptNumber(){
        return this.aptNumber;
    }
    public int getBedrooms(){
        return this.bedrooms;
    }
    public double getBaths(){
        return this.baths;
    }
    public double getRent(){
        return this.rent;
    }
}