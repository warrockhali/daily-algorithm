import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        

        int count = 0;

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            Deque<Character> stack = new ArrayDeque<>();

            for (int k = 0; k < word.length(); k++) {
                
                char alpha = word.charAt(k);

                if (!stack.isEmpty() && stack.peekFirst().equals(alpha)) {
                    stack.pollFirst();
                } else if (stack.isEmpty()) {
                    stack.push(alpha);
                } else if (!stack.peekFirst().equals(alpha)) {
                    stack.push(alpha);
                }
            }

            if (stack.isEmpty()) {
                count++;
            }

        }

        System.out.println(count);



    }
}