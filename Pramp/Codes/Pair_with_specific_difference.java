import java.io.*;
import java.util.*;

class Solution {

  static int[][] findPairsWithGivenDifference(int[] arr, int k) {
    
    HashSet<Integer> hs=new HashSet<>();
    
    //adding elements to hashset;
    for(int i=0;i<arr.length;i++)
    {
      hs.add(arr[i]); 
    }
    
    List<List<Integer>> list=new ArrayList<>();
    
    for(int i=0;i<arr.length;i++)
    {
      int y=arr[i];
      int expected=y+k;
      if(hs.contains(expected))
      {
        List<Integer> sublist=new ArrayList<>();
        sublist.add(expected);
        sublist.add(y);
        list.add(sublist);
      }
    }
    int size=list.size();
    int out[][]=new int[size][2];
    for(int i=0;i<list.size();i++)
    {
      out[i][0]=list.get(i).get(0);
      out[i][1]=list.get(i).get(1);
    }
    
    return out;
    
    //O(n);
    //O(n);
  }

  public static void main(String[] args) {

  }

}


