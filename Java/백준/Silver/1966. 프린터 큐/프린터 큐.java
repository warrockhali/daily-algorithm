import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            ArrayDeque<int[]> queue = new ArrayDeque<>();
            st = new StringTokenizer(br.readLine());
            int[] prior = new int[n];

            for (int j = 0; j < n; j++) {
                int a = Integer.parseInt(st.nextToken());
                prior[j] = a;
                queue.add(new int[]{j, a});
            }

            Arrays.sort(prior);
            int mostPrior = prior.length - 1;
            int result = 0;

            while (!queue.isEmpty()) {

                if (queue.peek()[1] != prior[mostPrior]) {
                    int[] poll = queue.poll();
                    queue.addLast(poll);
                } else {
                    int[] poll = queue.poll();
                    mostPrior--;
                    result++;
                    if (poll[0] == m) {
                        break;
                    }

                }
            }

            System.out.println(result);


        }



    }

}
