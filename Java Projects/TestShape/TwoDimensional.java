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
public abstract class TwoDimensional extends Shape
{
    private double dimension1;
    private double dimension2;
    
    //constructor
    public TwoDimensional (int x, int y, double d1, double d2)
    {
        super(x, y);
        dimension1 = d1;
        dimension2 = d2;             
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
    
    //setters
    public void setDimension1(double d1)
    {
        dimension1 = d1;
    }
    
    public void setDimension2(double d2)
    {
        dimension2 = d2;
    }
    
}
