/*
 * Ad Soyad: [Meryem Melek Simsek]
 * Ogrenci No: [250541017]
 * Tarih: [29.10.2025]
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        // Scanner objesi olusturun
        
        
        // Degisken tanimlamalari
        // String ad, soyad;
        // int ogrenciNo, yas;
        // double gpa;
        
        
        // Kullanicidan bilgileri alin
        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.println();
        
        // Ad
        
        
        // Soyad
        
        
        // Ogrenci No
        
        
        // Yas
        
        
        // GPA
        
        
        // Bilgileri ekrana yazdirin
        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
        
        // COZUMUNUZU BURAYA YAZIN
        import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== OGRENCI BILGI SISTEMI ===");

        // Kullanıcıdan bilgiler alınıyor
        System.out.print("Ad: ");
        String ad = input.nextLine();

        System.out.print("Soyad: ");
        String soyad = input.nextLine();

        System.out.print("Ogrenci No: ");
        int ogrenciNo = input.nextInt();

        System.out.print("Yas: ");
        int yas = input.nextInt();

        System.out.print("Genel Not Ortalamasi (0.00 - 4.00): ");
        double gpa = input.nextDouble();

        // Durum belirleme
        String durum;
        if (gpa >= 3.0) {
            durum = "Basarili Ogrenci";
        } else if (gpa >= 2.0) {
            durum = "Idare Eder Ogrenci";
        } else {
            durum = "Basarisiz Ogrenci";
        }

        // Bilgiler düzenli şekilde yazdırılıyor
        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
        System.out.printf("Ad Soyad: %s %s%n", ad, soyad);
        System.out.printf("Ogrenci No: %d%n", ogrenciNo);
        System.out.printf("Yas: %d%n", yas);
        System.out.printf("GPA: %.2f%n", gpa);
        System.out.printf("Durum: %s%n", durum);

        input.close();
    }
}

        
        
        
        
        

        
        
        // Scanner'i kapatin (önemli pratik)
        
    }
}
