package warmup.maximizingXOR;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
/*
 * Complete the function below.
 */

    static int maxXor(int l, int r) {
        int maxXORVal =Integer.MIN_VALUE;
        int currentXORVal=0;
        for(int i=l;i<=r;i++)
            {
            for(int j=l;j<=r;j++)
                {
                currentXORVal = i ^ j;
                System.out.println("Current : "+currentXORVal);
                if(currentXORVal>maxXORVal)
                    maxXORVal = currentXORVal;
            }
        }
        return maxXORVal;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
        
        res = maxXor(_l, _r);
        System.out.println(res);
        
    }
}
