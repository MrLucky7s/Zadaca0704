package Zadaca;

import javax.swing.*;

public class Zad5 {
    public static void main(String[] args) {
        int size =Integer.parseInt(JOptionPane.showInputDialog("Unesite velicinu polja"));
        int polje [] = new int[size];
        int max = polje [0];

        for (int j=0; j<polje.length;j++){
            polje[j]=Integer.parseInt(JOptionPane.showInputDialog("Unesite element polja"));
        }

        for (int i=0; i<polje.length; i++){
            if (polje [i]>max){
                max=polje[i];
            }
        }
        System.out.println("Maksimum je: "+max);
    }
}
