import java.io.*;
import java.util.*;

class Solution {
  
  static int indexEqualsValueSearch(int[] a) {
    
    if(a.length==0)
    {
      return -1;
    }
    
    int ans=-1;
    int left=0;
    int right=a.length-1;
    
    while(left<=right) //[-1,0,2,6]
    {
      int mid=left+(right-left)/2;
      
      if(a[mid]==mid && (mid==0 || a[mid-1]<mid-1))
      {
        ans=mid;
        return ans;
        //right=mid-1;
      }
      else if(a[mid]==mid)
      {
        ans=mid;
        right=mid-1;
      }
      else if(a[mid]>mid)
      {
        right=mid-1;
      }
      else
      {
        left=mid+1;
      }
      
    }
    
    return ans;
    
    //Tc- O(log(n));
    //S- O(1);
    
    
  }

  public static void main(String[] args) {

  }

  
}
