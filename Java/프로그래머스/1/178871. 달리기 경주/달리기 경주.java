import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (String calling : callings) {
            int num = map.get(calling);

            String tempName = players[num - 1];

            players[num - 1] = players[num];
            players[num] = tempName;

            map.put(players[num - 1], num - 1);
            map.put(players[num], num);
        }

        return players;
    }
}