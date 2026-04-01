import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int bags = 0;

        while (n >= 0) {

            if (n % 5 == 0) {
                bags += (n / 5);
                System.out.println(bags);
                return;
            }

            n -= 3;
            bags++;
        }

        System.out.println(-1);

    }
}