
package parkirr;


public class Motor extends Kendaraan {
    int biayaParkirMotor = 3000;
   
    public Motor(String platNomor, int biayaParkirMotor) {
        super(platNomor);
        this.biayaParkirMotor = biayaParkirMotor;
    }

    public void setBiayaParkirMotor(int biayaParkirMotor) {
        this.biayaParkirMotor = biayaParkirMotor;
    }
    
    public int getBiayaParkirMotor() {
        return biayaParkirMotor;
    }
    
   
    
    
    
}
