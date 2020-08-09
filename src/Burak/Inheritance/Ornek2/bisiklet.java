package Burak.Inheritance.Ornek2;

public class bisiklet {

    String renk;
    int kacTeker;
    double tekerlekBoyutu;
    boolean ziliVar;


    public bisiklet(String renk, int kacTeker, double tekerlekBoyutu, boolean ziliVar) {
        this.renk = renk;
        this.kacTeker = kacTeker;
        this.tekerlekBoyutu = tekerlekBoyutu;
        this.ziliVar = ziliVar;
    }

    void bisikletInfo(){


        System.out.println("Bisikletin Rengi: " + this.renk);
        System.out.println("Bisiklet kaç teker: " + this.kacTeker);
        System.out.println("Bisikletin teker boyutu: " + this.tekerlekBoyutu);
        System.out.println("Bisikletin zili var mı? : " + this.ziliVar);

    }





}
