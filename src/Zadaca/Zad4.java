package Zadaca;

import javax.swing.*;

public class Zad4 {
    public static void main(String[] args) {
        int count=0;
        int year = Integer.parseInt(JOptionPane.showInputDialog("Unesite godinu"));

        while (count < 20){
            if (year % 4 == 0 & (year % 100 != 0 || year % 400 == 0)){
                System.out.println(year);
                count++;
                year++;
            }else {year++;}
        }
    }
}
