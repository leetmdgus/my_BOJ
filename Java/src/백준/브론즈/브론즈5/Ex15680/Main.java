package 백준.브론즈.브론즈5.Ex15680;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = n == 0 ? "YONSEI" : "Leading the Way to the Future";
        System.out.println(str);
    }
}
