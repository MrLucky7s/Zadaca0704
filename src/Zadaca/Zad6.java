package Zadaca;

public class Zad6 {
    private static int[] obratno(int[] polje) {

        int[] obPolje = new int[polje.length];


        for (int i = 0; i < polje.length; i++) {
            obPolje[i] = polje[polje.length - 1 -i];
        }
        return obPolje;
    }



    public static void main(String[] args) {
        int array [] ={32,14,69,77,88,99,5,7};

        int polje [] = obratno(array);

        for (int aPolje : polje) {
            System.out.println(aPolje);

        }

    }
}
