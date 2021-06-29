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
public class Cube extends Sphere
{
     //constructor
    public Cube(int x, int y, double side)
    {
        super(x, y, side);
    }
    
    //overridden methods
    @Override public String getName()
    {
        return this.getClass().getName();
    }
    
    //calculates the volume of the cube
    @Override public double volume()
    {
        return super.getDimension1() * super.getDimension1() * super.getDimension1();
    }
    
    //calculates the surface are of the cube
    @Override public double surfaceArea()
    {
        return super.getDimension1() * super.getDimension1() * 6;
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
        System.out.printf("%s: ThreeDimensional Sphere Shape of side length %.2f with a volume of %.2f and a surface area of %.2f.\n", getName(), getSide(), volume(), surfaceArea());
    }
}
