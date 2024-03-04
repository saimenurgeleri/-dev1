
import java.util.HashMap;

        public class Main {

            public static void main(String[] args) {
                // Öğrenci derecelerini tutan HashMap
                HashMap<String, Integer> dereceler = new HashMap<>();
                dereceler.put("Kadir", 341);
                dereceler.put("Gökhan", 273);
                dereceler.put("Hakan", 278);
                dereceler.put("Suzan", 329);
                dereceler.put("Pinar", 445);
                dereceler.put("Mehmet", 402);
                dereceler.put("Ali", 388);
                dereceler.put("Emel", 270);
                dereceler.put("Firat", 243);
                dereceler.put("James", 334);
                dereceler.put("Jale", 412);
                dereceler.put("Ersin", 393);
                dereceler.put("Deniz", 299);
                dereceler.put("Gözde", 343);
                dereceler.put("Anil", 317);
                dereceler.put("Burak", 265);

                // İlk üç dereceyi alan öğrencileri bulup yazdırma
                String[] ilkUcDereceAlanlar = Maraton.ilkUcDereceyiAlanlar(dereceler);
                System.out.println("İlk Üç Dereceyi Alan Öğrenciler:");
                for (String ogrenci : ilkUcDereceAlanlar) {
                    System.out.println(ogrenci + " - " + dereceler.get(ogrenci) + " dakika");
                }

                // En iyi koşucuyu bulup yazdırma
                String[] enIyiKosucuBilgisi = Maraton.enIyiKosucuyuBul(dereceler);
                System.out.println("\nEn İyi Koşucu:");
                System.out.println(enIyiKosucuBilgisi[0] + " - " + enIyiKosucuBilgisi[1] + " dakika");

                // Sınıflandırmayı yapıp yazdırma
                HashMap<String, Integer> siniflandirma = Maraton.siniflandir(dereceler);
                System.out.println("\nSınıflandırma:");
                for (String sinif : siniflandirma.keySet()) {
                    System.out.println(sinif + " → " + siniflandirma.get(sinif));
                }
            }
        }





