package warmup.angryprofessor;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		new Solution().getClassCancellationDecision();
	}

	public void getClassCancellationDecision()
	{
		Scanner scanner = new Scanner(System.in);
		int noOfTestCases = 0, N=0, K=0;
		noOfTestCases = scanner.nextInt();

		for(int j =0; j<noOfTestCases; j++)
		{
			N = scanner.nextInt();
			K = scanner.nextInt();
			int entryTime = 0;
			int beforeEntryCount = 0;
			for(int i =0;i<N;i++)
			{
				entryTime = scanner.nextInt();
				if(entryTime<=0)
					beforeEntryCount++;
			}
			System.out.println("Count "+beforeEntryCount);
            if(beforeEntryCount>=K)
                {
                System.out.println("NO");
            }
            else
                {
                  System.out.println("YES");
            }
		}
	}
}