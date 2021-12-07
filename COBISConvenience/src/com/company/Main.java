package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> Product = new ArrayList<String>();       // set up arrays to hold store inventory, prices, the customer's order and their total
        ArrayList<Double> Price = new ArrayList<Double>();
        ArrayList<String> Order = new ArrayList<String>();
        ArrayList<Integer> total = new ArrayList<Integer>();

        Product.add("Red-Hot Spicy Doritos");  // adding products and prices
        Price.add(2.99);

        Product.add("Cool Ranch Doritos");
        Price.add(2.99);

        Product.add("Coke");
        Price.add(0.99);

        Product.add("Diet Coke");
        Price.add(0.99);

        Product.add("Pepsi");
        Price.add(0.99);

        Product.add("Five Hour Energy");
        Price.add(3.99);

        Product.add("Sunflower Seeds");
        Price.add(0.99);

        Product.add("Peanuts");
        Price.add(0.99);

        Product.add("Mac Book Chargers");
        Price.add(120.00);

        Product.add("Dell Chargers");
        Price.add(50.00);

        String shopOrLeave = "";       // init variables
        String cusinput = "";
        String cusname = "";
        String receipt = "";
        double purchasetotal = 0.0;
        double bigtotal = 0.0;

        System.out.println("Hi! Welcome to COBIS Convenience! If you would like to shop type 'shop'");
        shopOrLeave = keyboard.nextLine();

        if (shopOrLeave.equalsIgnoreCase("shop")) {  // print out line asking customers what they want
            System.out.print("You can choose from: \n  - Red Hot Spicy Doritos: $2.99 \n  - Cool Ranch Doritos: $2.99 \n -  Coke: $0.99 \n - Diet Coke: $0.99 \n - Pepsi: $0.99 \n - Five Hour Energy: $3.99 \n - Sunflower Seeds: $0.99 \n - Peanuts: $0.99 \n - Mac Book Charger: $120.00 \n - Dell Charger: $50.00");
            Order.clear();

            System.out.println("Enter Customer name");  // retrieve customer name
            cusname = keyboard.nextLine();
            while ((cusinput = keyboard.nextLine())) {
                receipt += "\n " + cusinput + " \n";
                purchasetotal = 0;
                System.out.println("Enter product you'd like to purchase. Type 'Check out' when you are complete):"); // prompt customer for name and then retrieve check out when they are done

                while (!(cusinput).equalsIgnoreCase("Check out")) {   // while the user is NOT typing in check out, look for these things
                    cusinput = keyboard.nextLine();

                    for (String item : Product) {
                        if (item.equals(cusinput)) {                            // takes users input and checks against the Product array then adds the price of that prodcut to reciept
                            purchasetotal += Price.get(Product.indexOf(item));
                            receipt += "\n" + cusinput;

                            if (!Order.contains(cusinput)) {  // adds item to list of item
                                Order.add((cusinput));
                                total.add(1);

                            } else {
                                break;  // gets you out of loop
                            }
                        }
                    }
                }
                receipt += "\n" + purchasetotal + "\n";
                bigtotal += purchasetotal;
                System.out.println("Type 'Done' to end transaction");
            }
        } else {
            System.out.println("Thanks for shopping at COBIS Convenience! Have a wonderful day (: ");
        }
        System.out.println("Receipt: \n" + receipt);
        System.out.println("Total: ");
        for (String i : Order) {
            System.out.println(i + " - " + total.get(Order.indexOf(i)));

        }
        System.out.println("\n Your total today is: $" + bigtotal);

    }
}