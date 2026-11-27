import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        String[] words = new String[n];
        
        for(int i = 0; i < n; i++) {
            words[i] = br.readLine();
        }

        Arrays.sort(words, (a, b) -> {
            if (a.length() != b.length()) {
              return Integer.compare(a.length(),b.length());
            }else {
                return a.compareTo(b);
            }
        });
        
        StringBuilder sb = new StringBuilder();
        sb.append(words[0]).append('\n');
        for (int i = 1; i < n; i++) {
            if (!words[i].equals(words[i-1])) {
                sb.append(words[i]).append('\n');
            }
        }
        
        System.out.print(sb);
            
        
    }
}