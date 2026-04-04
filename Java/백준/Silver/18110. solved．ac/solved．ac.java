import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Long trimmed = Math.round(n * 0.15);

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(nums);

        double result = 0;

        for (int i = Math.toIntExact(trimmed); i < n - trimmed; i++) {
            result += nums[i];
        }

        Long average = Math.round(result / (n - (2 * trimmed)));


        System.out.println(average);
    }
}
