import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String str = br.readLine();

            boolean isYes = true;
            Deque<Character> stack = new ArrayDeque<>();

            for (Character c : str.toCharArray()) {

                if (stack.isEmpty() && c.equals('(')) {
                    stack.push(c);
                } else if (c.equals(')')) {

                    if (stack.isEmpty()) {
                        isYes = false;
                        break;
                    } else if (stack.peek().equals('(')) {
                        stack.pop();
                    }
                } else {
                    stack.push(c);
                }

            }

            if (isYes && stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }





    }
}