/*
* This program uses object oriented programming to get methods from a class
* inside a different file. The program creates a stack, then gives
* different options from the user to choose from
* (i.e push, pop, peek, clear, and quit)
* @author  John Omage
* @version 1.0
* @since 2020-10-22.
*/

import java.io.*;
import java.util.*;

public class StackClass {
 
  /**.
  * main
  */
  public static void main(String[] args) {
   
    // create scanner object
    Scanner scan = new Scanner(System.in);
   
    // create the new intStack
    MyIntStack intStack = new MyIntStack();
   
    // create empty string for the users command
    String userCommand = "";
   
    // create the integer for user's input
    Integer userInput;
   
    // creates isNothing variable
    boolean isNothing = false;
     
    // while users command isnt quit
    while (!userCommand.equals("QUIT")) {
     
      // ask the user what they want, and scan the user's input
      System.out.println("Would you like to push, pop, peek, clear, or quit?");
      userCommand = scan.nextLine().toUpperCase().trim();
     
      if (userCommand.equals("PUSH")) {
       
        try {
          // ask the user what they want to push  
          System.out.println("What do you want to push?");
          userInput = Integer.parseInt(scan.nextLine());
         
          // call the stack push method and display
          intStack.stackPush(userInput);
          System.out.println(userInput + " has been pushed!");
       
        } catch (Exception e) {
         
          // displays that the user should use a number
          System.out.println("This isn't a number!");
        }

      } else if (userCommand.equals("POP")) {
       
        // initialize boolean variable to check if the stack is empty or not
        isNothing = intStack.stackEmpty();
       
        // if nothing is there, do this
        if (isNothing == true) {
          System.out.println("There is no number!");
        } else {
          // create popped element and call stack pop method, then display
          Integer poppedElement = intStack.stackPop();
          System.out.println(poppedElement + " has been popped!");
        }
       
      } else if (userCommand.equals("PEEK")) {
       
        // initialize boolean variable to check if the stack is empty or not
        isNothing = intStack.stackEmpty();
       
        // if nothing is there, do this
        if (isNothing == true) {
          System.out.println("There is no number!");
        } else {
        // create top of stack integer, to be displayed
          Integer topOfStack = intStack.stackPeek();
          System.out.println(topOfStack + " is at the top of the stack");
        }
       
      } else if (userCommand.equals("CLEAR")) {
       
        // call the clear method, and display it's been cleared
        intStack.stackClear();
        System.out.println("Stack has been cleared!");
         
      } else if (userCommand.equals("QUIT")) {
       
        // create the string that displays the user's created stack
        String finalStack = intStack.finalStack();
       
        // call the stackEmpty function, to check if it's nothing
        isNothing = intStack.stackEmpty();
       
        // if the user quits at the start, dont display final stack
        if (isNothing == true) {
          // close the program
          System.exit(0);
          // if it is, display it
        } else {
          // display the final stack
          System.out.println("Your final stack: \r\n"
              + finalStack.replaceAll("\\[", "").replaceAll("]", ""));
        }
      }
    }
  }
}



