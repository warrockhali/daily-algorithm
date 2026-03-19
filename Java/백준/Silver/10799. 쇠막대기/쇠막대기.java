import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sticks = br.readLine();
        Stack<Character> stack = new Stack<>();

        int answer = 0;

        for (int i = 0; i < sticks.length(); i++) {

            if (sticks.charAt(i) == '(') {
                stack.push(sticks.charAt(i));
            } else if (sticks.charAt(i) == ')') {

                if (sticks.charAt(i - 1) == '(') {
                    stack.pop();
                    answer += stack.size();
                } else {
                    stack.pop();
                    answer++;
                }

            }
        }


        System.out.println(answer);
        
    }
}