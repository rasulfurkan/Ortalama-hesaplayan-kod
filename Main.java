import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
   // Değişkenleri oluştur
        int  matematik,fizik,kimya,muzik,turkce;

        // Scanner sınıfınızı tanımladık

        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan değerleri al

        System.out.print("Matematik Notunuz : ");

        matematik= inp.nextInt();

        System.out.print("Fizik Notunuz : ");

        fizik= inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya= inp.nextInt();

        System.out.print("Muzik Notunuz : ");
        muzik= inp.nextInt();

        System.out.print("Turkce Notunuz : ");
        turkce= inp.nextInt();

        int toplam = (matematik+fizik+kimya+muzik+turkce);
        double sonuc = toplam / 5.0;
        boolean gecti = sonuc > 60;
        String gect= gecti ? "Gecti": "Gecmez";



        System.out.println("Ortalamanız"+sonuc+ gect);




    }
}