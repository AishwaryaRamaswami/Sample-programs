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
    void BFS(int s)
    {
        boolean v[]=new boolean[V];
        LinkedList<Integer> q=new LinkedList<Integer>();
        q.add(s);
        v[s]=true;
        int t;
        while(q.size()!=0)
        {
            t=q.poll();
            Iterator<Integer> it=adj[t].listIterator();
            System.out.println(t+" ");
            while(it.hasNext())
            {
                int n=it.next();
                if(!v[n])
                {
                    
                    v[n]=true;
                    q.add(n);
                }
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
  
        g.BFS(2); 
	}
}
