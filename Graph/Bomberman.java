package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bomberman {
    static String[][] map;
    static boolean[][] visited;
    static int[][] firstBomb;
    static int[][] secondBomb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);
        int r = Integer.parseInt(st.nextToken());   //i
        int c = Integer.parseInt(st.nextToken());   //j
        int n = Integer.parseInt(st.nextToken());   //n초후 상황
        map = new String[r][c];
        visited = new boolean[r][c];

        for(int i = 0; i < r; i++) {
            line = br.readLine();
            for(int j = 0; j < c; j++)
                map[i][j] = line.substring(j, j + 1);
        }

        int time = 1;
        while(time == n) {
            time++;
            setBomb();
            time++;
            explosion();
        }
    }

    static void explosion() {

    }

    static void setBomb() {

    }
}
