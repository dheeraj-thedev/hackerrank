package springsprint.connectedcellingrid;

import java.util.Scanner;
/**
 * 
 */

/**
 * @author Dany
 *
 *
 *Input:
 *
 *	4
	4
	1 1 0 0
	0 1 1 0
	0 0 1 0
	1 0 0 0
	
4
4	
1 1 1 0
0 0 0 0
0 0 0 0
0 0 0 0
 *	
 */
public class Solution {

	/**
	 * @param args
	 */
	
	public static boolean[][] visited;
	public static void main(String[] args) {
		new Solution().getInput();
	}

	public void getInput()
	{
		Scanner scanner=new Scanner(System.in);
		int m = 0, n =0;		
		m = scanner.nextInt();
		n = scanner.nextInt();
		
		int[][] matrix = new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				matrix[i][j] = scanner.nextInt();
			}
		}
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(matrix[i][j] == 1)
				{		
					visited = new boolean[m][n];
					System.out.println(findConnectedRegion(matrix, i, j, i, j, 1));
				}
			}
		}
		
		

		return;
	}
	
	public int findConnectedRegion(int[][] arr, int xVal, int yVal, int oldX, int oldY, int count)
	{
		int rowLength = arr.length;
		int colLength = arr[0].length;
		if(xVal < 0 || xVal >= rowLength || yVal<0 || yVal >= colLength)
		{
			return 0;
		}
		
		if(arr[xVal][yVal] != arr[oldX][oldY])
		{
			if(visited[xVal][yVal])
			{
				return count;
			}
			else
			{
				visited[xVal][yVal] = true;
				return count;
			}
		}else
		{
			if(visited[xVal][yVal])
			{
				return count;
			}
			else
			{
				visited[xVal][yVal] = true;
				//return count+1;
			}
		}
		
		int totalCount = findConnectedRegion(arr, xVal+1, yVal, xVal, yVal, count+1) + 
						 findConnectedRegion(arr, xVal, yVal+1, xVal, yVal, count+1) + 
						 findConnectedRegion(arr, xVal-1, yVal, xVal, yVal, count+1) + 
						 findConnectedRegion(arr, xVal, yVal-1, xVal, yVal, count+1); 
		return totalCount;
	}


}
