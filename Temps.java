package temps;

/**
 * Summary: Entire an integer to calculate Fahrenheit and Celsius.
 * Author: Jay S. Mogyoros
 * Date: October 21, 2017
 */

import java.util.Scanner;

public class Temps{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
               
        // Convert Fahrenheit to Celsius
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius");
        
        // Convert Celsius to Fahrenheit
        double Fahrenheit = (celsius * 9 / 5.0) + 32;
        System.out.println("Celsius " + celsius + " is " + fahrenheit + " in Fahrenheit");
        //close scanner
    
    }    

}