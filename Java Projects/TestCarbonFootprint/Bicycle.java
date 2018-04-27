package testcarbonfootprint;

public class Bicycle implements CarbonFootprint 
{
    private double distance;        //holds number of miles ridden
    private double emissionFactor;  //holds emission factor
    
    //constructor
    public Bicycle(double miles, double emissions)
    {
        this.distance = miles;  
        this.emissionFactor = emissions;    
    }
    
    //setters
    public void setDistance(double miles)
    {
        this.distance = miles;
    }
    
    public void setEmissionFactor(double emissions)
    {
        this.emissionFactor = emissions;
    }
    
    //getters
    public double getDistance()
    {
        return this.distance;
    }
    
    public double getEmissionFactor()
    {
        return this.emissionFactor;
    }
    
    //calculates carbon footprint
    @Override
    public double getCarbonFootprint()
    {
          return this.distance * this.emissionFactor;
    }
    
    //Converts variables to string and returns them
    @Override
    public String toString()
    {
        return String.format("Bicycle:\tMiles: %,.2f\t\temission factor: %,.2f\tCarbon footprint: %,.2f pounds of carbon", 
                this.distance, this.emissionFactor, getCarbonFootprint());
    }
}

