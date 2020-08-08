package Burak.Inheritance.Ornek3;

public class main {
    public static void main(String[] args) {

        insan arif = new insan();
        cocuk can = new cocuk();

        arif.boy= 175;
        arif.kilo= 60;
        arif.buyume();
        arif.spor();
        arif.yemek();

        System.out.println("Arif'in boyu: " + arif.boy);
        System.out.println("Arif'in kilosu: " + arif.kilo);

        can.boy=50;
        can.kilo=10;
        can.buyume();
        can.spor();
        can.yemek();

        System.out.println("Can'in boyu: " + can.boy);
        System.out.println("Can'in kilosu: " + can.kilo);


    }
}
