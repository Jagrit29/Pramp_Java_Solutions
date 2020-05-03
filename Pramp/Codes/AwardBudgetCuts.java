import java.io.*;
import java.util.*;

class Solution {
  
  static double findGrantsCap(double[] grantsArray, double newBudget) {
    
    int length=grantsArray.length;
    double cap=newBudget/length; 
    Arrays.sort(grantsArray);
    
    int i=0;
    int n=length;
    
    while(i<n && grantsArray[i]<cap)
    {
      newBudget=newBudget-grantsArray[i];
      length--;
      cap=newBudget/length;
      i++;
    }
    return cap;
  }

  

  public static void main(String[] args) {

  }

}
