package com.example.recyclerview;

import java.util.ArrayList;

public class WisataData {
    private static String [] wisataName = {
            "Malioboro",
            "Taman Sari",
            "0 Km",
            "Warung Boto",
            "Candi Prambanan",
            "Candi Borobudur",
            "Waduk Sermo",
            "Studio Alam Gamplong",
            "Pantai Parangtritis",
            "Hutan Pinus Mangunan",
            "Kebun Buah Mangunan",
    };
    private static String [] wisataDesc = {
      "Jl. Maliobor, Kota Yogyakarta",
      "Patehan, Kraton, Yogyakarta City",
      "Jl. Pangurakan, Kota Yogyakarta",
      "Jl. Veteran, Kota Yogyakarta",
            "Jl. Raya Solo - Yogyakarta, Kabupaten Sleman",
            "Jl. Badrawati, Kw. Candi Borobudur, Borobudur, Kec. Borobudur, Magelang, Jawa Tengah",
            "Sremo Tengah, Hargowilis, Kokap, Kabupaten Kulon Progo, Daerah Istimewa Yogyakarta 55653",
            "Gamplong, Dukuh, Sumberrahayu, Kec. Moyudan, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55563",
            "Jl. Pantai Parangtritis, Pantai, Parangtritis, Kec. Kretek, Bantul, Daerah Istimewa Yogyakarta 55772",
            "Sukorame, Mangunan, Dlingo, Bantul, Daerah Istimewa Yogyakarta 66783",
            "Jl. Imogiri - Dlingo, Sukorame, Mangunan, Dlingo, Bantul, Daerah Istimewa Yogyakarta 55783"
    };
    private static int[] wisataImage = {
            R.drawable.malioboro,
            R.drawable.taman,
            R.drawable.km,
            R.drawable.warungboto,
            R.drawable.candi_prambanan,
            R.drawable.candi_borobudur,
            R.drawable.sermo,
            R.drawable.gamplong,
            R.drawable.pantai_parangtritis,
            R.drawable.hutan_pinus,
            R.drawable.kebun_buah
    };

    static ArrayList<TempatWisata> getListData(){
        ArrayList<TempatWisata> list = new ArrayList<>();
        for (int position =0; position<wisataName.length; position++){
            TempatWisata wisata = new TempatWisata();
            wisata.setName(wisataName[position]);
            wisata.setDesc(wisataDesc[position]);
            wisata.setPhoto(wisataImage[position]);
            list.add(wisata);
        }
        return list;
    }
}
