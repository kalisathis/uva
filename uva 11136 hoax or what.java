import java.io.*;
import java.util.*;

class main
{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner in=new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        while (true) {
            int N = in.nextInt();
            if (N == 0) {
                break;
            }
            TreeSet<Integer> set = new TreeSet<Integer>();
            int[] arr = new int[1000001];
            long total = 0;
            for (int i = 0; i < N; i++) {
                int M = in.nextInt();
                for (int j = 0; j < M; j++) {
                    int x = in.nextInt();
                    arr[x]++;
                    set.add(x);
                }
                int a = set.first();
                int b = set.last();
                total += b - a;
                arr[a]--;
                arr[b]--;
                if (arr[a] == 0) {
                    set.remove(a);
                }
                if (arr[b] == 0) {
                    set.remove(b);
                }
            }
            pw.println(total);
            pw.flush();
        }
        pw.close();
    }
}
