package 백준.브론즈.브론즈1.Ex10798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String arr[] = new String[5];
        for (int i = 0; i < 5; i++) arr[i] = br.readLine();


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (i < arr[j].length()) {
                    sb.append(arr[j].charAt(i));
                }
            }
        }
        System.out.println(sb);
    }
}
