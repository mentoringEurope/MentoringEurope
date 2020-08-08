package Burak.Inheritance.Ornek2;

public class dagBisikleti extends bisiklet {

    int vitesSayisi;
    boolean araziTekeri;


    public dagBisikleti(String renk, int kacTeker, double tekerlekBoyutu, boolean ziliVar, int vitesSayisi, boolean araziTekeri) {
        super(renk, kacTeker, tekerlekBoyutu, ziliVar);
        this.vitesSayisi = vitesSayisi;
        this.araziTekeri = araziTekeri;
    }

    void dagBisikletiInfo(){

        System.out.println("Bisikletin vites sayısı: " + this.vitesSayisi);
        System.out.println("Bisikletin arazi tekeri var mı? : " + this.araziTekeri);
    }


}
