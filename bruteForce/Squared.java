package bruteForce;

import java.util.Scanner;

/*DP 공부하고 다시 풀기*/

public class Squared {
    static int input;
    static final int maxDepth = 4;
    static int answer = 5;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        input = in.nextInt();

        dfs(1,0);

        System.out.println(answer);
    }

    //length : 최대 숫자의 개수, level : 현재 숫자의 개수,
    static void dfs(int level, int prev) {
        for(int i = 1 ; i < Math.sqrt(input); i++) {
            int res = prev + i * i;
            if(res == input && answer > level) {
                answer = level;
                return;
            } else if(res > input)
                return;
            if(level < maxDepth)
                dfs(level + 1, res);
        }
    }
}
