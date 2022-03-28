package bruteForce;

import java.util.Scanner;

public class NotCompleted_LeaveCompany {
    static int[][] schedule;
    static int n;
    static int answer = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        schedule = new int[n][2];

        for (int i = 0; i < n; i++) {
            schedule[i][0] = in.nextInt();
            schedule[i][1] = in.nextInt();
        }

        for (int i = 0; i < n; i++)
            dfs(schedule[i], i, 0);

        System.out.println(answer);
    }

    static void dfs(int[] consult,int day, int earned) {
        System.out.println(day + "일 경과 , 수입 = "  + earned);

        if(day + consult[0] > n) {
            if(earned > answer) answer = earned;
            return;
        }


        for(int i = day; i < n; i++) {  //다음 상담 일자를 시행하는 경우
            dfs(schedule[i], day + consult[0], earned + consult[1]);
        }
    }
}