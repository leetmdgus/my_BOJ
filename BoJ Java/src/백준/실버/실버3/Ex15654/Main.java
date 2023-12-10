package 백준.실버.실버3.Ex15654;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static int n;
    public static int m;
    public static int[] arr;
    public static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        visited = new boolean[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        solve(new int[m], 0);
        System.out.println(sb);
    }
    public static void solve(int[] array, int depth) {
        if(array.length == depth) {
            for(int i = 0; i<array.length; i++) {
                sb.append(array[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        for(int i = 0; i<n; i++) {
            if(!visited[i]) {
                visited[i] = true;
                array[depth] = arr[i];
                solve(array, depth+1);
                visited[i] = false;
            }
        }
    }
}
