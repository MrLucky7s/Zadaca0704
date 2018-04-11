package Zadaca;

public class Zad7 {
    public static void neparni(int[] polje){
        for(int i=0; i<polje.length; i+=2){
            System.out.println(polje[i]);
        }

    }
    public static void main(String[] args) {

        int[] x ={13,2,8,9,7,6,4,6,3,6};
        neparni(x);

    }
}
