class Int
{
    private int value;

    Int()
    {
        value = 0;
    }

    Int(int v)
    {
        value = v;
    }

    void Display()
    {
        System.out.println("Value = " + value);
    }

    static Int add(Int i, Int j)
    {
        Int k = new Int();
        k.value = i.value + j.value;
        return k;
    }

}


public class Intclass {
    public static void main(String[] args) {
        Int a = new Int();
        Int b = new Int(7);
        b.Display();
        Int c = new Int(17);
        c.Display();
        a = Int.add(b,c);
        System.out.println("After adding the values");
        a.Display();
    }
}
