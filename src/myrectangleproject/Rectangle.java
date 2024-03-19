package myrectangleproject;

/**
 *
 * @author Connor Manuel ST10417350@vcconnect.edu.za ST10417350
 */
public class Rectangle 
{
    // Class field
    private double length;
    private double width;
    private double area;
    private double perimeter;
    
    // Default constructor
    public Rectangle()
    {
    }
    
    // Custom Constructor
    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
    
    //..........................Getters and setters..........................//    
    public double getLength()
    {
        return length;
    }
    
    public void setLength(double length)
    {
        this.length = length;
    }
    
    public double getWidth ()
    {
        return width;
    }
    
    public void setWidth (double width)
    {
        this.width = width;
    }
    
    public double getPerimeter ()
    {
        return perimeter;
    }
    
    public void setPerimeter ()
    {
        this.perimeter = perimeter;
    }
    //......................End of Getters and Setters........................//
    
    // Method to return calculation of area
    public double GetArea()
    {
        return this.area = length * width;
    }
    
    // Method to return calculation of perimeter
    public double GetPerimeter()
    {
        return this.perimeter = 2 * (length + width);
    }
    
    //..............................End of File...............................//
}
