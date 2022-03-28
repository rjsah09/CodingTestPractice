package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Atm {
    public void getTime(){
        Scanner in = new Scanner(System.in);

        int people = in.nextInt();
        int[] times = new int[people];
        int totalTime = 0;

        for(int i = 0; i < people; i++)
            times[i] = in.nextInt();

        Arrays.sort(times);

        int prev = 0;   //이전 시간
        for(int i = 0; i < people; i++) {
            totalTime += prev + times[i];
            prev += times[i];
        }

        System.out.println(totalTime);
    }
}
