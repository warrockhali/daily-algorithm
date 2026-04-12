import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] values = new int[n];

        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(br.readLine());
            values[i] = value;
        }

        int i = n - 1;

        int count = 0;

        while (k > 0) {

            if (k - values[i] >= 0) {
                k -= values[i];
                count++;
            } else {

                if (i >= 1) {
                    i--;
                }

            }

        }

        System.out.println(count);
    }
}
