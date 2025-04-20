import java.util.Objects;
import java.util.Scanner;

class BankAccount
{
    private String acc_name;
    private int acc_number;
    private int acc_balance;

    BankAccount()
    {
        acc_name = null;
        acc_number = 0;
        acc_balance = 0;
    }

    void setname(String n)
    {
        acc_name = n;
    }

    String getname()
    {
        return acc_name;
    }

    void setnumber(int num)
    {
        acc_number = num;
    }

    int getnumber()
    {
        return acc_number;
    }

    void setbalance(int b)
    {
        acc_balance = b;
    }

    int getbalance()
    {
        return acc_balance;
    }

    void deposit(int d)
    {
        acc_balance = d;
    }

    void withdraw(int w)
    {
        if(w>0 && w<=acc_balance)
        {
            acc_balance = acc_balance - w;
            System.out.println("You have successfully withdraw RS." + w);
        }
        else{
            System.out.println("You have insufficient funds to withdraw");
        }
    }
}

public class Bank_Management_System{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\n\t\t*** Account 1 ***");
        BankAccount B1 = new BankAccount();
        System.out.print("Enter Account holder name: ");
        String name = s.nextLine();
        B1.setname(name);
        System.out.print("Enter account number: ");
        int num = s.nextInt();
        B1.setnumber(num);
        System.out.print("Enter account balance: ");
        int bal = s.nextInt();
        B1.deposit(bal);
        s.nextLine();

        System.out.println("\n\t\t*** Account 2 ***");
        BankAccount B2 = new BankAccount();
        System.out.print("Enter Account holder name: ");
        name = s.nextLine();
        B2.setname(name);
        System.out.print("Enter account number: ");
        num = s.nextInt();
        B2.setnumber(num);
        System.out.print("Enter account balance: ");
        bal = s.nextInt();
        B2.deposit(bal);

        System.out.println("\n\t\t*** Compare Account names ***");
        if(Objects.equals(B1.getname(), B2.getname()))
        {
            System.out.println("Both accounts belong to :" + B1.getname() + ".");
        }
        else{
            System.out.println("Both accounts have different account holder.");
        }

        System.out.println("\n\t\t*** Compare Account balances ***");
        if(B1.getbalance()>B2.getbalance())
        {
            System.out.println("Following account has high balance:");
            System.out.println("\tAccount name: " + B1.getname());
            System.out.println("\tAccount balance: " + B1.getbalance());
        }
        else if(B1.getbalance()<B2.getbalance())
        {
            System.out.println("Following account has high balance:");
            System.out.println("\tAccount name: " + B2.getname());
            System.out.println("\tAccount balance: " + B2.getbalance());
        }
        else{
            System.out.println("Both accounts have same balance.");
        }
    }
}

