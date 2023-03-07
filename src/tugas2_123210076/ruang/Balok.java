
package tugas2_123210076.ruang;

import tugas2_123210076.bidang.PersegiPanjang;

public class Balok extends PersegiPanjang implements HitungRuang{
    private int tinggi;

    public Balok(int tinggi, int panjang, int lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungVolume(){
        return super.hitungLuas() * this.tinggi;
    }
    
    @Override
    public double hitungLuasPermukaan() {
        return 2 * (super.hitungLuas() + super.hitungKeliling() * this.tinggi);
    }
}
