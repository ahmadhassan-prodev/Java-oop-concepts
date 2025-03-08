import java.util.Scanner;

class Product
    {
    private int id;
    private String pname;
    private int price;
    private int quantity;
    static int total_quantity = 0;
    static int sell_items = 0;
    static int sale_amount = 0;
    static int buy_quantity = 0;
    static int buy_amount = 0;

    Product(){
        id = 0;
        pname = null;
        price = 0;
        quantity = 0;
    }
    void addProduct()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter product name");
        pname = s.nextLine();
        System.out.println("Enter product id");
        id = s.nextInt();
        System.out.println("Enter product price");
        price = s.nextInt();
        System.out.println("Enter product quantity");
        quantity = s.nextInt();
        total_quantity += quantity;
    }
    void saleProduct()
    {
        if(quantity>0)
        {
            quantity--;
            total_quantity--;
            sell_items = sell_items + 1;
            sale_amount = sale_amount + price;
            buy_quantity += 1;
            buy_amount += price;
            System.out.println("Successfully buy the product : " + pname);
        }
        else
            System.out.println("Out of stock : " + pname);
    }
    void productDetails()
    {
        System.out.println("Product Id : " + id);
        System.out.println("Product name : " + pname);
        System.out.println("Product price : " + price);
        System.out.println("Product quantity : " + quantity);
        System.out.println("Total store quantity : " + total_quantity);
    }
    void checkSale()
    {
        System.out.println("Sold Items : " + sell_items);
        System.out.println("Total Sale amount : " + sale_amount);
    }
    void buyDetails()
    {
        System.out.println();
        System.out.println("* Buying details *");
        System.out.println("No of items buy : " + buy_quantity);
        System.out.println("Total amount : " + buy_amount);
    }
    void clearDetails()
    {
        buy_amount = 0;
        buy_quantity = 0;
    }

    int getId()
    {
        return id;
    }
    }

public class Productclass
{
    public static void main(String[] args)
    {
        Product P1 = new Product();
        Product P2 = new Product();
        Product P3 = new Product();
        Product P4 = new Product();
        Product P5 = new Product();
        int counter;
        char ch;
        int yes;
        int login = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Are you an admin or a user?\nAdmin : 1\nUser : 2\nExit : 0");
        login = s.nextInt();

        while (login != 0)
        {
                if (login == 1) {
                    System.out.println("Enter login password");
                    int password = s.nextInt();

                    if (password == 12345) {
                        System.out.println();
                        System.out.println("\t ***Choose the process***\n");
                        System.out.println("\t1 : Add product\n\t2 : View Product details\n\t3 : Check today's Sale\n\t0 : Main Menu");
                        int p = s.nextInt();
                        while (p != 0) {
                            counter = 1;
                            ch = 'Y';
                            switch (p) {
                                case 1:
                                    while (ch == 'Y') {
                                        if (counter == 1) {
                                            P1.addProduct();
                                            counter++;
                                        } else if (counter == 2) {
                                            P2.addProduct();
                                            counter++;
                                        } else if (counter == 3) {
                                            P3.addProduct();
                                            counter++;
                                        } else if (counter == 4) {
                                            P4.addProduct();
                                            counter++;
                                        } else if (counter == 5) {
                                            P5.addProduct();
                                            counter++;
                                        } else {
                                            System.out.println("Limit exceed");
                                            break;
                                        }
                                        System.out.println();
                                        System.out.println("Do you want to add other product?Enter 'Y'");
                                        ch = s.next().charAt(0);
                                    }
                                    break;

                                case 2:
                                    System.out.println("*** Product 1 ***");
                                    P1.productDetails();
                                    System.out.println();
                                    System.out.println("*** Product 2 ***");
                                    P2.productDetails();
                                    System.out.println();
                                    System.out.println("*** Product 3 ***");
                                    P3.productDetails();
                                    System.out.println();
                                    System.out.println("*** Product 4 ***");
                                    P4.productDetails();
                                    System.out.println();
                                    System.out.println("*** Product 5 ***");
                                    P5.productDetails();
                                    break;

                                case 3:
                                    System.out.println();
                                    System.out.println("* Following are the details of today's sale *");
                                    P5.checkSale();
                                    break;
                            }
                            System.out.println();
                            System.out.println("Do you want to perform another process?\nYes : 1\nExit : 0");
                            yes = s.nextInt();
                            if (yes == 1) {
                                System.out.println();
                                System.out.println("\t ***Choose the process***\n");
                                System.out.println("\t1 : Add product\n\t2 : View Product details\n\t3 : Check today's Sale\n\t0 : Main Menu");
                                p = s.nextInt();
                            } else
                                p = yes;
                        }
                    } else {
                        System.out.println("Incorrect Password");

                    }
                } else if (login == 2) {
                    System.out.println();
                    System.out.println("\t ***Choose the process***\n");
                    System.out.println("\t1 : Buy Product\n\t2 : View Product details\n\t0 : Main Menu");
                    int p = s.nextInt();
                    while (p != 0) {
                        counter = 1;
                        ch = 'Y';
                        switch (p) {
                            case 1:
                                while (ch == 'Y') {
                                    System.out.println("Enter the product Id");
                                    counter = s.nextInt();
                                    if (counter == P1.getId()) {
                                        P1.saleProduct();

                                    } else if (counter == P2.getId()) {
                                        P2.saleProduct();
                                    } else if (counter == P3.getId()) {
                                        P3.saleProduct();
                                    } else if (counter == P4.getId()) {
                                        P4.saleProduct();
                                    } else if (counter == P5.getId()) {
                                        P5.saleProduct();
                                    } else {
                                        System.out.println("Product Id is wrong");
                                        break;
                                    }
                                    System.out.println();
                                    System.out.println("Do you want to buy another product?Enter 'Y'");
                                    ch = s.next().charAt(0);
                                }
                                break;

                            case 2:
                                System.out.println("*** Product 1 ***");
                                P1.productDetails();
                                System.out.println();
                                System.out.println("*** Product 2 ***");
                                P2.productDetails();
                                System.out.println();
                                System.out.println("*** Product 3 ***");
                                P3.productDetails();
                                System.out.println();
                                System.out.println("*** Product 4 ***");
                                P4.productDetails();
                                System.out.println();
                                System.out.println("*** Product 5 ***");
                                P5.productDetails();
                                break;
                        }
                        System.out.println();
                        System.out.println("Do you want to perform another process?\nYes : 1\nProceed to bill : 0");
                        yes = s.nextInt();
                        if (yes == 1) {
                            System.out.println();
                            System.out.println("\t ***Choose the process***\n");
                            System.out.println("\t1 : Buy Product\n\t2 : View Product details\n\t0 : Main Menu");
                            p = s.nextInt();
                        } else {
                            p = yes;
                            P5.buyDetails();
                            P5.clearDetails();;
                        }

                    }
                } else {
                    System.out.println("Incorrect input");
                }
                System.out.println();
                System.out.println("Are you an admin or a user?\nAdmin : 1\nUser : 2\nExit : 0");
                login = s.nextInt();
        }
    }
}
