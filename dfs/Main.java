/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.io.*;
import java.util.*;
class graph{
    int V;
    private LinkedList<Integer> adj[];
    graph(int v)
    {
        V=v;
        adj=new LinkedList[v];
        for(int i=0;i<v;i++)
        {
            adj[i]=new LinkedList();
        }
        
    }
    void add(int v,int w)
    {
        adj[v].add(w);
    }
    void DFS(int s,boolean v[])
    {
        v[s]=true;
            Iterator<Integer> it=adj[s].listIterator();
            System.out.println(s+" ");
            while(it.hasNext())
            {
                int n=it.next();
                if(!v[n])
                {
                    
                    v[n]=true;
                    DFS(n,v);
                    
                }
            }
            
        
    }
}
public class Main
{
	public static void main(String[] args) {
		graph g=new graph(4);
        g.add(0, 1); 
        g.add(0, 2); 
        g.add(1, 2); 
        g.add(2, 0); 
        g.add(2, 3); 
        g.add(3, 3); 
  
        System.out.println("Following is Breadth First Traversal "+ 
                           "(starting from vertex 2)"); 
        boolean v[]=new boolean[4];
        g.DFS(0,v); 
        for(int i=0;i<4;i++)
        {
            if(v[i]==false)
            {
                g.DFS(i,v); 
            }
        }
  
        
	}
}
