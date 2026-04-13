import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] indexToName = new String[n + 1];
        HashMap<String, Integer> nameToIndex = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            indexToName[i] = name;
            nameToIndex.put(name, i);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            String query = br.readLine();
            if (Character.isDigit(query.charAt(0))) {
                sb.append(indexToName[Integer.parseInt(query)]).append("\n");
            } else {
                sb.append(nameToIndex.get(query)).append("\n");
            }
        }

        System.out.print(sb.toString());
    }
}