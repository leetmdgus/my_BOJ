package 백준.실버.실버5.Ex26517;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        long k = Long.parseLong(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());
        long d = Long.parseLong(st.nextToken());

        if(a * k + b == c * k + d) {
            System.out.println("Yes " +  (a * k + b));
        } else {
            System.out.println("No");
        }

    }
}
