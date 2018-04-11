package Zadaca;

import javax.swing.*;

public class Zad3 {
    public static void main(String[] args) {
        int a;
        int b;
        do {
            a = Integer.parseInt(JOptionPane.showInputDialog("Unesite velicinu tablice"));
        } while (a > 12 || a <= 0);
        b = a;

        for (int i = 1; i <= a; ++i) {
            for (int j = 1; j <= b; ++j) {
                System.out.printf("%4d",i*j);
            }
            System.out.println();
        }


    }
}
