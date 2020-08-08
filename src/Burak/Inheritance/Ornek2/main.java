package Burak.Inheritance.Ornek2;

public class main {
    public static void main(String[] args) {


        bisiklet B = new bisiklet("Beyaz", 2, 24,true);
        B.bisikletInfo();

        System.out.println("-----------------------");

        dagBisikleti dB = new dagBisikleti("Bordo", 2, 28, false, 24, true);
        dB.bisikletInfo();
        dB.dagBisikletiInfo();

        System.out.println("-----------------------");

        elektrikliBisiklet eB = new elektrikliBisiklet("Siyah", 3, 26,true,750,true);
        eB.bisikletInfo();
        eB.eBisikletInfo();


    }
}
