import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz: ");
        int mesafe =inp.nextInt();
        double yas_indirimi,indirimli_tutar,gidis_donus_indirimi,toplam_tutar;

        if (mesafe<=0){
            System.out.println("Hatali Veri Girdiniz !");
            System.out.print("Mesafeyi KM cinsinden giriniz: ");
            mesafe =inp.nextInt();
        }

        System.out.print("Yasinizi giriniz: ");
        int yas =inp.nextInt();

        if (yas<=0){
            System.out.println("Hatalı Veri Girdiniz !");
            System.out.print("Yasinizi giriniz: ");
            yas =inp.nextInt();
        }

        System.out.print("Yolculuk Tipini giriniz (1 => Tek Yon , 2 => Gidis Donus ): ");
        int yolculuk_tipi =inp.nextInt();

        if (yolculuk_tipi!=1 && yolculuk_tipi!=2){
            System.out.println("Hatalı Veri Girdiniz !");
            System.out.print("Yolculuk Tipini giriniz : ");
            yolculuk_tipi =inp.nextInt();
        }

        double normal_tutar = mesafe * 0.10;

        if (yas<12){
            yas_indirimi = normal_tutar*0.50;
            indirimli_tutar = normal_tutar-yas_indirimi;
        } else if (yas>=12 && yas<=24){
            yas_indirimi = normal_tutar*0.10;
            indirimli_tutar = normal_tutar-yas_indirimi;
        } else if (yas>65){
            yas_indirimi = normal_tutar*0.30;
            indirimli_tutar = normal_tutar-yas_indirimi;
        } else {
            indirimli_tutar = normal_tutar;
        }

        if (yolculuk_tipi==2){
            gidis_donus_indirimi = indirimli_tutar*0.20;
            toplam_tutar = (indirimli_tutar-gidis_donus_indirimi)*2;
        }
        else{
            toplam_tutar=indirimli_tutar;
        }
        System.out.println("Toplam Tutar : " + toplam_tutar);
    }
}