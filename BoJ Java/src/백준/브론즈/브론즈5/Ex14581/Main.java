package 백준.브론즈.브론즈5.Ex14581;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = ":" + br.readLine() + ":";
        String fan = ":fan:";

        System.out.println(fan + fan + fan);
        System.out.println(fan + str + fan);
        System.out.println(fan + fan + fan);
    }
}
