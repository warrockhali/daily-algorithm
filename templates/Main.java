import java.io.*;
import java.util.*;

/**
 * 백준 제출용 기본 템플릿.
 * - 입력: BufferedReader + StringTokenizer (Scanner보다 훨씬 빠름)
 * - 출력: StringBuilder에 모았다가 한 번에 출력 (반복문 안 println 금지)
 */
public class Main {

    static final int[] DX = {-1, 1, 0, 0};
    static final int[] DY = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        // TODO: 풀이

        sb.append(n).append('\n');
        System.out.print(sb);
    }

    /** 격자 범위 체크 */
    static boolean inRange(int x, int y, int n, int m) {
        return 0 <= x && x < n && 0 <= y && y < m;
    }
}
