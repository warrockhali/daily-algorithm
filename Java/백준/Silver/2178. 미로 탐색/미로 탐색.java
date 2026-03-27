import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] maze = new int[n][m];

        for (int i = 0; i < n; i++) {

            String line = br.readLine();

            for (int j = 0; j < m; j++) {

                maze[i][j] = line.charAt(j) - '0';

            }
        }

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        Queue<int[]> queue = new ArrayDeque<>();

        maze[0][0] = 2;

        queue.add(new int[]{0, 0});

        while (!queue.isEmpty()) {

            int[] poll = queue.poll();

            for (int i = 0; i < 4; i++) {

                int nx = poll[0] + dx[i];
                int ny = poll[1] + dy[i];

                if (nx < n && ny < m && nx >= 0 && ny >= 0) {

                    if (maze[nx][ny] == 1) {
                        maze[nx][ny] = maze[poll[0]][poll[1]] + 1;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }

        }

        System.out.println(maze[n-1][m-1] - 1);




    }
}