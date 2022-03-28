package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StockTrading {
    static int[] chart;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = Integer.parseInt(br.readLine());
        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);
        chart = new int[14];

        for(int i = 0; i < 14; i++)
           chart[i] = Integer.parseInt(st.nextToken());

        int jhMoney = bnp(money);
        int smMoney = timing(money);

        if(jhMoney > smMoney)
            System.out.println("BNP");
        else if(jhMoney < smMoney)
            System.out.println("TIMING");
        else
            System.out.println("SAMESAME");
    }

    static int bnp(int money) {
        int bought = 0;
        for(int i = 0; i < 13; i++) {
            int canBuy = money / chart[i];
            bought += canBuy;
            money -= canBuy * chart[i];
        }

        return chart[13] * bought + money;
    }

    static int timing(int money) {
        int[] upDown = new int[14]; //전일 대비 상승한 경우 1, 하락 2, 유지 0
        int bought = 0;

        for(int i = 1; i < 14; i++)     //상승 하락 체크
            if(chart[i] > chart[i - 1])
                chart[i] = 1;
            else if(chart[i] < chart[i - 1])
                chart[i] = 2;

        for(int i = 2; i < 14; i++)
            if(chart[i] == 1 && chart[i - 1] == 1 && chart[i - 2] == 1) {
                money += chart[i] * bought;
                bought = 0;
            } else if(chart[i] == 2 && chart[i - 1] == 2 && chart[i - 2] == 2) {
                int canBuy = money / chart[i];
                bought += canBuy;
                money = money % chart[i];
            }

        return chart[13] * bought + money;
    }
}
