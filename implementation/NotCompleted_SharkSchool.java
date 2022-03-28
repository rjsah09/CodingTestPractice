package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NotCompleted_SharkSchool {
    static int[][] map;
    static int[][] property;
    static int n;
    static int students;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        students = n*n;
        map = new int[n][n];
        property = new int[students][5];   //0은 대상 학생, 이후로는 선호하는 학생
        for(int i = 0; i < students; i++) {
            String[] input = br.readLine().split(" ");
            for(int j = 0; j < 5; j++) {
                property[i][j] = Integer.parseInt(input[j]);
            }
        }

        //규칙
        for(int i = 0; i < students; i++) {
            getLocation(i);
        }
    }

    static int[] getLocation(int studNo) {
        int adjStud, blank;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                for(int k = 1; k <= 4; k++) {

                }
            }
        }

        return new int[] {0, 0};
    }

    static int[] neighbourStud(int[] nowPos, int dir){
        int[] nextPos = new int[2];

        switch (dir) {
            case 1 :
                nextPos[0] = nowPos[0] - 1;
                nextPos[1] = nowPos[1];
                break;
            case 2:
                nextPos[0] = nowPos[0];
                nextPos[1] = nowPos[1] + 1;
                break;
            case 3:
                nextPos[0] = nowPos[0] + 1;
                nextPos[1] = nowPos[1];
                break;
            case 4:
                nextPos[0] = nowPos[0];
                nextPos[1] = nowPos[1] - 1;
                break;
        }

        return nextPos;
    }

}
