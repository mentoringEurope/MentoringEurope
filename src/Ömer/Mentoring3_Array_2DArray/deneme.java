package Ömer.Mentoring3_Array_2DArray;

import java.util.ArrayList;
import java.util.Collections;

public class deneme {
    public static void RandomEkleVeOrtakElemaniBul(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        for (int i = 0; i < 6; i++) {
            a.add((int)(Math.random()*50+1));
        }
        for (int i = 0; i < 6; i++) {
            b.add((int)(Math.random()*50+1));
        }
        Collections.sort(a);
        Collections.sort(b);

        System.out.println("a ilk hali = " + a);
        System.out.println("b ilk hali = " + b);

        int c=0;
        ArrayList<Integer> ortak = new ArrayList<>();
        for (int i = 0; i <6 ; i++) {
            if (b.contains(a.get(i))) {
                ortak.add(b.get(i));
                c++;
            }
        }

        if(c==0) System.out.println("Ortak eleman yoktur...");

        else
            System.out.println("Ortak elemanlı yeni array: "+ ortak);

    }

    public static void OrtakElemanlariKaldir(ArrayList<Integer> a, ArrayList<Integer> b){
        int control = a.size();
        a.removeAll(b);
        if (control>a.size())System.out.println("Ortak olanları çıkardıktan sonra Arraylist a : "+a);
    }

    public static void main(String[] args) {

        ArrayList<Integer> a= new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        RandomEkleVeOrtakElemaniBul(a,b);

        OrtakElemanlariKaldir(a,b);

    }
}
