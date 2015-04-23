package warmup.utopian;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    new Solution().findUtopianHeight();
    }
    
    public void findUtopianHeight()
        {
        Scanner scanner = new Scanner(System.in);
        int noOfTestCases = 0, noOfCycles =0;
        noOfTestCases = scanner.nextInt();
        
        for(int i=0;i<noOfTestCases;i++)
            {
        int oldHeight =1;
        int iterations =0;
        int newHeight = 1;
        noOfCycles = scanner.nextInt();
        while((iterations+2)<=noOfCycles)
            {
            newHeight = (oldHeight*2);
            iterations++;
            newHeight++;
            iterations++;
            oldHeight = newHeight;
        }       
        if(iterations<noOfCycles)
            {
            newHeight = (oldHeight*2);
        }
        
        System.out.println(newHeight);
        }
    }
}