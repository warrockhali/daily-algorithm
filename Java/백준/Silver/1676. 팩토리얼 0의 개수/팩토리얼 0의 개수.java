import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 1; i <= n; i++) {

            if (i % 125 == 0) {
                count += 3;
            } else if (i % 25 == 0) {
                count += 2;
            } else if (i % 5 == 0) {
                count ++;
            }

        }

        System.out.println(count);

    }
}