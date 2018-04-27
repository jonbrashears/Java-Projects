/*
The world of shapes is much richer than the shapes included in the inheritance hierarchy

of Fig. 9.3. Write down all the shapes you can think of—both two-dimensional and three-dimen-
sional—and form them into a more complete Shape hierarchy with as many levels as possible. Your

hierarchy should have class Shape at the top. Classes TwoDimensionalShape and ThreeDimension-
alShape should extend Shape. Add additional subclasses, such as Quadrilateral and Sphere, at their

correct locations in the hierarchy as necessary.
 */
package testshape;

public abstract class Shape 
{
    private int x;
    private int y;
    
    //constructor
    public Shape(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    //setters
    public void setX(int x)
    {
        this.x = x;
    }
    
    public void setY(int y)
    {
        this.y = y;
    }
    
    //getters
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
}
