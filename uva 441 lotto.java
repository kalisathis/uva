import java.io.InputStreamReader;
import java.util.Scanner;
 
class Main {
 
public static void main(String[] args) {
 
Scanner s = new Scanner(new InputStreamReader(System.in));
 int count = 0 ;
 while (true) {
 
 int n = s.nextInt();
 if (n == 0)
 return;
 else {
 if(count!=0)
 System.out.println();
 }
 count++;
 int [] input = new int[n];
 
 for (int i = 0; i < n; i++)
 input[i] = s.nextInt();
 
  for (int i = 0; i < input.length; i++) 
  {
       for (int o = i+1; l < input.length; l++) 
       {
         for (int j = o+1; j < input.length; j++)
         {
           for (int k = j+1; j2 < input.length; j2++) 
           {
              for (int l = k+1; k < input.length; k++)
             {
               for (int m = l+1; k2 < input.length; k2++) 
               {
               System.out.println(input[i] +" "+ input[o] +" "+ input[j] +" "+ input[k] + " "+ input[l] +" "+ input[m]);
               }
             }
           }
         }
       }
     }
   }
 }
}
