package Sema.twoD.withMethod;

public class Task {
   /*
    int array[][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
    verilen Array icinde
    --> kac tane rakam oldugunu return eden  methodu yazdiriniz
    --> kac tane tek sayi oldugunu return eden methodu yazdiriniz
    --> kac tane cift sayi oldugunu return eden methodu yazdiriniz
    -->en buyuk sayi
    -->en kucuk sayi
    */

    public static void main(String[] args) {

        int array[][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};

        System.out.println("2D Array'deki rakam sayisi:"+sayiBul(array));
        System.out.println("2D Array'deki tek numara sayisi:"+tekSayiBul(array));
        System.out.println("2D Array'deki cift numara sayisi:"+ciftSayiBul(array));
        System.out.println("2D Array'deki max numara:"+maxSayiyiBul(array));
        System.out.println("2D Array'deki min numara:"+minSayiyiBul(array));
    }

    private static int minSayiyiBul(int[][] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }

        }
        return min;
    }


    private static int maxSayiyiBul(int[][] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }



    private static int ciftSayiBul(int[][] array) {
        int say=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j]%2==0)
                    say++;
            }
        }
        return say;
    }

    private static int tekSayiBul(int[][] array) {
        int say=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j]%2!=0)
                say++;
            }
        }
        return say;
    }


    private static int sayiBul(int[][] array){
        int say=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                say++;
            }
        }
        return say;
    }
}
