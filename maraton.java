import java.util.HashMap;

    class Maraton {

        public static String[] ilkUcDereceyiAlanlar(HashMap<String, Integer> dereceler) {
            String[] siraliOgrenciler = new String[dereceler.size()];

            dereceler.keySet().toArray(siraliOgrenciler);

            // Derecelere göre sıralama (küçükten büyüğe)
            for (int i = 0; i < siraliOgrenciler.length - 1; i++) {
                for (int j = 0; j < siraliOgrenciler.length - i - 1; j++) {
                    if (dereceler.get(siraliOgrenciler[j]) > dereceler.get(siraliOgrenciler[j + 1])) {
                        // Swap işlemi
                        String temp = siraliOgrenciler[j];
                        siraliOgrenciler[j] = siraliOgrenciler[j + 1];
                        siraliOgrenciler[j + 1] = temp;
                    }
                }
            }

            // İlk üç öğrenciyi al
            String[] ilkUcDereceAlanlar = new String[3];
            for (int i = 0; i < 3; i++) {
                ilkUcDereceAlanlar[i] = siraliOgrenciler[i];
            }

            return ilkUcDereceAlanlar;
        }

        public static String[] enIyiKosucuyuBul(HashMap<String, Integer> dereceler) {
            String enIyiKosucu = "";
            int enIyiDerece = Integer.MAX_VALUE;

            for (String ogrenci : dereceler.keySet()) {
                if (dereceler.get(ogrenci) < enIyiDerece) {
                    enIyiDerece = dereceler.get(ogrenci);
                    enIyiKosucu = ogrenci;
                }
            }

            return new String[]{enIyiKosucu, String.valueOf(enIyiDerece)};
        }

        public static HashMap<String, Integer> siniflandir(HashMap<String, Integer> dereceler) {
            HashMap<String, Integer> siniflandirma = new HashMap<>();
            siniflandirma.put("A", 0);
            siniflandirma.put("B", 0);
            siniflandirma.put("C", 0);

            for (int derece : dereceler.values()) {
                if (derece >= 200 && derece <= 299) {
                    siniflandirma.put("A", siniflandirma.get("A") + 1);
                } else if (derece >= 300 && derece <= 399) {
                    siniflandirma.put("B", siniflandirma.get("B") + 1);
                } else if (derece >= 400) {
                    siniflandirma.put("C", siniflandirma.get("C") + 1);
                }
            }

            return siniflandirma;
        }
    }



