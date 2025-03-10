import java.util.Scanner;

class tollBooth
{
    private int no_of_cars = 0;
    private double total_amount = 0;

    tollBooth()
    {
        no_of_cars = 0;
        total_amount = 0;
    }

    void payingCar()
    {
        no_of_cars ++;
        total_amount = total_amount + 0.50;
    }

    void nopayCar()
    {
        no_of_cars ++;
    }

    void Display()
    {
        System.out.println("Total number of cars = " + no_of_cars);
        System.out.println("Total money collected = $" + total_amount);
    }
}


public class toolBoothclass {
    public static void main(String[] args) {
        tollBooth T1 = new tollBooth();
        Scanner s = new Scanner(System.in);
        System.out.println("Choose the process\n1 : A paying car\n2 : A non-paying car\n0 : Exit");
        int p = s.nextInt();
        while(p!=0)
        {
            switch(p)
            {
                case 1:
                    T1.payingCar();
                    break;

                case 2:
                    T1.nopayCar();
                    break;

                default:
                    System.out.println("Incorrect choice");
                    System.out.println();
            }
            System.out.println("Choose the process\n1 : A paying car\n2 : A non-paying car\n0 : Exit");
            p = s.nextInt();
        }
        T1.Display();
    }
}
