package 백준.실버.실버5.Ex1476;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int e = 1, s = 1, m = 1;

        int cnt = 0;
        while(true) {
            cnt++;

            if(e == E && s == S && m == M) {
                System.out.println(cnt);
                return;
            }

            e++;
            s++;
            m++;

            if (e > 15) e = 1;
            if (s > 28) s = 1;
            if (m > 19) m = 1;
        }
    }
}
