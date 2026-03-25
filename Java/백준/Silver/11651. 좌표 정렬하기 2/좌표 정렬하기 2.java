import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] coordinates = new int[n][2];
        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            coordinates[i][0] = y;
            coordinates[i][1] = x;
        }

        Comparator<int[]> comparator = new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {

                if (o1[0] != o2[0]) {
                    return o1[0] - o2[0];
                } else {
                    return o1[1] - o2[1];
                }

            }
        };

        Arrays.sort(coordinates, comparator);

        for (int i = 0; i < n; i++) {
            System.out.println(coordinates[i][1] + " " + coordinates[i][0]);
        }
    }
}