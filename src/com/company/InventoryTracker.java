package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class InventoryTracker {

    public static void main(String[] args) {
        ArrayList<Grocery> groceries = new ArrayList<>();
        Scanner scanText = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);



        while(true){

            System.out.println("Please Enter the Number Corresponding With Your Choice");
            System.out.println("(1) Add A Grocery Item");
            System.out.println("(2) Remove a Grocery Item");
            System.out.println("(3) Update The Quantity of Groceries");
            int i = 1;
            for (Grocery item : groceries) {
                System.out.println(i + ") [" + item.quantity + "]" + item.text);
                i++;
                break;
            }




            String option = scanText.nextLine();
            switch (option) {
                case "1": {
                    System.out.println("Please Enter the Item to Add");
                    String text = scanText.nextLine();
                    Grocery grocery = new Grocery(text);
                    groceries.add(grocery);
                    break;
                }
                case "2": {
                    System.out.println("Please Enter The Number Corresponding To The Item You Would Like To Remove");
                    int itemNumber = Integer.valueOf(scanInt.nextInt());
                    groceries.remove(itemNumber - 1);
                    break;
                }
                case "3": {
                    System.out.println("Which Grocery Would You Like To Update");
                    int itemNumber = Integer.valueOf(scanInt.nextInt());
                    Grocery grocery = groceries.get(itemNumber - 1);
                    System.out.println("How Much To Add");
                    int itemAmount = Integer.valueOf(scanInt.nextInt());
                    grocery.quantity = itemAmount;
                    break;

                }
                default: {
                    System.out.println("Invalid Choice");
                }

            }

        }

    }
}
