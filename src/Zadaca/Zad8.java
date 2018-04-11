package Zadaca;

public class Zad8 {

    public static void poljeint (int num){
        int[]digits = Integer.toString(num).chars().map(c -> c-='0').toArray();
        for(int d : digits)
            System.out.println(d);

    }


    public static void main(String[] args) {

        int num = 3645897;
        poljeint(num);


    }
}
