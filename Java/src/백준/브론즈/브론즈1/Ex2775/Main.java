package 백준.브론즈.브론즈1.Ex2775;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int[][] apartment = new int[15][15];
        for(int i = 0; i<15; i++) {
            apartment[0][i] = i;
            apartment[i][1] = 1;
        }
        for(int i = 1; i<15; i++) {
            for(int j = 2; j<15; j++) {
                apartment[i][j] += apartment[i-1][j] + apartment[i][j-1];
            }
        }

        StringBuilder sb= new StringBuilder();
        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int k = Integer.parseInt(br.readLine());

            sb.append(apartment[n][k]).append('\n');
        }
        System.out.println(sb);
    }
}