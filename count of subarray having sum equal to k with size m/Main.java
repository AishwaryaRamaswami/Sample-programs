/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.io.*;
import java.util.*;
public class Main
{
    public static void findsubsumofsize(int a[],int n,int k,int m)
    {
        int sum=0,c=0;
        for(int i=0;i<m;i++)
        {
            sum=sum+a[i];
        }
        if(sum==k)
        {
            c++;
        }
        for(int i=m;i<n;i++)
        {
            sum=sum-a[i-m];
            sum=sum+a[i];
            if(sum==k)
            {
                c++;
            }
            
        }
        System.out.println(c);
    }
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n;
	    n=s.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        a[i]=s.nextInt();
	    }
		int k=s.nextInt();
		int m=s.nextInt();
		findsubsumofsize(a,n,k,m);
	}
}
