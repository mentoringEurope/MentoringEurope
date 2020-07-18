import javax.print.DocFlavor;

public class aaaa {

            public static void main(String[] args) {
                //EvenOddNums isminde bir method oluşturun.
                //Bu yöntem String olan bir parametreyi kabul etsin.
                //Bu String'de 1234567890 gibi 10 haneli sayılar olacak.
                //Sayıların her basamağını alın ve basamak çiftse toplayın, tekse çıkartın.
                //toplam sonucu yazdırın.
                //İpucu:Sayılar işlemleri yapabilmeniz için, basamakları tam sayıya dönüştürmeniz gerekiyor.
                //For example Örnek:
                //String =  "6678421312"
                //6+6-7+8+4+2-1-3-1+2
                //sonuç 16 olmal

                System.out.println(EvenOddNums("1234567890"));

            }
            public static int EvenOddNums(String text)
            {
                String[] dizi=text.split("");
                int toplam=0;
                int toplam2=0;
                int sonuc=0;
                int[] num = new int[dizi.length];
                for (int i = 0; i <dizi.length ; i++) {


                    num[i] = Integer.parseInt(dizi[i]);
                    if(num[i]%2==0){
                        toplam+=num[i];
                    }else if(num[i]%2==1){
                        toplam2+=num[i];
                    }
                    sonuc=toplam-toplam2;
                }
                return sonuc;
            }
        }

