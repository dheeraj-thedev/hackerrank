package warmup.cutthesticks;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    new Solution().findNumberOfSticksCut();
    }
    
    public void findNumberOfSticksCut()
        {
        Scanner scanner = new Scanner(System.in);
        int noOfSticks = 0;
        int [] stick;
        noOfSticks = scanner.nextInt();
        stick = new int[noOfSticks];
        for(int i=0;i<noOfSticks;i++)
            {
            stick[i] = scanner.nextInt();
        }
        int minStickVal = 0;
        while(true)
            {
            System.out.println(findRemainingSticks(stick));
            minStickVal = findMin(stick);
            int[] newStick = deductMinValue(stick, minStickVal);
            stick = newStick;
            if(isAllDone(stick))
            	break;
        }
    }
    
    static int[] deductMinValue(int[] stick, int minVal)
        {
    	int[] newStick = new int[stick.length];
        for(int i=0;i<stick.length;i++)
            {
        	newStick[i] = stick[i]-minVal;
        }
        return newStick;
    }
    
    static int findRemainingSticks(int[] stick)
        {
        int remaining =0;
        for(int i=0;i<stick.length;i++)
            {
            if(stick[i]>0)
                remaining ++;
        }
        return remaining;
    }
    
    static boolean isAllDone(int[] stick)
        {
        for(int i=0;i<stick.length;i++)
            {
            if(stick[i]>0)
            	return false;
        }
        return true;
    }
    
    static int findMin(int[] stick)
        {
        int minValue = Integer.MAX_VALUE;
        for(int i=0;i<stick.length;i++)
            {
            if(stick[i]<minValue && stick[i]>0)
                minValue = stick[i];
        }
        return minValue;
    }
    
}