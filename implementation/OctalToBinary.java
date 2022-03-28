package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OctalToBinary {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int decimal = Integer.parseInt(br.readLine(), 8);
        System.out.println(Integer.toBinaryString(decimal));
    }
}
