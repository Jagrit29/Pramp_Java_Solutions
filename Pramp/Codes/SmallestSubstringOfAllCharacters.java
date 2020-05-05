  static String getShortestUniqueSubstring(char[] arr, String s) {
    
    int win[]=new int[256]; //current window;
    int pat[]=new int[256]; //for pattern;
    
    if(arr.length>s.length())
    {
      return "";
    }
    
    for(int i=0;i<arr.length;i++)
    {
      pat[arr[i]]++;
    }
    
    int left=0;
    int count=0;
    int minLength=Integer.MAX_VALUE;
    int startIndex=-1;
    
    
    for(int i=0;i<s.length();i++)
    {
      win[s.charAt(i)]++; //added to window;
      
      if(pat[s.charAt(i)]>0 && win[s.charAt(i)]<=pat[s.charAt(i)])
      {
        count++;
      }
      
      if(count==arr.length)
      {
        //now reduce;
        while(win[s.charAt(left)]>pat[s.charAt(left)])
        {
          win[s.charAt(left)]--;
          left++;
        }
        
        int len=i-left+1;
        if(len<minLength)
        {
          startIndex=left;
          minLength=len;
        }
      }
    }
    
    return (startIndex==-1) ? "" : s.substring(startIndex,startIndex+minLength);
    
    
    
    
    
  }
