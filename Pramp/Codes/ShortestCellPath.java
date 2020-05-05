import java.io.*;
import java.util.*;

class Solution {

  static int dfs(int[][] grid, int i,int j,int tr,int tc)
  {
    //we have reached.
    if(i==tr && j==tc)
    {
      return 0;
    }
    
    if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]==0)
    {
      return 100;  //this is base case;
    }
    // https://www.youtube.com/watch?v=KiCBXu4P-2Y
    grid[i][j]=0; //visited this;
    
    int option1=1+dfs(grid,i+1,j,tr,tc); //going down
    int option2=1+dfs(grid,i-1,j,tr,tc); //going up;
    int option3=1+dfs(grid,i,j+1,tr,tc); //going right;
    int option4=1+dfs(grid,i,j-1,tr,tc); //going left;
    
    grid[i][j]=1;
    
    return Math.min(option1,Math.min(option2,Math.min(option3,option4)));
  }
  
	static int shortestCellPath(int[][] grid, int sr, int sc, int tr, int tc) {
    
      if(sr==tr && sc==tc)
      {
        return 0;
      }
      int res=dfs(grid,sr,sc,tr,tc);
      if(res==0 || res>=100)
      {
        return -1;
      }
      else
      {
        return res;
      }
    
	}

	public static void main(String[] args) {
	
	}
}

/*

1111
0001
1011  

*/
