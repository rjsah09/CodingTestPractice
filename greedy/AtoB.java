package greedy;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class AtoB {
    public void getMin() {
        Scanner in = new Scanner(System.in);

        int start = in.nextInt();
        int finish = in.nextInt();
        int count = 0;

        if(finish % 2 != 0 || finish % 2 != 1) {
            System.out.println("-1");
            return;
        }

        while(start == finish) {
        }

    }
}
