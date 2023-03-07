
package tugas2_123210076.ruang;

import tugas2_123210076.bidang.Lingkaran;

public class Tabung extends Lingkaran implements HitungRuang{
    private double tinggi;

    public Tabung(double tinggi, double jariJari) {
        super(jariJari);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    public double getJariJari() {
        return jariJari;
    }
    
    @Override
    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
    
    @Override
    public double hitungVolume(){
        return super.hitungLuas() * this.tinggi;
    }
    
    @Override
    public double hitungLuasPermukaan(){
        return 2 * super.hitungLuas() + super.hitungKeliling() * this.tinggi;
    }
}
