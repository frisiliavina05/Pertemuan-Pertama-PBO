/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContohDua;

/**
 *
 * @author HP
 */
public class Salamander extends Amfibi{

    private String PolaWarna;
    private String WaktuAktif;
    
    /**
     * @return the PolaWarna
     */
    protected String getPolaWarna() {
        return PolaWarna;
    }

    /**
     * @param PolaWarna the PolaWarna to set
     */
    protected void setPolaWarna(String PolaWarna) {
        this.PolaWarna = PolaWarna;
    }

    /**
     * @return the WaktuAktif
     */
    protected String getWaktuAktif() {
        return WaktuAktif;
    }

    /**
     * @param WaktuAktif the WaktuAktif to set
     */
    protected void setWaktuAktif(String WaktuAktif) {
        this.WaktuAktif = WaktuAktif;
    }

  
    public static void main(String[] args) {
        Salamander api = new Salamander();
        api.setJumlahKaki(4);
        api.setJumlahMata(2);
        api.setHabitat("Air tawar dan daratan yang lembab");
        api.setCaraBernafas("Kombinasi paru-paru, kulit, dan mulut tergantung pada lingkungannya");
        api.setJenisKulit("Basah dan lembab");
        api.setCaraBerkembangbiak("Pembuahan internal dan bertelur");
        api.setPolaWarna("Hitam dengan bercak kuning");
        api.setWaktuAktif("Malam hari");
        
        System.out.println("Jumlah kaki salamander : " + api.getJumlahKaki());
        System.out.println("Jumlah mata salamander : " + api.getJumlahMata());
        System.out.println("Habitat salamander ada di : " + api.getHabitat());
        System.out.println("Cara bernafas salamander menggunakan : " + api.getCaraBernafas());
        System.out.println("Jenis kulit yang dimiliki salamander : " + api.getJenisKulit());
        System.out.println("Cara berkembang biak salamander dengan cara : " + api.getCaraBerkembangbiak());
        System.out.println("Pola warna kulit pada salamander : " + api.getPolaWarna());
        System.out.println("Waktu aktif salamander : " + api.getWaktuAktif());
    }
}
