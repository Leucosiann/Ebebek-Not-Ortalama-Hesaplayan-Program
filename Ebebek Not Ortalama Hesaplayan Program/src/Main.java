import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik;

        Scanner scan= new Scanner(System.in);

        System.out.println("Not ortalaması hesaplama. \n Notlarını tam sayı olarak giriniz. ");

        System.out.println("Matematik Notunuz:");
        matematik = scan.nextInt();

        System.out.println("Fizik Notunuz:");
        fizik = scan.nextInt();

        System.out.println("Kimya Notunuz:");
        kimya = scan.nextInt();

        System.out.println("Türkçe Notunuz:");
        turkce = scan.nextInt();

        System.out.println("Tarih Notunuz:");
        tarih = scan.nextInt();

        System.out.println("Müzik Notunuz:");
        muzik = scan.nextInt();

        double ort;
        ort = (matematik + fizik+ kimya+ turkce+ tarih+ muzik)/6;

        System.out.println(ort);
        boolean kosul = ort >= 60;
        String sinif = kosul ? "Tebrikler ! \n Sınıfı Geçtiniz." : " Sınıfı Geçemediniz.";
        System.out.println(sinif);
    }
}