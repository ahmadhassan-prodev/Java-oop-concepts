class LibraryUser{
    protected String userID;
    protected String name;
    protected String email;

    LibraryUser()
    {
        userID = null;
        name = null;
        email = null;
    }
    LibraryUser(String uID, String n, String e)
    {
        userID = uID;
        name = n;
        email = e;
    }
    void Display()
    {
        System.out.println("User ID: " + userID);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}

class Librarian extends LibraryUser{
    private int employeeID;
    private String workshift;

    Librarian ()
    {
    }
    Librarian(String uID, String n, String e,int eID, String s)
    {
        super(uID, n, e);
        employeeID = eID;
        workshift = s;
    }
    void Display()
    {
        System.out.println("***Librarian Details***");
        super.Display();
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Workshift: " + workshift);
    }
}

class Member extends LibraryUser{
    private int membershipID;
    private int borrowedBooksCount;

    Member()
    {
    }
    Member(String uID, String n, String e,int mID,int count)
    {
        super(uID, n, e);
        membershipID = mID;
        borrowedBooksCount = count;
    }
    void Display()
    {
        System.out.println("***Member Details***");
        super.Display();
        System.out.println("Membership ID: " + membershipID);
        System.out.println("Borrowed Books: " + borrowedBooksCount);
    }
}

class Guest extends LibraryUser{
    private String visitPurpose;

    Guest ()
    {
    }
    Guest(String uID, String n, String e,String vp)
    {
        super(uID, n, e);
        visitPurpose = vp;
    }
    void Display()
    {
        System.out.println("***Guest Details***");
        super.Display();
        System.out.println("Visit purpose: " + visitPurpose);
    }
}


public class LIbrary_Management_System {
    public static void main(String[] args) {
        Librarian L1 = new Librarian("U-123","Ahmad Hassan","ahmad@gmail.com",1,"Evening");
        Member M1 = new Member("U-456","Muhammad Azeem","azeem@gmail.com",2,4);
        Guest G1 = new Guest("U-789","Husnain Shahid","husnain@gmail.com","Research");

        L1.Display();
        System.out.println();

        M1.Display();
        System.out.println();

        G1.Display();
    }
}
