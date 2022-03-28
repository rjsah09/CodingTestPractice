package greedy;

import java.util.Scanner;

public class Coin {
    public void value(){
        Scanner in = new Scanner(System.in);
        int coinCount = in.nextInt();
        int priceWant = in.nextInt();
        int[] coinValues = new int[coinCount];

        for(int i = 0; i < coinCount; i++)
            coinValues[i] = in.nextInt();

        int coins = 0;
        int priceLeft = priceWant;
        int idx = coinCount - 1;

        while(priceLeft == 0){
            coins += priceLeft / coinValues[idx];

        }

        System.out.println(coins);
    }
}
