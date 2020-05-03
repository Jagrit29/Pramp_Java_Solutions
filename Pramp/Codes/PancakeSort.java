import java.io.*;
import java.util.*;

class Solution {

  
  //[1, 5, 4, 3, 2]
  //K is index+1;
  static void flip(int[] a, int k)
  {
     for(int i=0;i<k/2;i++)
     {
       int temp=a[i];
       a[i]=a[k-i-1];
       a[k-i-1]=temp;
     }
  }
  
  static int max(int[] a, int k)
  {
    int max=Integer.MIN_VALUE;
    int index=0;
    for(int i=0;i<k;i++)
    {
      if(a[i]>max)
      {
        max=a[i];
        index=i;
      }
    }
    return index+1;
    
  }
  
  static int[] pancakeSort(int[] arr) {
    
    
    
    //1 5 4 3 2;
    //5 1 4 3 2;
    
    
    //2 3 4 1     //5
    //4 3 2 1;
    //1 2 3        4
    
    int i=arr.length;
    
    while(i>0)
    {
      int k=max(arr,i);
      flip(arr,k);
      flip(arr,i);
      i--;
      
    }
    
    return arr;
    
    
    
  }

  public static void main(String[] args) {

  }

}
