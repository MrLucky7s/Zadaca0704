package Zadaca;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Zad9 {
    public static void main(String[] args) {
        int matrix[] = new int[9999999];

        for (int i =0; i<matrix.length; i++){
            int randomNum = ThreadLocalRandom.current().nextInt(1, 999999999 + 1);
            matrix[i] = randomNum;
            System.out.println(matrix[i]);
        }
    }
}
