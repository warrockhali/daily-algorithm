import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int count = 0;

        HashSet<String> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            set.add(name);
        }

        for (int i = 0; i < m; i++) {
            String name = br.readLine();
            boolean contains = set.contains(name);

            if (contains) {
                list.add(name);
                count++;
            }
        }

        System.out.println(count);

        Collections.sort(list);

        for (String s : list) {
            System.out.println(s);
        }
    }
}
