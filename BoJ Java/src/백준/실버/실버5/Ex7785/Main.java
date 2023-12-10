package 백준.실버.실버5.Ex7785;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<String> set = new TreeSet(Comparator.reverseOrder());

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String note = st.nextToken();
            if (note.equals("leave")) {
                if (set.contains(name)) set.remove(name);
            } else if (note.equals("enter")) {
                set.add(name);
            }

        }

        Iterator<String> iter = set.iterator();
        while (iter.hasNext()) {
            while (iter.hasNext()) {
                System.out.println(iter.next());
            }
        }

    }
}
