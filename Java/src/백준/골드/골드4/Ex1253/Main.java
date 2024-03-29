package 백준.골드.골드4.Ex1253;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            int left = 0;
            int right = N-1;

            while(true) {
                if(left == i) left++;
                if(right == i) right--;

                if(left >= right) break;

                if(arr[left] + arr[right] > arr[i]) right--;
                else if(arr[left] + arr[right] < arr[i]) left++;
                else {
                    cnt++;
                    break;
                }
            }
        }

        System.out.println(cnt);
    }
}