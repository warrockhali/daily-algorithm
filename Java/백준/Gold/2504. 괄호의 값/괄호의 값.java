import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String expression = reader.readLine();

        System.out.println(calculateBracketValue(expression));
    }

    
    public static int calculateBracketValue(String expression) {
        Stack<Character> stack = new Stack<>();
        int totalSum = 0;
        int currentMultiplier = 1;

        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);

            if (currentChar == '(') {
                stack.push(currentChar);
                currentMultiplier *= 2;
            } else if (currentChar == '[') {
                stack.push(currentChar);
                currentMultiplier *= 3;
            } else if (currentChar == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return 0; 
                }
                if (expression.charAt(i - 1) == '(') {
                    totalSum += currentMultiplier;
                }
                stack.pop();
                currentMultiplier /= 2;
            } else if (currentChar == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    return 0; 
                }
                if (expression.charAt(i - 1) == '[') {
                    totalSum += currentMultiplier;
                }
                stack.pop();
                currentMultiplier /= 3;
            }
        }

        return stack.isEmpty() ? totalSum : 0;
    }
}