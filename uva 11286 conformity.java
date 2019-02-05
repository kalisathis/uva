//  https://github.com/andrewphamvk/UVa/blob/master/11286%20-%20Conformity/Main.java

import java.io.*;
import java.util.*;
class Main
{
    public static String tostring(ArrayList<Integer> a)
    {
        StringBuilder sb=new StringBuilder();
        for(Integer s: a)
        sb.append(s);
        return sb.toString();
    }
    public static  void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        while(true)
        {
            int t=in.nextInt();
            TreeMap<String,Integer> m=new TreeMap<>();
            if(t==0)
            break;
            else
            {
                for(int i=0;i<t;i++)
                {
                    ArrayList<Integer>a=new ArrayList<>();
                    for(int j=0;j<5;j++)
                    {
                        a.add(in.nextInt());
                    }
                    Collections.sort(a);
                    String s=tostring(a);
                if(m.containsKey(s))
                {
                    m.put(s,m.get(s)+1);
                }
                else
                m.put(s,1);
               }
               int pop=0;
               for(int x: m.values())
               pop=Math.max(pop,x);
               int st=0;
               for(int x:m.values())
               {
                   if(x==pop)
                   {
                       st+=x;
                   }
               }
               System.out.println(st);
        }
}
}
}
