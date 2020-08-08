package Burak.Inheritance.Ornek2;

public class elektrikliBisiklet extends bisiklet{

    int akuKapasitesi;
    boolean gps;

    public elektrikliBisiklet(String renk, int kacTeker, double tekerlekBoyutu, boolean ziliVar, int akuKapasitesi, boolean gps) {
        super(renk, kacTeker, tekerlekBoyutu, ziliVar);
        this.akuKapasitesi = akuKapasitesi;
        this.gps = gps;
    }

    void eBisikletInfo(){

        System.out.println("Bisikletin aku kapasitesi: " + this.akuKapasitesi);
        System.out.println("Bisikletin GPS'i var mı? : " + this.gps);

    }

}
