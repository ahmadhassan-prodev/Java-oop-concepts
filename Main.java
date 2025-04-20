class Shape
{
    Shape()
    {

    }

    double area()
    {
        double r = 0;
        return r;
    }
    void displayShape()
    {
        System.out.println("This is a shape");
    }

    int compareArea(Shape S2)
    {
        if(this.area()>S2.area())
        {
            return 1;
        }
        else if(this.area()<S2.area())
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}

class Circle extends Shape{
    private int radius;

    Circle()
    {

    }
    Circle(int r)
    {
        radius = r;
    }

    double area()
    {
        double a = 3.14 * radius * radius;
        return a;
    }
    void displayShape()
    {
        System.out.println("This is a circle");
    }

    int compareArea(Circle C2)
    {
        if(this.area()>C2.area())
        {
            return 1;
        }
        else if(this.area()<C2.area())
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
class Rectangle extends Shape{
    private double width;
    private double height;

    Rectangle()
    {

    }
    Rectangle(double a, double b)
    {
        width = a;
        height = b;
    }

    double area()
    {

        return (width*height);
    }
    void displayShape()
    {
        System.out.println("This is a rectangle");
    }
    int compareArea(Rectangle R2)
    {
        if(this.area()>R2.area())
        {
            return 1;
        }
        else if(this.area()<R2.area())
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
class Triangle extends Shape{
    private double base;
    private double height;

    Triangle()
    {

    }
    Triangle(double b, double h)
    {
        base = b;
        height = h;
    }

    double area()
    {
        return (0.5*base*height);
    }
    void displayShape()
    {
        System.out.println("This is a triangle");
    }

    int compareArea(Triangle T2)
    {
        if(this.area()>T2.area())
        {
            return 1;
        }
        else if(this.area()<T2.area())
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Circle C1 = new Circle(4);
        Circle C2 = new Circle(4);
        Rectangle R1 = new Rectangle(3.4,7.9);
        Rectangle R2 = new Rectangle(6.2,4.6);
        Triangle T1= new Triangle(8.5,7.4);
        Triangle T2 = new Triangle(3,6.4);


        System.out.println("\nCircle details");
        C1.displayShape();
        System.out.println("Area 1 = " + C1.area());
        System.out.println("Area 2 = " + C2.area());
        System.out.println("Compare Area");
        int result1 = C1.compareArea(C2);
        if(result1==1)
        {
            System.out.println("Area 1 is greater than Area 2");
        }
        else if(result1==-1)
        {
            System.out.println("Area 2 is greater than Area 1");
        }
        else if(result1 == 0)
        {
            System.out.println("Both area are equal");
        }

        System.out.println("\nRectangle details");
        R1.displayShape();
        System.out.println("Area 1 = " + R1.area());
        System.out.println("Area 2 = " + R2.area());
        System.out.println("Compare Area");
        int result2 = R1.compareArea(R2);
        if(result2==1)
        {
            System.out.println("Area 1 is greater than Area 2");
        }
        else if(result2==-1)
        {
            System.out.println("Area 2 is greater than Area 1");
        }
        else if(result2 == 0)
        {
            System.out.println("Both area are equal");
        }

        System.out.println("\nTriangle details");
        T1.displayShape();
        System.out.println("Area 1 = " + T1.area());
        System.out.println("Area 2 = " + T2.area());
        System.out.println("Compare Area");
        int result3 = T1.compareArea(T2);
        if(result3==1)
        {
            System.out.println("Area 1 is greater than Area 2");
        }
        else if(result3==-1)
        {
            System.out.println("Area 2 is greater than Area 1");
        }
        else if(result3 == 0)
        {
            System.out.println("Both area are equal");
        }
    }
}
