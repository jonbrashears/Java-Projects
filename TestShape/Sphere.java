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
public class Sphere extends ThreeDimensional
{
    
    //constructor
    public Sphere(int x, int y, double radius)
    {
        super(x, y, radius, radius, radius);
    }
    
    //overridden methods
    public String getName()
    {
        return this.getClass().getName();
    }
    
    //calculates the volume of the sphere
    public double volume()
    {
        return Math.PI  * super.getDimension1() * super.getDimension1() * super.getDimension1() * (4/3);
    }
    
    //calculates the surface area of the sphere
    public double surfaceArea()
    {
        return Math.PI * 4 * super.getDimension1() * super.getDimension1();
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
        System.out.printf("%s: ThreeDimensional Shape of radius %.2f with a volume of %.2f and a surface area of %.2f.\n", getName(), getRadius(), volume(), surfaceArea());
    }
}
