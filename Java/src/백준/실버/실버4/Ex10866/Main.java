package 백준.실버.실버4.Ex10866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();
        for(int i = 0; i<n ;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            switch (order) {
                case "push_front":
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    sb.append(deque.isEmpty() ? -1 : deque.removeFirst()).append('\n');
                    break;
                case "pop_back":
                    sb.append(deque.isEmpty() ? -1 : deque.removeLast()).append('\n');
                    break;
                case "size":
                    sb.append(deque.size()).append('\n');
                    break;
                case "empty":
                    sb.append(deque.isEmpty() ? 1 : 0).append('\n');
                    break;
                case "front":
                    sb.append(deque.isEmpty() ? -1 : deque.peekFirst()).append('\n');
                    break;
                case "back":
                    sb.append(deque.isEmpty() ? -1 : deque.peekLast()).append('\n');
                    break;
            }

        }
        System.out.println(sb);
    }
}
