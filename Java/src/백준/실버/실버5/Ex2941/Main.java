package 백준.실버.실버5.Ex2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String[] cro = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for(int i = 0; i<cro.length; i++) {
            str = str.replace(cro[i],"*");
        }
        System.out.println(str.length());
    }
}
