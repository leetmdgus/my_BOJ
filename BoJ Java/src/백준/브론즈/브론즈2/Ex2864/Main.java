package 백준.브론즈.브론즈2.Ex2864;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();

        int minA = Integer.parseInt(a.replace("6", "5"));
        int minB = Integer.parseInt(b.replace("6", "5"));

        int maxA = Integer.parseInt(a.replace("5", "6"));
        int maxB = Integer.parseInt(b.replace("5", "6"));

        int min = minA+minB;
        int max = maxA+maxB;

        System.out.println(min + " " + max);
    }
}
