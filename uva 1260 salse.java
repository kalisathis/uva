import java.io.*;
import java.util.*;

class Main 
{
	public static void main (String[] args)
	{
	    Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0)
		{
		    int n=in.nextInt();
		    int a[]=new int[n];
		    int s=0;
		    for(int i=0;i<n;i++)
		    {
		        a[i]=in.nextInt();
		        if(i>0)
		        {
		            for(int j=0;j<i;j++)
		            {
		                if(a[j]<=a[i])
		                s++;
		            }
		        }
		    }
		    System.out.println(s);
		}
	}
}
