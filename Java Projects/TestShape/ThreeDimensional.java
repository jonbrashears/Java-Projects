/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testshape;

/**
 *
 * @author Jonathan
 */
public abstract class ThreeDimensional extends Shape
{
    private double dimension1;
    private double dimension2;
    private double dimension3;
    
    //constructor
    public ThreeDimensional(int x, int y, double d1, double d2, double d3)
    {
        super(x, y);
        dimension1 = d1;
        dimension2 = d2;
        dimension3 = d3;
    }
    
    //getters
    public double getDimension1()
    {
        return dimension1;
    }
    
    public double getDimension2()
    {
        return dimension2;
    }
    
    public double getDimension3()
    {
        return dimension3;
    }
    
    //setters
    public void setDimension1(double d1)
    {
        dimension1 = d1;
    }
    
    public void setDimension2(double d2)
    {
        dimension2 = d2;
    }
    
    public void setDimension3(double d3)
    {
        dimension3 = d3;
    }
}
