import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] person = new int[n];

        for (int i = 0; i < n; i++) {
            int time = Integer.parseInt(st.nextToken());
            person[i] = time;
        }

        int count = 0;
        int result = 0;

        Arrays.sort(person);

        for (int i = 0; i < n; i++) {
            count += person[i];
            result += count;
        }

        System.out.println(result);
    }
}
