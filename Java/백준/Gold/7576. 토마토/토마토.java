import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[][] box = new int[N][M];

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        Queue<int[]> queue = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {

            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < M; j++) {
                int tomato = Integer.parseInt(st.nextToken());

                if (tomato == 1) {
                    queue.add(new int[]{i, j});
                }
                box[i][j] = tomato;
            }
        }

        while (!queue.isEmpty()) {

            int[] poll = queue.poll();
            int x = poll[0];
            int y = poll[1];

            for (int i = 0; i < 4; i++) {

                int nx = poll[0] + dx[i];
                int ny = poll[1] + dy[i];

                if (nx >= 0 && nx < N && ny >= 0 && ny < M) {

                    if (box[nx][ny] == 0) {
                        box[nx][ny] = box[x][y] + 1;
                        queue.add(new int[]{nx, ny});
                    }

                }

            }

        }

        int maxDay = 0;

        boolean allTomatoIsGood = false;

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < M; j++) {

                maxDay = Math.max(maxDay, box[i][j]);

                if (box[i][j] == 0) {
                    allTomatoIsGood = true;
                    break;
                }
            }
        }

        if (allTomatoIsGood) {
            System.out.println(-1);
        } else {
            System.out.println(maxDay - 1);

        }

    }
}