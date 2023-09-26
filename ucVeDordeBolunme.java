import java.util.Scanner;

public class ucVeDordeBolunme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k;
        double toplam = 0;
        double adet = 0;

        System.out.print("Sayı Giriniz: ");
        k = input.nextInt();

        for(int i = 1 ; i <= k ; i++ ) {
              if (i % 3 == 0 || i % 4 ==0);{
                toplam +=i;
                adet++;
              }
        }


        if (adet>0) {
            double ortalama = (toplam / adet);
            System.out.println("3 e ve 4 e bölünen Sayıların ortalaması: "+ortalama);
        } else {
            System.out.println("Ortalama hesaplanamadı");
        }

    }
}
