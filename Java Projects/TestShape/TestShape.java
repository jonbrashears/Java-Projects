/*
The world of shapes is much richer than the shapes included in the inheritance hierarchy

of Fig. 9.3. Write down all the shapes you can think of—both two-dimensional and three-dimen-
sional—and form them into a more complete Shape hierarchy with as many levels as possible. Your

hierarchy should have class Shape at the top. Classes TwoDimensionalShape and ThreeDimension-
alShape should extend Shape. Add additional subclasses, such as Quadrilateral and Sphere, at their

correct locations in the hierarchy as necessary.
 */
package testshape;

public class TestShape {

    public static void main(String[] args) 
    {
        Circle circle1 = new Circle(1, 1, 2.5); //new circle object
        Square square1 = new Square(1, 1, 4.2); //new square object
        Sphere sphere1 = new Sphere(1, 1, 7.3); //new sphere object
        Cube cube1 = new Cube(1, 1, 8.4);       //new cube object
        
        //prints the values of the declared objects
        circle1.print(); 
        square1.print();
        sphere1.print();
        cube1.print();
        
    }
    
}
