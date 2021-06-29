
package testcarbonfootprint;

public class Building implements CarbonFootprint
{
    private double kiloWattHours;   //holds kilowatt hours
    private double emissionFactor;  //holds emission factor
    
    //constructor
    public Building(double kiloWatt, double emissions)
    {
        this.kiloWattHours = kiloWatt;
        this.emissionFactor = emissions;
    }
    
    //setters
    public void setKiloWattHours(double kiloWatt)
    {
        this.kiloWattHours = kiloWatt;
    }
    
    public void setEmissionFactor(double emissions)
    {
        this.emissionFactor = emissions;
    }
    
    //getters
    public double getKiloWattHours()
    {
        return this.kiloWattHours;
    }
    
    public double getEmissionFactor()
    {
        return this.emissionFactor;
    }
    
    //calculates carbon footprint
    @Override
    public double getCarbonFootprint()
    {
          return this.kiloWattHours * this.emissionFactor;
    }
    
    //Converts variables to string and returns them
    @Override
    public String toString()
    {
        return String.format("Building:\tKilowatt/hours: %,.2f\temission factor: %,.2f\tCarbon footprint: %,.2f pounds of carbon", 
                this.kiloWattHours, this.emissionFactor, getCarbonFootprint());
    }
}
