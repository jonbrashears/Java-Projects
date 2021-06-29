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
public class Square extends Circle
{
    //constructor
    public Square(int x, int y, double side)
    {
        super(x, y, side);
    }
    
    //overridden methods
    @Override public String getName()
    {
        return super.getClass().getName();
    }
    
    //calculates the area of the square
    @Override public double area()
    {
        return super.getDimension1() * super.getDimension1();
    }
    
    //calculates the perimeter of the square
    @Override public double perimeter()
    {
        return super.getDimension1() * 4;
    }
    
    //setter
    public void setSide(double side)
    {
        super.setDimension1(side);
    }
    
    //getter
    public double getSide()
    {
        return super.getDimension1();
    }
    
    //prints the name of the class, the superclasses, and the measurements of the class
    @Override public void print()
    {
        System.out.printf("%s: TwoDimensional Circle Shape of side length %.2f with an area of %.2f and a perimeter of %.2f.\n", getName(), getSide(), area(), perimeter());
    }
}
