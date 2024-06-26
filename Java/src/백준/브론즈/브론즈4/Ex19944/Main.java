package 백준.브론즈.브론즈4.Ex19944;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if(m == 1 || m == 2) {
            System.out.println("NEWBIE!");
        } else if(m <= n) {
            System.out.println("OLDBIE!");
        } else {
            System.out.println("TLE!");
        }
    }
}
