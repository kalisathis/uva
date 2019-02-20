import java.io.*;
import java.util.*;

class Main 
{
	public static void main (String[] args)
	{
	    Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		int l=0;
		while(t-->0)
		{
		    if(l>0)
		    System.out.println();
		    l++;
		    int a=in.nextInt();
		    String s[]=new String[a];;
		    int d[]=new int[a];
		    int e[]=new int[a];
		    for(int i=0;i<a;i++)
		    {
		        s[i]=in.next();
		        d[i]=in.nextInt();
		        e[i]=in.nextInt();
		    }
		    int b=in.nextInt();
		    int f,c,k;
		    String u="";
		    for(int i=0;i<b;i++)
		    {
		        c=in.nextInt();
		        f=0;
		        k=0;
		        for(int j=0;j<a;j++)
		        {
		            if(c>=d[j] && c<=e[j])
		            {
		             if(k==0)
		              u=s[j];
		              k++;
		             f=1;
		            }
		        }
		        if(f==0 || k>1)
		        System.out.println("UNDETERMINED");
		        else
		        System.out.println(u);
		    }
		    
		}
	}
}
