package bruteForce;

import java.util.Scanner;

public class TimeChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int limit = in.nextInt();
        String check = in.next();
        int result = 0;
        String hour, min, sec;

        for(int i = 0; i <= limit; i++){    //시
            for(int j = 0; j < 60; j++){    //분
                for(int k = 0; k < 60; k++) { //초
                    if (i < 10)
                        hour = "0" + i;
                    else
                        hour = Integer.toString(i);

                    if (j < 10)
                        hour = "0" + i;
                    else
                        hour = Integer.toString(i);

                    if (k < 10)
                        hour = "0" + i;
                    else
                        hour = Integer.toString(i);

                    if (Integer.toString(i).contains(check) || Integer.toString(j).contains(check) || Integer.toString(k).contains(check))
                        result++;
                }
            }
        }

        System.out.println(result);
    }
}
