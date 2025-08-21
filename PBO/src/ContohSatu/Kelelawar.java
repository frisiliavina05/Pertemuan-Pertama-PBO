/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContohSatu;

/**
 *
 * @author HP
 */
public class Kelelawar extends Mamalia {

    private double KetinggianTerbang;
    private double PanjangSayap;

    /**
     * @return the KetinggianTerbang
     */
    protected double getKetinggianTerbang() {
        return KetinggianTerbang;
    }

    /**
     * @param KetinggianTerbang the KetinggianTerbang to set
     */
    protected void setKetinggianTerbang(double KetinggianTerbang) {
        this.KetinggianTerbang = KetinggianTerbang;
    }

    /**
     * @return the PanjangSayap
     */
    protected double getPanjangSayap() {
        return PanjangSayap;
    }

    /**
     * @param PanjangSayap the PanjangSayap to set
     */
    protected void setPanjangSayap(double PanjangSayap) {
        this.PanjangSayap = PanjangSayap;
    }

      public static void main(String[] args) {
        Kelelawar buah = new Kelelawar();
        buah.setJumlahKaki(4);
        buah.setJumlahMata(2);
        buah.setWarnaKulit("Hitam");
        buah.setHabitat("Gua");
        buah.setCaraBernafas("Paru-Paru");
        buah.setCaraBerkembangbiak("Melahirkan");
        buah.setSuhuTubuh("Endoterm");
        buah.setPanjangSayap(1.5);
        buah.setKetinggianTerbang(3.3);

        System.out.println("Jumlah Kaki Kelelawar : " + buah.getJumlahKaki());
        System.out.println("Jumlah Mata Kelelawar : " + buah.getJumlahMata());
        System.out.println("Warna Kulit Kelelawar : " + buah.getWarnaKulit());
        System.out.println("Habitat Kelelawar di : " + buah.getHabitat());
        System.out.println("Cara Bernafas Kelelawar menggunakan : " + buah.getCaraBernafas());
        System.out.println("Cara Berkembangbiak Kelelawar dengan cara :  " + buah.getCaraBerkembangbiak());
        System.out.println("Suhu Tubuh Kelelawar : " + buah.getSuhuTubuh());
        System.out.println("Panjang Sayap Kelelawar : " + buah.getPanjangSayap() + " m");
        System.out.println("Ketinggian Terbang Kelelawar : " + buah.getKetinggianTerbang() + " m");

    }

}

