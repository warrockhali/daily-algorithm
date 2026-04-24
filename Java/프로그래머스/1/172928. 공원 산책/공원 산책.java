import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {

        boolean[][] maps = new boolean[park.length][park[0].length()];
        int[] answer = {0,0};

        for (int i = 0; i < park.length; i++) {

            for (int j = 0; j < park[i].length(); j++) {

                char c = park[i].charAt(j);

                if(c == 'X') {
                    maps[i][j] = false;
                }else if (c == 'S'){
                    maps[i][j] = true;
                    answer[0] = i;
                    answer[1] = j;
                } else {
                    maps[i][j] = true;
                }

            }
        }

        for (int i = 0; i < routes.length; i++) {

            StringTokenizer st = new StringTokenizer(routes[i]);
            String direction = st.nextToken();
            int size = Integer.parseInt(st.nextToken());

            if (direction.equals("N")) {

                if (answer[0] - size < park.length && answer[0] - size >= 0) {

                    boolean isNotError = true;

                    for (int j = 1; j <= size; j++) {

                        if (maps[answer[0] - j][answer[1]] == false) {
                            isNotError = false;
                            break;
                        }
                    }

                    if (isNotError) {
                        answer[0] -= size;
                    }
                }

            }else if (direction.equals("S")) {

                 if (answer[0] + size < park.length && answer[0] + size >= 0) {

                    boolean isNotError = true;

                    for (int j = 1; j <= size; j++) {

                        if (maps[answer[0] + j][answer[1]] == false) {
                            isNotError = false;
                            break;
                        }
                    }

                    if (isNotError) {
                        answer[0] += size;
                    }
                }

            }else if (direction.equals("W")) {

                if (answer[1] - size < park[0].length() && answer[1] - size >= 0) {

                    boolean isNotError = true;

                    for (int j = 1; j <= size; j++) {

                        if (maps[answer[0]][answer[1] - j] == false) {
                            isNotError = false;
                            break;
                        }
                    }

                    if (isNotError) {
                        answer[1] -= size;
                    }
                }

            }else if (direction.equals("E")) {

                if (answer[1] + size < park[0].length() && answer[1] + size >= 0) {

                    boolean isNotError = true;

                    for (int j = 1; j <= size; j++) {

                        if (maps[answer[0]][answer[1] + j] == false) {
                            isNotError = false;
                            break;
                        }
                    }

                    if (isNotError) {
                        answer[1] += size;
                    }
                }

            }


        }




        return answer;
    }
}