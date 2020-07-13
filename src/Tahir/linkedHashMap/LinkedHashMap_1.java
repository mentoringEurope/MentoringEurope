package Tahir.linkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_1 {


    public static void main(String[] args) {


        LinkedHashMap<String, Integer> country = new LinkedHashMap<>();
        //ToDo 5 tane ulke ismi ve nufusunu olusturuyoruz.(put)
        //ToDo 5 tane ulke ismi ve nufusunu yazdiriyoruz.(country)
        //ToDo 5 tane ulke ismi  yazdiriyoruz.(keyset())
        //ToDo 5 tane nufus   yazdiriyoruz.(values())
        //ToDo nufuslarin toplamini
        //ToDo kac tane 50 milyondan az nufuslu ulke var



        country.put("Turkiye", 85000000);
        country.put("Almanya", 82000000);
        country.put("Hollanda", 10000000);
        country.put("Yunanistan", 8000000);
        country.put("Amerika", 355000000);
        country.put(null,10000000);

        System.out.println(country);
        System.out.println("__________________________________________________________");
        for (Map.Entry<String, Integer> ulke:country.entrySet()) {
            System.out.println(ulke);
        }
        System.out.println("__________________________________________________________");

        System.out.println(country.keySet());

        for (String str:country.keySet()) {
            System.out.println(str);
        }

        System.out.println("__________________________________________________________");

        System.out.println(country.values());

        for (Integer i:country.values()) {
            System.out.println(i);
        }

        System.out.println("__________________________________________________________");

        int sum=0;
        for (Integer i:country.values()) {

            sum=sum+i;

        }
        System.out.println(sum);
        System.out.println("__________________________________________________________");

        int toplam=0;
        for (Map.Entry<String,Integer> i:country.entrySet()) {

            int nufus=i.getValue();
            toplam=toplam+nufus;

        }
        System.out.println(toplam);

        System.out.println("__________________________________________________________");

        int count=0;
        for (Map.Entry<String,Integer> i:country.entrySet()) {

//            int nufus=i.getValue();
//            if(nufus<50_000_000){
//                count++;
//            }

            if(i.getValue()<50000000){
                count++;
                System.out.println(i.getKey()+i.getValue());
            }


        }
        System.out.println(count);

    }
}