package pertemuan12;

public class MainWajah {
    public static void main(String[] args) {
        SistemOtentikasi auth = new SistemOtentikasi("biru");
        System.out.println("Verifikasi Wajah: " + auth.verifikasiWajah("biru")); // Output: true
        System.out.println("Verifikasi Wajah: " + auth.verifikasiWajah("hijau")); // Output: false
    }
}
