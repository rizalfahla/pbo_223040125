package pertemuan12;

public class Lingkaran extends bentuk {
    
    public Lingkaran(int jari2) {
        super(jari2);
    }

    /*
     * L: PHI*r*r
     */

    @Override
    public double luas() {
        return PHI*jari2*jari2;
    }
}