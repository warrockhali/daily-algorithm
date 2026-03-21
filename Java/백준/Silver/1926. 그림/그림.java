import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String size = br.readLine();
        StringTokenizer st = new StringTokenizer(size);

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arts = new int[n][m];
        int artNums = 0;
        int artMax = 0;
        boolean[][] visited = new boolean[n][m];

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        Queue<int[]> queue = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int k = 0; k < m; k++) {
                int num = Integer.parseInt(st.nextToken());
                arts[i][k] = num;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < m; k++) {

                if (arts[i][k] == 1 && !visited[i][k]) {
                    visited[i][k] = true;
                    queue.add(new int[]{i, k});
                    int currentArea = 0;
                    artNums++;

                    while (!queue.isEmpty()) {
                        int[] cur = queue.poll();
                        currentArea++;

                        for (int d = 0; d < 4; d++) {
                            int nx = cur[0] + dx[d];
                            int ny = cur[1] + dy[d];

                            if (nx < n && ny < m && nx >= 0 && ny >= 0) {

                                if (arts[nx][ny] == 1 && !visited[nx][ny]) {
                                    visited[nx][ny] = true;
                                    queue.add(new int[]{nx, ny});
                                }

                            }
                        }
                    }
                    artMax = Math.max(artMax, currentArea);
                }

            }
        }

        System.out.println(artNums);
        System.out.println(artMax);

    }


}