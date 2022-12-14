/* Task
You are asked to calculate factorials of some small positive integers.

Input
An integer t, 1<=t<=100, denoting the number of testcases, followed by t lines, each containing a single integer n, 1<=n<=100.

Output
For each integer n given at input, display a line with the value of n!

Sample 1:
Input
Output
4
1
2
5
3
1
2
120
6   */
// We have populated the solutions for the 10 easiest problems for your support.
// Click on the SUBMIT button to make a submission to this problem.

import java.util.*;
import java.lang.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
             Scanner sc = new Scanner(System.in);
             int t = sc.nextInt();
            while(t --> 0)
            {
                int n = sc.nextInt();
                BigInteger fact = new BigInteger("1");
                for(int i = 2; i <= n; i++)
                fact = fact.multiply(BigInteger.valueOf(i));
                System.out.println(fact);
            }
	    
	}
}




