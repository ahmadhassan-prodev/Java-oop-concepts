import java.util.Scanner;

class Travel{
    private double kilometers;
    private double hours;

    Travel()
    {
     kilometers = 0;
     hours = 0;
    }

    void get()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter kilometers = ");
        kilometers = s.nextDouble();
        System.out.print("Enter hours = ");
        hours = s.nextDouble();
    }

    void Display()
    {
        System.out.println("Kilometers = " + kilometers);
        System.out.println("Hours = " + hours);
    }

    static Travel add(Travel a, Travel b)
    {
        Travel c = new Travel();
        c.kilometers = a.kilometers + b.kilometers;
        c.hours = a.hours + b.hours;
        return c;
    }
}

public class Travelclass {
    public static void main(String[] args) {
    Travel T1 = new Travel();
    Travel T2 = new Travel();
        System.out.println("Enter Travel 1 details");
    T2.get();
    Travel T3 = new Travel();
        System.out.println("\nEnter Travel 2 details");
    T3.get();
    T1 = Travel.add(T2,T3);
        System.out.println("\nTravel 1 details");
        T2.Display();
        System.out.println("\nTravel 2 details");
        T3.Display();
        System.out.println("\nSum of Travel 1 and Travel 2");
        T1.Display();

    }
}
