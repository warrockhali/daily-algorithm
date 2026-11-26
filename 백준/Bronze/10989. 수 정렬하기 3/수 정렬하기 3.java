import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] count = new int[10001];          // 숫자별 등장 횟수
        for (int i = 0; i < n; i++) {
            count[Integer.parseInt(br.readLine())]++;
        }

        for (int num = 1; num <= 10000; num++) {
            for (int c = 0; c < count[num]; c++) {
                bw.write(num + "\n");
            }
        }
        bw.flush();
    }
}