

import java.io.*;
import java.util.*;

class Solution {
  
  static int bracketMatch(String text) {
    
    if(text.length()==0)
    {
      return 0;
    }
    
    int req=0;
    int open=0;
    
    for(int i=0;i<text.length();i++)
    {
      char bracket=text.charAt(i);
      if(bracket=='(')
      {
        open++;
      }
      else
      {
        //Closing bracket is coming;
        if(open==0)
        {
          req++;
        }
        else
        {
          open--;
        }
      }
    }
    
    return open+req;
    
    
  }
  

  public static void main(String[] args) {

  }

}


/*
  
*/
