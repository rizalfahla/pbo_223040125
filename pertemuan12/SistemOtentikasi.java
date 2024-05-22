package pertemuan12;

public class SistemOtentikasi implements Otentikasi {
    private String mata;

    public SistemOtentikasi(String mata) {
        this.mata = mata;
    }

    @Override
    public boolean verifikasiWajah(String mataInput) {
        return mata.equals(mataInput);
    }
}
