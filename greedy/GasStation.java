package greedy;

import java.util.Scanner;

public class GasStation {
    final int maxVal = 1000000001;
    public void getGas(){
        Scanner in = new Scanner(System.in);
        int nodes = in.nextInt();       //노드의 개수
        long[] roads = new long[nodes - 1];   //엣지의 개수
        long[] gasCosts = new long[nodes];    //노드별 기름 값의 개수
        long result = 0;

        for(int i = 0; i < nodes - 1; i++)
            roads[i] = in.nextInt();

        for(int i = 0; i < nodes; i++)
            gasCosts[i] = in.nextInt();

        long leastCost = 1000000000;
        for(int i = 0; i < nodes - 1; i++) {
            if(gasCosts[i] <= leastCost) {
                leastCost = gasCosts[i];
            }
            //최소 기름갑 구하기 끝

            result += leastCost * roads[i];
        }

        System.out.println(result);
    }
}
