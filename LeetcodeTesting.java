import java.util.*;
public class LeetcodeTesting 
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
                  }
                  else
                  {
                     currentLength--;
                  }
                  i++;
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
        LeetcodeTesting obj1=new LeetcodeTesting();
        int[] a={0,1,1,1,0,1,1,0,1};
        Scanner input =new Scanner(System.in);
        char [][] testChar=new char[2][2];
        for(int i=0;i<testChar.length;i++)
        {
         for(int j=0;j<testChar[0].length;j++)
         {
            System.out.println("Enter element:");
            testChar[i][j]=input.next().charAt(0);
         }
        }
        for (char[] rows:testChar)
        {
            System.out.println(rows);
        }
        System.out.println(obj1.longestSubarray(a));
     }
}
