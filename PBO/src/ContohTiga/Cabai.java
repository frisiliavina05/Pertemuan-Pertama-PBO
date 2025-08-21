/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContohTiga;

/**
 *
 * @author HP
 */
public class Cabai extends Dikotil {
    
    private String Warna;
    private String TingkatKepedasan;
    private String Ukuran;
    private int MasaPanen;

    /**
     * @return the Warna
     */
    protected String getWarna() {
        return Warna;
    }

    /**
     * @param Warna the Warna to set
     */
    protected void setWarna(String Warna) {
        this.Warna = Warna;
    }

    /**
     * @return the TingkatKepedasan
     */
    protected String getTingkatKepedasan() {
        return TingkatKepedasan;
    }

    /**
     * @param TingkatKepedasan the TingkatKepedasan to set
     */
    protected void setTingkatKepedasan(String TingkatKepedasan) {
        this.TingkatKepedasan = TingkatKepedasan;
    }

    /**
     * @return the Ukuran
     */
    protected String getUkuran() {
        return Ukuran;
    }

    /**
     * @param Ukuran the Ukuran to set
     */
    protected void setUkuran(String Ukuran) {
        this.Ukuran = Ukuran;
    }

    /**
     * @return the MasaPanen
     */
    protected int getMasaPanen() {
        return MasaPanen;
    }

    /**
     * @param MasaPanen the MasaPanen to set
     */
    protected void setMasaPanen(int MasaPanen) {
        this.MasaPanen = MasaPanen;
    }
    
    public static void main(String[] args) {
        Cabai rawit = new Cabai();
        rawit.setJenisAkar("Tunggang");
        rawit.setJenisBatang("Berkayu");
        rawit.setJenisDaun("Menyirip");
        rawit.setJumlahKotiledon(2);
        rawit.setJumlahKelopakBunga(5);
        rawit.setWarna("Merah");
        rawit.setTingkatKepedasan("Sedang");
        rawit.setUkuran("Kecil");
        rawit.setMasaPanen(80);
        
        System.out.println("Jenis Akar Cabai : " + rawit.getJenisAkar());
        System.out.println("Jenis Batang Cabai : " + rawit.getJenisBatang());
        System.out.println("Jenis Daun Cabai : " + rawit.getJenisDaun());
        System.out.println("Jumlah Kotiledon pada Cabai : " + rawit.getJumlahKotiledon());
        System.out.println("Jumlah Kelopak Bunga pada Cabai : " + rawit.getJumlahKelopakBunga());
        System.out.println("Warna Cabai : " + rawit.getWarna());
        System.out.println("Tingkat Kepedasan Cabai ini : " + rawit.getTingkatKepedasan());
        System.out.println("Ukuran Cabai ini : " + rawit.getUkuran());
        System.out.println("Masa Panen pada Cabai : " + rawit.getMasaPanen() + " hari");
    }
}
