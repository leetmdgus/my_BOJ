package 백준.브론즈.브론즈4.Ex28281;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int[] arr =new int[n];
        st =new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken())*x;
        }

        long min = Integer.MAX_VALUE;
        for(int i = 1; i<n; i++) {
            long v = arr[i-1] + arr[i];
            min = Math.min(min, v);
        }

        System.out.println(min);
    }
}
