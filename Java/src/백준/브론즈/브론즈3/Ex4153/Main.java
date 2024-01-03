package 백준.브론즈.브론즈3.Ex4153;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();
        while(true) {
            StringTokenizer st= new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a == 0 && b == 0 && c == 0) {
                break;
            }

            sb.append(isRight(a, b, c) ? "right" :"wrong").append('\n');
        }
        System.out.println(sb);
    }

    public static boolean isRight(int a, int b, int c) {
        int[] arr= new int[]{a, b, c};
        Arrays.sort(arr);
        return Math.pow(arr[2], 2) == Math.pow(arr[0], 2) + Math.pow(arr[1], 2);
    }
}
