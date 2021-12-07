package com.example.tugasbaiti;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.example.tugasbaiti.model.Anjing;
import com.example.tugasbaiti.model.Hewan;
import com.example.tugasbaiti.model.Kucing;
import com.example.tugasbaiti.model.Angsa;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing("Angora", "Turki",
                "Aslinya berasal dari Ankara, Turki dengan ciri khas berbulu panjang dan lembut", R.drawable.cat_angora));
        kucings.add(new Kucing("Bengal", "Inggris",
                "Merupakan hasil persilangan antara Kucing Leopard Asia dengan kucing domestik Inggris", R.drawable.cat_bengal));
        kucings.add(new Kucing("Birmani", "Birma/Myanmar",
                "Konon awalnya merupakan ras kucing yand biasa menemani para biksu yang menetap pada kuil di Birma", R.drawable.cat_birman));
        kucings.add(new Kucing("Persia", "Iran",
                "Kucing berbulu panjang dengan wajah bundar dan hidung pesek. Awalnya berasal dari Iran kemudian diimpor ke Italia", R.drawable.cat_persia));
        kucings.add(new Kucing("Siam", "Thailand",
                "Kucing hasil turunan dari Wichian Maat (Kucing Thailand) dengan ciri khas berbadan panjang dan langsing, wajah lonjong, telinga lebar, dan mata kebiruan", R.drawable.cat_siam));
        kucings.add(new Kucing("Siberia", "Rusia",
                "Kucing domestik Rusia dengan bulu lebat dan badan besar tapi sangat lincah dan terkenal dengan kemampuan melompatnya ", R.drawable.cat_siberian));
        return kucings;
    }

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing("Bulldog", "Inggris",
                "Anjing populer yang dikenal dengan badan yang gemuk berotot, wajah seperti kain kusut, dan hidung yang pesek", R.drawable.dog_bulldog));
        anjings.add(new Anjing("Husky", "Alaska,Siberia,Finlandia (daerah bersalju) ",
                "Anjing jenis khusus yang awalnya digunakan untuk menarik kereta salju", R.drawable.dog_husky));
        anjings.add(new Anjing("Kintamani", "Indonesia",
                "Ras anjing asli pulau Bali ", R.drawable.dog_kintamani));
        anjings.add(new Anjing("Samoyed", "Rusia",
                "Anjing yang berasal dari Siberia yang awalnya biasa digunakan untuk menjaga ternak oleh suku Samoyed", R.drawable.dog_samoyed));
        anjings.add(new Anjing("Shepherd", "Jerman",
                "Anjing pintar dan kuat, sekarang banyak digunakan sebagai anjing penjaga, pengawal, dan anjing polisi (K9)", R.drawable.dog_shepherd));
        anjings.add(new Anjing("Shiba", "Jepang",
                "Anjing dari daerah Shiba ini gesit dan lincah sehingga awalnya banyak digunakan untuk berburu ", R.drawable.dog_shiba));
        return anjings;
    }
    private static List<Angsa> initDataAngsa(Context ctx) {
        List<Angsa> angsas = new ArrayList<>();
        angsas.add(new Angsa("cygnus", "Brasil dan Venezuela",
                "Cygnus Olor adalah angsa putih yang tersebar di seluruh belahan dunia.", R.drawable.angsacygnus));
        angsas.add(new Angsa("Hitam", "Meksiko, Panama, Ekuador, Kosta Rika",
                "Angsa hitam memiliki postur tubuh yang bagus, keunikan yang dimiliki angsa hitam tidak dimiliki angsa lain merupakan ciri khas dari angsa ini sendiri.", R.drawable.angsaleherhitam));
        angsas.add(new Angsa("Peteriak", "Meksiko dan Ekuador",
                "Jenis angsa ini memiliki ciri khusus yaitu dengan suaranya yang sangat keras dan kuat seperti seseorang sedang berteriak. ", R.drawable.anngsaterompet));
        angsas.add(new Angsa("Leher Hitam", "mencakup di seluruh dunia.",
                "Angsa ini memiliki warna hitam yang terdapat pada lehernya. Sementara, bulu pada tubuhnya tetap berwarna sama dengan angsa lainnya yaitu putih bersih.", R.drawable.angsaleherhitam));
        angsas.add(new Angsa("Terompet", "Amerika Serikat dan Ontario",
                "Angsa terompet memiliki suara seperti terompet.", R.drawable.anngsaterompet));
        angsas.add(new Angsa("Whooper", "hutan Papua",
                "Angsa Whooper merupakan angsa yang memiliki bobot lebih besar dari pada angsa lain, bobot angsa ini dapat mencapai 50 pon.", R.drawable.angsawooper));
        return angsas ;
    }


    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataAngsa(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
