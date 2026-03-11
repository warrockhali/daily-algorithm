import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int count = 0;
        int index = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '*') {
                index = i;
            } else {
                int num = Character.getNumericValue(s.charAt(i));

                if (i % 2 == 0) {
                    count += num;
                } else {
                    count += num * 3;
                }
            }
        }

        if (index % 2 != 0) {

            for (int i = 0; i < 10; i++) {

                if ((count + (i * 3)) % 10 == 0) {
                    System.out.println(i);
                    break;
                }
            }
        } else {
            for (int i = 0; i < 10; i++) {

                if ((count + i) % 10 == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }

    }
}