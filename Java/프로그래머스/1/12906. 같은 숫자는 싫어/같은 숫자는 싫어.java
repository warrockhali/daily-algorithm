import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        Deque<Integer> deque = new ArrayDeque<>();
        
        for (int i = 0; i < arr.length; i++) {
        
            
            if (deque.isEmpty()) {
                
               deque.offer(arr[i]); 
                
            }else if (deque.peekLast() != arr[i]) {
                
                deque.offer(arr[i]);
                
            }
           
        }
        
        answer = new int[deque.size()];
        
        int size = deque.size();
        
        
        for (int i = 0; i < size; i++) {
            answer[i] = deque.poll();
        }        
        
        return answer;
    }
}