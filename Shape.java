package project02;



public interface Shape {
    /*Create an Interface 'Shape' with undefined methods as calculateArea
    and calculatePerimiter. Create 2 classes Circle & Square that
implements functionality defined in the Shape Interface. Test your
    code.*/
    double Pie=3.14;
    int Radius=8;
    int Length=4;
    int Width=4;
    void calculateArea();

    void calculatePerimeter();
}
class Circle implements Shape{


    @Override
    public void calculateArea() {
        System.out.println("Area of circle = "+Pie*(Radius*Radius));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of circle ="+2*Pie*Radius);
    }
}
class Square implements Shape{

    @Override
    public void calculateArea() {
        System.out.println("Area of square ="+Length*Width);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of square ="+(2*Length+2*Width));
    }
}

