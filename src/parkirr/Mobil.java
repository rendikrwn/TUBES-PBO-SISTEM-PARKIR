
package parkirr;

public class Mobil extends Kendaraan {
    int biayaParkirMobil = 5000;
   
    public Mobil(String platNomor, int biayaParkirMobil) {
        super(platNomor);
        this.biayaParkirMobil = biayaParkirMobil;
    }

    public void setBiayaParkirMobil(int biayaParkirMobil) {
        this.biayaParkirMobil = biayaParkirMobil;
    }
    
    public int getBiayaParkirMobil() {
        return biayaParkirMobil;
    }
    
    
    
}
