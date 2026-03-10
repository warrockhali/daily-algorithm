import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;

        StringBuilder sb = new StringBuilder();

        while ((line = br.readLine()) != null) {

            if (line.equals(".")) break;

            Stack<Character> stack = new Stack<>();
            boolean isBalanced = true;

            for (char c : line.toCharArray()) {

                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')') {

                    if (stack.isEmpty()) {
                        isBalanced = false;
                        break;
                    } else {
                        Character pop = stack.pop();

                        if (pop != '(') {
                            isBalanced = false;
                            break;
                        }
                    }
                } else if (c == ']') {

                    if (stack.isEmpty()) {
                        isBalanced = false;
                        break;
                    } else {
                        Character pop = stack.pop();

                        if (pop != '[') {
                            isBalanced = false;
                            break;
                        }
                    }
                }
            }

            if (isBalanced && stack.isEmpty()) {
                sb.append("yes").append("\n");
            } else {
                sb.append("no").append("\n");
            }
        }

        System.out.println(sb);

    }
}