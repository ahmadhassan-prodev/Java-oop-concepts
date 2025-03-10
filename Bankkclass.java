class Bank
{
    private String dname;
    private int account_no;
    private String account_type;
    private int balance;

    Bank()
    {
        dname = null;
        account_no = 0;
        account_type = null;
        balance = 0;
    }
    Bank(String n, int id, String t, int b)
    {
        dname = n;
        account_no = id;
        account_type = t;
        balance = b;
    }
    void Deposit(int d)
    {
        balance = balance + d;
        System.out.println("Successfully Deposited amount : " + d);
    }

    void Withdraw(int w)
    {
     if (balance >0 && balance >= w)
     {
         balance = balance - w;
         System.out.println("Successfully withdraw amount : " + w);
     }
     else {
         System.out.println("Not a sufficient balance in bank account");
     }
    }

    void Display()
    {
        System.out.println("Name = " + dname);
        System.out.println("Balance = " + balance);
    }

}

public class Bankkclass
{
    public static void main(String[] args) {
    Bank B1 = new Bank("Ali", 1456, "Current", 3000);
    B1.Display();
    System.out.println();
    B1.Deposit(500);
    System.out.println();
    B1.Display();
    System.out.println();
    B1.Withdraw(3500);
    System.out.println();
    B1.Display();
    }
}
