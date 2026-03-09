import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String commands = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String nums = br.readLine();
            Deque<Integer> deque = new ArrayDeque<>();
            boolean isReverse = false;
            boolean isError = false;

            if (n > 0) {
                String sub = nums.substring(1, nums.length() - 1);
                String[] split = sub.split(",");

                for (String a : split) {
                    int num = Integer.parseInt(a);
                    deque.add(num);
                }
            }


            for (char cmd : commands.toCharArray()) {
                if (cmd == 'R') {
                    isReverse = !isReverse;
                } else if (cmd == 'D') {

                    if (deque.isEmpty()) {
                        isError = true;
                        break;
                    } else {

                        if (isReverse) {
                            deque.pollLast();
                        } else {
                            deque.pollFirst();
                        }

                    }
                }
            }

            if (isError) {
                System.out.println("error");
            } else {
                StringBuilder sb = new StringBuilder();

                int size = deque.size();

                if (isReverse) {

                    sb.append("[");

                    if (!deque.isEmpty()) {
                        sb.append(deque.pollLast());
                    }

                    for (int x = 1; x < size; x++) {
                        if (!deque.isEmpty()) {
                            sb.append(",").append(deque.pollLast());
                        }
                    }

                    sb.append("]");
                } else {
                    sb.append("[");

                    if (!deque.isEmpty()) {
                        sb.append(deque.pollFirst());
                    }

                    for (int x = 1; x < size; x++) {

                        if (!deque.isEmpty()) {
                            sb.append(",").append(deque.pollFirst());
                        }
                    }

                    sb.append("]");
                }
                System.out.println(sb);
            }
        }
    }

}
