package pertemuan10;

public class InheritanceMain {
	  public static void main(String[] args) {
	    Mahasiswa mhs = new Mahasiswa("223040125","RizalFahla", "Cimahi");
        System.out.println(mhs.getNrp() + "-" + mhs.getNama() + "-" + mhs.getAlamat());
	  }
}