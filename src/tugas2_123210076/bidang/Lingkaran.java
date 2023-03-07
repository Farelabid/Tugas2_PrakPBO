package tugas2_123210076.bidang;

public class Lingkaran implements HitungBidang {
    public double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
    
    @Override
    public double hitungLuas(){
        return Math.PI * this.jariJari * this.jariJari;
    }
    
    @Override
    public double hitungKeliling(){
        return 2 * Math.PI * jariJari;
    }
}
