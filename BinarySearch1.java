/*
* Copyright (c) 2020
*
* The WajdStack1 Class creates a stack to use 
* by the TryCatchPop.java program, and has different methods to process.
* 
* @author  Wajd Mariam
* @version 1.0
* @since   2020/12/11
*/

import java.util.ArrayList; // import the ArrayList class

public class BinarySearch1 {

  // Declaring variables:
  private final int sizeArrayList = 25;
  private final int randomRange = 100;
  // Creating and Array List:
  private ArrayList<Integer> arrayList = new ArrayList<Integer>();


  /**
   * Generating random numbers.
   */
  public void generate() {
    for (int counter1 = 0; counter1 < sizeArrayList; counter1++) {
      int randomNumber = (int) (Math.random() * randomRange + 1);
      arrayList.add(randomNumber);
    }
  }
  
  /**
   * Generating random numbers.
   */  
  public String sorter() {
    String numberSorted = "";
    // Sorting array list from smallest number to largest:
    for (int startIndex = 0; startIndex < arrayList.size(); startIndex++) {
      for (int currentIndex = (startIndex + 1); currentIndex < arrayList.size(); currentIndex++) {
        if (arrayList.get(startIndex) > arrayList.get(currentIndex)) {
          int numberSelected = arrayList.get(startIndex);
          arrayList.set(startIndex, arrayList.get(currentIndex));
          arrayList.set(currentIndex, numberSelected);
        }
      }
    }
    return numberSorted;
  }

  /**
   * Generating random numbers.
   */
  public int search(int inputNumber) {
    int botIndex = 0;
    int topElement = arrayList.size() - 1;
    int midElement = 0;

    // Loop that keeps reducing search range until number is found
    while (botIndex <= topElement) {
      midElement  = (int) Math.floor((botIndex + topElement) / 2);
      if (inputNumber > arrayList.get(midElement)) {
        botIndex = midElement + 1;
      } else if (inputNumber < arrayList.get(midElement)) {
        topElement = midElement - 1;
      } else {
        // Returning the index spot of the number in the array
        return (midElement + 1);
      }
    }
    // Returning that the number could not be found in the array
    throw null;
  }

  /**
   * Returns list.
   */
  public String list() {
    String currentCharacters = "";
    for (int character = 0; character < arrayList.size(); character++) {
      currentCharacters = currentCharacters + arrayList.get(character) + ", ";
    } 
    return currentCharacters;
  }
}