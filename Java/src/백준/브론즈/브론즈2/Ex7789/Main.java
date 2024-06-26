package 백준.브론즈.브론즈2.Ex7789;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        String m = st.nextToken();


        String ans = isPrime(n) && isPrime(Integer.parseInt(m+n)) ? "Yes" : "No";
        System.out.println(ans);
    }

    public static boolean isPrime(int n) {
        for(int i = 2; i<=Math.sqrt(n); i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }
}
