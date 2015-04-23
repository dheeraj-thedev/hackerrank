package warmup.lonelyinteger;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
   static int lonelyinteger(int[] a) {
       HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
       for(int i=0;i<a.length;i++)
           {
           if(hMap.containsKey(a[i]))
               {
               hMap.put(a[i], (hMap.get(a[i]))+1);
           }else
               {
               hMap.put(a[i], 1);
           }
       }
           int val = 0;
           for(int n : hMap.keySet())
               {
               val = hMap.get(n);
               if(val == 1)
                   return n;
           }
      return 0;
    }
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        
        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }
        
        res = lonelyinteger(_a);
        System.out.println(res);
        
    }
}
