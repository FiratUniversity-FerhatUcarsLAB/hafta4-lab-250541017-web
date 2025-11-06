/*
 * Ad Soyad: Meryem Melek Şimşek
 * Ogrenci No: 250541017
 * Tarih: 6 Kasım 2025
 * Aciklama: Görev 3 - Maaş Hesaplama Sistemi
 */

import java.util.Scanner;

public class MaasHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;

        System.out.println("=== MAAS HESAPLAMA SISTEMI ===");
        System.out.print("Calisan ad soyad: ");
        String adSoyad = input.nextLine();

        System.out.print("Aylik brut maas (TL): ");
        double brutMaas = input.nextDouble();

        System.out.print("Haftalik calisma saati: ");
        int haftalikSaat = input.nextInt();

        System.out.print("Mesai saati: ");
        int mesaiSaat = input.nextInt();

        double mesaiUcreti = (brutMaas / 160) * mesaiSaat * 1.5;
        double toplamGelir = brutMaas + mesaiUcreti;

        double sgk = toplamGelir * SGK_ORANI;
        double gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;
        double damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;
        double toplamKesinti = sgk + gelirVergisi + damgaVergisi;

        double netMaas = toplamGelir - toplamKesinti;

        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        double saatlikNet = netMaas / 176.0;
        double gunlukNet = netMaas / 22.0;

        System.out.println("\nMAAS BORDROSU");
        System.out.println("--------------");
        System.out.printf("Calisan: %s%n", adSoyad);
        System.out.printf("Brut Maas: %.2f TL%n", brutMaas);
        System.out.printf("Mesai Ucreti (%d saat): %.2f TL%n", mesaiSaat, mesaiUcreti);
        System.out.printf("Toplam Gelir: %.2f TL%n", toplamGelir);
        System.out.printf("Toplam Kesinti: %.2f TL%n", toplamKesinti);
        System.out.printf("Net Maas: %.2f TL%n", netMaas);
        System.out.printf("Kesinti Orani: %.1f%%%n", kesintiOrani);
        System.out.printf("Saatlik Net Kazanc: %.2f TL%n", saatlikNet);
        System.out.printf("Gunluk Net Kazanc: %.2f TL%n", gunlukNet);

        input.close();
    }
}

