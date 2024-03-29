package 백준.실버.실버4.Ex1158;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Ex1158 {
    public static void main(String[] args) throws IOException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        Queue<Integer> q = new LinkedList<>();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        //우선 배열을 만들자.;
        // 1번째 범위 수정
        for (int i = 1; i <= N; i++) {
            q.add(i); // 1, 2, 3, 4, 5, 6, 7
        }

        sb.append('<');
        //배열에서 삭제할 K!
        while (true) {
            for (int i = 1; i < K; i++) {
                q.add(q.poll());
            }
            sb.append(q.poll()).append(", ");

            if (q.size() <= 1) break;
        }
        sb.append(q.poll());
        sb.append('>');
        System.out.println(sb);
    }
}