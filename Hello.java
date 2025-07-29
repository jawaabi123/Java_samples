import java.util.*;
public class Hello 
{
      public int longestSubarray(int[] nums) 
      {
         int maxLength=Integer.MIN_VALUE;
         int i=0,j=0;
         int zeroCount=0;
         int currentLength=0;
         while(j<nums.length)
         {
               //shrinking the window from left
               while(zeroCount>1)
               {
                  if(nums[i]==0)
                  {
                     zeroCount--;
                     i++;
                  }
                  else
                  {
                     currentLength--;
                  }
               }
               if(nums[j]==0)
               {
                  zeroCount++;
               }
               else if(nums[j]==1)
               {
                  currentLength++;
               }
               maxLength=Math.max(maxLength,currentLength);
               j++;
         }
         return maxLength;
      }
     public static void main(String args[])
     {
        Hello obj1=new Hello();
        int[] a={0,1,1,1,0,1,1,0,1};
        System.out.println(obj1.longestSubarray(a));
     }
}
