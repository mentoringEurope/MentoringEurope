package Tahir;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ders_2 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your sentence : ");
        String snts = scan.nextLine();

        Map<Character,Integer> free= new TreeMap<>();

        for (int i = 0; i < snts.length(); i++) {
            char c = snts.charAt(i);

            if (free.containsKey(c)) {
                free.replace(c, (free.get(c) + 1));
            } else {
                free.put(c, i);
            }

        }

        for (Map.Entry<Character, Integer> entry : free.entrySet()) {
            System.out.println("Karakter : " + entry.getKey() + " " + entry.getValue() + " kadar geciyor");

        }


    }
}