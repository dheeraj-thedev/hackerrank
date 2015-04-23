package warmup.halloweenparty;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        new Solution().findMaximumPieces();
    }
    
    public void findMaximumPieces()
        {
        Scanner scanner = new Scanner(System.in);
        int noOfTestCases = 0;
        noOfTestCases = scanner.nextInt();
        int K = 0;
        for(int i=0;i<noOfTestCases;i++)
            {            
            K = scanner.nextInt();
            long pieces =0;
            int mid = K/2;
            if((K&1)>=1)
            {
            	pieces = (long)mid*(long)(mid+1);
                System.out.println(pieces);

            }else
            {
            	pieces = (long)mid*(long)mid;
                System.out.println(pieces);            }
        }
    }
}