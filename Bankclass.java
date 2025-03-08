class Bank{
    private int id;
    private String name;
    private int balance;
    static int total_balance = 0;

    Bank(){
        id = 0;
        name = null;
        balance = 0;
    }
    void setdata (String n, int b,int i)
    {
        id = i;
        name = n;
        balance = b;
        total_balance += balance;
    }
    void getdata()
    {
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Balance : " + balance);
        System.out.println("Total Balance : " + total_balance);
    }
}
public class Bankclass{
    public static void main(String[] args) {
        Bank B1 = new Bank();
        B1.setdata("Ahmad",1000,1);
        B1.getdata();
        Bank B2 = new Bank();
        B2.setdata("Ali",1500,2);
        B2.getdata();
        Bank B3 = new Bank();
        B3.setdata("Abdullah",1000,3);
        B3.getdata();
        Bank B4 = new Bank();
        B4.setdata("Azeem",1000,4);
        B4.getdata();
    }
}
