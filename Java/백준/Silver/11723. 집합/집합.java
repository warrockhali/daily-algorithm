import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[] nums = new int[21];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            String order = st.nextToken();

            if (order.equals("add")) {
                int x = Integer.parseInt(st.nextToken());

                if (nums[x] == 0) {
                    nums[x]++;
                }

            } else if (order.equals("remove")) {
                int x = Integer.parseInt(st.nextToken());

                if (nums[x] == 1) {
                    nums[x]--;
                }

            } else if (order.equals("check")) {

                int x = Integer.parseInt(st.nextToken());

                if (nums[x] == 1) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else if (order.equals("toggle")) {

                int x = Integer.parseInt(st.nextToken());

                if (nums[x] == 1) {
                    nums[x] = 0;
                } else {
                    nums[x]++;
                }

            } else if (order.equals("all")) {
                Arrays.fill(nums, 1);
            } else if (order.equals("empty")) {
                Arrays.fill(nums, 0);
            }


        }

        System.out.println(sb);

    }
}
