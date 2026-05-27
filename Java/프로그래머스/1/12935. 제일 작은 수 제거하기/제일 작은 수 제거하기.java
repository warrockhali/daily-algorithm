import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int min = arr[0];
        
        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i] < min) {
                min = arr[i];
            }
            
        }
        
        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i] == min) {
            } else {
                list.add(arr[i]);
            }
            
        }
        
        int[] answer = new int[list.size()];
        
        if (list.size() == 0) {
            answer = new int[]{-1};
        }else {
            
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
            
        }
        
        return answer;
    }
}