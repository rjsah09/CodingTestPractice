package greedy;

import java.util.Scanner;

public class HoneyComb {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int spots = in.nextInt();
        int[] honey = new int[spots];
        int finish; //목적지에 대한 인덱스
        int result = 0;
        int mid = 0;    //처음에서 끝까지 한번 간 값

        //입력
        for (int i = 0; i < spots; i++)
            honey[i] = in.nextInt();

        //목적지 설정
        if(spots == 3) {
            for(int i = 0; i < spots; i++)
                if(honey[i] > result)
                    result = honey[i] * 2;
        } else if(honey[0] < honey[spots - 1]) {   //정방향
            finish = spots - 1;
            for(int i = 1; i < finish - 1; i++) {   //i가 두 번째 벌의 위치
                mid = honey[finish] * 2;
                for(int j = 1; j <= finish - 1; j++){    //j로 반복을 통해 더하고 i 위치의 양만큼을 뺌
                    if(j < i) {
                        mid += honey[j];
                    }else if(j > i) {
                        mid += honey[j] * 2;
                    }
                }
                if(mid > result)
                    result = mid;
            }
        } else if(honey[0] >= honey[spots - 1]) {    //역방향
            finish = 0;
            for(int i = spots - 2; i > finish; i--) {   //i가 두 번째 벌의 위치
                mid = honey[finish] * 2;
                for(int j = spots - 2; j > finish; j--){    //j로 반복을 통해 더하고 i 위치의 양만큼을 뺌
                    if(j < i) {
                        mid += honey[j];
                    }else if(j > i) {
                        mid += honey[j] * 2;
                    }
                }
                if(mid > result)
                    result = mid;
            }
        }
        System.out.println(result);
    }
}
