/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testshape;


public class Circle extends TwoDimensional
{
    //constructor
    public Circle(int x, int y, double radius)
    {
        super(x, y, radius, radius);
    }
    
    //overridden methods
    public String getName()
    {
        return this.getClass().getName();
    }
    
    //calculates the area of the circle
    public double area()
    {
        return Math.PI  * super.getDimension1() * super.getDimension1();
    }
    
    //calculates the perimeter of the circle
    public double perimeter()
    {
        return Math.PI * super.getDimension1() * 2;
    }
    
    //setter
    public void setRadius(double radius)
    {
        super.setDimension1(radius);
    }
    
    //getter
    public double getRadius()
    {
        return super.getDimension1();
    }
    
    //prints the name of the class, the superclasses, and the measurements of the class
    public void print()
    {
        System.out.printf("%s: TwoDimensional Shape of radius %.2f with an area of %.2f and a perimeter of %.2f.\n", getName(), getRadius(), area(), perimeter());
    }
}
