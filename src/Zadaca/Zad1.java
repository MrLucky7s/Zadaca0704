package Zadaca;

import javax.swing.*;

public class Zad1 {

    public static void main(String[] args) {

        int num=0;
        int i;
        int sum=0;


        try {
           num = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj"));
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Unestie BROJ");
        }



        for (i = 1; i <= num; i++) {
            sum += i;

        }
        System.out.println("Vaš broj je: " + sum);
    }
}
