import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] board = new char[n][m];

        for (int i = 0; i < n; i++) {

            String line = br.readLine();

            for (int k = 0; k < m; k++) {

                board[i][k] = line.charAt(k);
            }

        }

        int minResult = 64;

        for (int i = 0; i <= n - 8; i++) {

            for (int k = 0; k <= m - 8; k++) {

                int count = 0;

                for (int r = i; r < i + 8; r++) {
                    for (int c = k; c < k + 8; c++) {

                        char c1 = board[r][c];

                        if ((r + c) % 2 == 0) {

                            if (c1 != 'W') {
                                count++;
                            }

                        }else {

                            if (c1 != 'B') {
                                count++;
                            }
                        }
                    }
                }

                if (minResult > Math.min(count, 64 - count)) {
                    minResult = Math.min(count, 64 - count);
                }

            }
        }

        System.out.println(minResult);

    }
}