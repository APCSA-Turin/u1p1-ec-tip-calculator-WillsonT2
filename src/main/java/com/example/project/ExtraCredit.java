package com.example.project;
import java.util.Scanner;


public class ExtraCredit {
    public static double roundToDecimal(double decimal, int spaces){
        double factor = Math.pow(10, spaces);
        return (int) (decimal * factor + 0.5) / factor;
    }
    public static double roundDown(double decimal, int spaces){
        double factor = Math.pow(10, spaces);
        return (int) (decimal * factor) / factor;
    }


    public static String calculateTip(int people, int percent, double cost, String items) {
        StringBuilder result = new StringBuilder();

         //COPY AND PASTE YOUR CODE HERE 
        double tip = roundToDecimal((cost * percent / 100), 2);
        double totalWithTip = roundToDecimal(tip + cost, 2);
        double costPerPerson = roundToDecimal(cost / people, 2);
        double tipPerPerson = roundToDecimal(tip / people, 2);
        double totalCostPerPerson = roundDown(totalWithTip / people, 2);

        result.append("-------------------------------\n");
        result.append("Total bill before tip: " + "$" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%" + "\n");
        result.append("Total tip: " + "$" + tip + "\n");
        result.append("Total Bill with tip: " + "$" + totalWithTip + "\n");
        result.append("Per person cost before tip: " + "$" + costPerPerson + "\n");
        result.append("Tip per person: " + "$" + tipPerPerson + "\n");
        result.append("Total cost per person: " + "$" + totalCostPerPerson + "\n");
        result.append("-------------------------------\n");

        //the two lines  should go below result.append("-------------------------------\n"); 
        result.append("Items ordered:\n");
        result.append(items);
        return result.toString();
    }
                                   
    public static void main(String[] args) {
        int people = 2;
        int percent = 5;
        double cost = 29.6;
        String items = ""; 
        String newItem = "";

        //Your scanner object and while loop should go here
        while (newItem != "-1"){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter an item or type out -1 to finish:");
            newItem = scan.nextLine();
            scan.close();
            if (newItem.equals("-1")){
                break;
            }
            items += newItem + "\n";
        }
        System.out.println(calculateTip(people,percent,cost,items));
    }
}
