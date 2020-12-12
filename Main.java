/*
* Copyright (c) 2020
*
* This program uses binary search to find numbers inputted by the user.
*
* @author  Wajd Mariam
* @version 1.0
* @since   2020/12/11
*/

import java.util.Scanner;

public class Main {
  /**
   * Generating random numbers.
   */ 
  public static void main(String[] args) {
    // Declaring array list:
    BinarySearch1 classSearch = new BinarySearch1();

    // Try Catch statement:
    try {

      // Getting list of generated numbers:
      System.out.println("List of generated numbers: ");
      classSearch.generate();
      System.out.println(classSearch.list());
      System.out.println("");

      // Printing out the list of generated numbers after sorting:
      System.out.println("Array list after being sorted: ");
      classSearch.sorter();
      System.out.println(classSearch.list());
      System.out.println("");
 
      
      // Input
      // Requesting user to enter a number to find in the list: 
      Scanner input1 = new Scanner(System.in);
      System.out.println("");
      System.out.print("Enter a number you wish to find in the list: ");
      int inputNumber = input1.nextInt();

      // Passing number to the search method to look for it in the array:
      // Returning the location of the number  after finding it 
      System.out.print("Number was found on index # " + classSearch.search(inputNumber));

    } catch (NullPointerException e) {
      System.out.println("");
      System.out.print("ERROR.Number is unavailable in array!");
    } catch (Exception e) {
      System.out.println("Invalid Input");
    }
  }
}