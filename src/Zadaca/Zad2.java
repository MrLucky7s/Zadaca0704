package Zadaca;

import javax.swing.*;

public class Zad2 {

    public static void main(String[] args) {
        int opt;
        int sum = 0;
        int pro = 1;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj"));
        do {
            opt = Integer.parseInt(JOptionPane.showInputDialog("Unesite 1 za zbrajanje ili 2 za mnozenje"));
        } while (opt != 1 && opt != 2);

        switch (opt) {
            case 1:
                for (int i = 1; i <= num; i++) {
                    sum += i;
                }
                System.out.println("Zbroj je " + sum);
                break;

            case 2:
                for (int i = 1; i <= num; i++) {
                    pro *= i;
                }
                System.out.println("Umnozak je " + pro);
                break;

        }
    }
}
