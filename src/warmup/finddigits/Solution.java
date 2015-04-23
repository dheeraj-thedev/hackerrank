package warmup.finddigits;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        new Solution().findCountOfDigitsWhichExactlyDivides();
    }
    
    public void findCountOfDigitsWhichExactlyDivides()
        {
        Scanner scanner = new Scanner(System.in);
        int noOfTestCases = 0, N=0, current=0;
        int digit =0, digitCount = 0;
        noOfTestCases = scanner.nextInt();
        for(int i=0;i<noOfTestCases;i++)
            {
            N = scanner.nextInt();
            current = N;
            digitCount = 0;
            while(current>0)
                {
            digit = current % 10;
            current = current / 10;
                if((digit != 0)&&(N%digit)==0)
                    {
                    digitCount++;
                }
            }
            System.out.println(digitCount);
        }
    }
}