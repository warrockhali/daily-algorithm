import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            nums[i] = num;
            sum += num;
        }

        // 산술평균
        System.out.println(Math.round((double) sum / n));

        // 중앙값
        Arrays.sort(nums);
        System.out.println(nums[n/2]);

        // 최빈값
        int[] many = new int[8001];
        int maxCount = 0;
        boolean isSecond = false;
        int firstMax = 0;

        for (int i = 0; i < n; i++) {
            many[nums[i]+4000]++;
        }

        for (int i = 0; i < 8001; i++) {
            maxCount = Math.max(maxCount, many[i]);
        }

        for (int i = 0; i < 8001; i++) {
            if (many[i] == maxCount && isSecond) {
                firstMax = i - 4000;
                break;
            } else if (many[i] == maxCount) {
                isSecond = true;
                firstMax = i - 4000;
            }
        }

        System.out.println(firstMax);


        // 범위
        int max = nums[n-1];
        int min = nums[0];

        System.out.println(max - min);
    }

}
