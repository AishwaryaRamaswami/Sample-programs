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
    public static void findrepeat(int a[],int n)
    {
        int c[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(c[a[i]]==1)
            {
                System.out.print(a[i]+" ");
            }
            else{
                c[a[i]]++;
            }
        }
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
	    findrepeat(a,n);
		
	}
}
