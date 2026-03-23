import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
  
    static class Person {
        int weight;
        int height;
        int rank;

        public Person(int weight, int height) {
            this.weight = weight;
            this.height = height;
            this.rank = 1; 
        }
    }

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        Person[] people = new Person[n];

      
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            people[i] = new Person(weight, height);
        }

      
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue; 

               
                if (people[i].weight < people[j].weight && people[i].height < people[j].height) {
                    people[i].rank++;
                }
            }
        }

      
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(people[i].rank).append(" ");
        }
        System.out.println(sb.toString().trim());
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}