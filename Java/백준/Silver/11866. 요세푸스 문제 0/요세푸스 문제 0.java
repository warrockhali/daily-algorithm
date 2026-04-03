import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            deque.addLast(i);
        }

        int count = 0;

        while (!deque.isEmpty()) {

            Integer a = deque.pollFirst();
            count++;

            if (count == k) {
                sb.append(a).append(",").append(" ");
                count = 0;
            } else {
                deque.addLast(a);
            }

        }

        sb.delete(sb.length() - 2, sb.length());
        sb.insert(0, "<");
        sb.append(">");

        System.out.println(sb);
    }
}
