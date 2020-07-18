package Tahir.methods;

import java.util.Scanner;

public class Method4 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your grade");
        int grade=scan.nextInt();
        System.out.println(grades(grade));
    }




    public static String grades(int grade){

        String str="";
        if(grade>=85){
            str= "Perfect";
        }else if(grade>=70){
            str= "Good";
        }else if(grade>=60){
           str=  "Normal";
        }else if(grade>=45){
            str= "Not bad";
        }else{
            str= "Bad";
        }

        return str;
    }
}
