package cse360assignment02;

/* Assignment: 01 Version Control
 * Name: Shreyas Narayanan
 * ASU Email: snaray52@asu.edu
 * Class: CSE 360, T 9:00-10:15am
 * Description: Committing Files to GitHub, completing methods in AddingMachine.java
 * */

public class AddingMachine {
  private int total;
  private String returnString;
  
  // Constructor
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    returnString = "0";
  }
 
  // Return total price
  public int getTotal () {
    return total;
  }
  
  // Adds value to total
  public void add (int value) {
	  total += value;
	  returnString = returnString + " + " + value;
  }

  // Subtracts value from total
  public void subtract (int value) {
	  total -= value;
	  returnString = returnString + " - " + value;

  }
  
  // Returns history of transactions, starting with "0"
  public String toString () {
    return returnString;
  }

  // Clears memory
  public void clear() {
	  total = 0; 
	  returnString = "0";
  }
}