package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Duck {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        final String howling = "quack";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int ducks = 0;

        if(input.length() % 5 != 0) {
            System.out.println(-1);
            return;
        }

        //quack가 끝나기 전에 새로운 q가 나오는 경우, 이전까지의 quack의 진행을 스택에 저장하고 새로운 quack를 탐색(오리 수 증가)
        int i = 0;
        while(i < input.length()) {
            if(input.charAt(i) == 'q') {
                for(int j = 0; j < list.size(); i++) {
                    if(list.get(j).charAt(list.get(j).length() - 1) == 'k')
                }
            }
        }
            System.out.println(ducks);
    }
}
