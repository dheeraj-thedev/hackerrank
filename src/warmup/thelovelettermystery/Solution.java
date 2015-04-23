package warmup.thelovelettermystery;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		new Solution().findNoChangesForPalindrome();
	}

	public void findNoChangesForPalindrome()
	{
        Scanner scanner = new Scanner(System.in);
		int noOfTestCases =0;
        String str ="";
        noOfTestCases = scanner.nextInt();
        int stepsRequired = 0;
        for(int i=0;i<noOfTestCases;i++)
            {
            str = scanner.next();
            stepsRequired = findMinStepToChangeAsPalindrome(str);
            System.out.println(stepsRequired);
        }
    }
        static int findMinStepToChangeAsPalindrome(String str)
            {
            if(str == "")
                return 0;
            int length = str.length();
            int noOfStepsRequired = 0;
            int[] strArr = new int[length];
            char c;
            for(int i=0;i<length;i++)
                {
                c = str.charAt(i);
                strArr[i] = c;
            }
            int i=0, j=length-1;
            while(i<j)
                {
                if(strArr[i]!=strArr[j])
                    noOfStepsRequired += Math.abs(strArr[i]-strArr[j]);
                i++;
                j--;
            }
            return noOfStepsRequired;
        }
   }