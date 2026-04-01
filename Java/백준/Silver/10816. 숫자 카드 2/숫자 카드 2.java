import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] num = new int[20000001];

        StringTokenizer st = new StringTokenizer(br.readLine());


        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());

            if (a < 0) {
                num[10000000 + (-a)]++;
            } else {
                num[a]++;
            }
        }

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {

            int a = Integer.parseInt(st.nextToken());

            if (a < 0) {
                sb.append(num[10000000 + (-a)]).append(" ");
            } else {
                sb.append(num[a]).append(" ");
            }

        }

        System.out.println(sb.toString().trim());
    }

}
