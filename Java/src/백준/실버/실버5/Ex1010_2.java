package 백준.실버.실버5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1010_2 {
    static int[][] dp = new int[30][30];
    static int comb(int n, int r) {
        if(dp[n][r] > 0) {
            return dp[n][r];
        }

        if(n == r || r == 0) {
            return dp[n][r] = 1;
        }
        return comb(n - 1, r - 1) + comb(n - 1, r);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            System.out.println(comb(M, N));
        }
    }
}
