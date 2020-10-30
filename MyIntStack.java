import java.io.*;
import java.util.*;

public class MyIntStack {
  // private properties
  private Stack<Integer> stack;
   
  // constructor  
  public MyIntStack() {
    stack = new Stack<Integer>();
  }
 
  // methods
  public void stackPush(Integer userInput) {
    stack.push(userInput);
  }
 
  public Integer stackPop() {
    return stack.pop();
  }
 
  public Integer stackPeek() {
    return stack.peek();
  }
 
  public void stackClear() {
    stack.clear();
  }
 
  public String finalStack() {
   
    return stack.toString();
  }
 
  public boolean stackEmpty() {
    return stack.empty();
  }
} 