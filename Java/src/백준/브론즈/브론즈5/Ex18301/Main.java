package 백준.브론즈.브론즈5.Ex18301;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        int n12 = Integer.parseInt(st.nextToken());
        System.out.println((n1 + 1) * (n2 + 1) / (n12 + 1) - 1);
    }
}
