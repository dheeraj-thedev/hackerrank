package warmup.servicelane;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		new Solution().findServiceLaneCapacity();
	}

	public void findServiceLaneCapacity()
	{
		Scanner scanner = new Scanner(System.in);
		int length=0, noOfTestCases =0;
		int[] width;
		length = scanner.nextInt();
		noOfTestCases = scanner.nextInt();
        width = new int[length];
        for(int i=0;i<length;i++)
            {
            width[i] = scanner.nextInt();
        }
        int i=0, j=0, minCapacity = 0;
		for(int m=0;m<noOfTestCases;m++)
		{
            i = scanner.nextInt();
            j = scanner.nextInt();
            minCapacity = findMinCapacity(width, i, j);
            System.out.println(minCapacity);			
		}
	}
    static int findMinCapacity(int[] width, int i, int j)
        {
        int minCapacity = Integer.MAX_VALUE;
        for(int p = i;p<=j;p++)
            {
            if(width[p]<minCapacity)
                {
                minCapacity = width[p];
            }
        }
        return minCapacity;
    }

}