package bruteForce;

import java.util.Scanner;

public class decompose {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int input = in.nextInt();
        int sum = 0, result = 1000001;

        for(int i = 0; i <= input; i++) {
            sum += i;

            int left = i;
            while(left > 0) {
                sum += left % 10;
                left /= 10;
            }
            if(sum == input && i < result)
                result = i;

            sum = 0;
        }

        if(result == 1000001)
            System.out.println(0);
        else
            System.out.println(result);
    }
}
