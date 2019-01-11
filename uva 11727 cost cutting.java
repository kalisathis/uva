import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		for(int i = 1;i<=testCase;i++){
			int[] arr = new int[3];
			arr[0] = scan.nextInt();
			arr[1] = scan.nextInt();
			arr[2] = scan.nextInt();
			Arrays.sort(arr);
			System.out.println("Case "+i+": "+arr[1]);
		}
	}
}
