package pertemuan7;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TranskripNilai {
	
	private Date tglCetak;
    private double ipk = 0.0;
    private List<KartuHasilStudi> kartuHasilStudi;
    private Mahasiswa mahasiswa;
    
    
    
    public TranskripNilai(Mahasiswa mahasiswa){
        super();
        this.mahasiswa = mahasiswa;
        
        kartuHasilStudi = new ArrayList<KartuHasilStudi>();
        tglCetak = new Date();
        
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
    
    public void hitungIPK(){
        double totalNilaiSKS = 0.0;
        int totalSKS = 0;

        for(KartuHasilStudi khs : kartuHasilStudi){
            khs.hitungIPS();
            totalNilaiSKS += khs.getIps() * khs.getTotalSKS();
            totalSKS += khs.getTotalSKS();
        }
        if (totalSKS != 0) {
            ipk = totalNilaiSKS / totalSKS;
        } else {
            ipk = 0; 
        }
    }

    
    public void addKHS(KartuHasilStudi khs){
     kartuHasilStudi.add(khs);
    }
    
    public void display(){
        System.out.println(mahasiswa.display());
        System.out.println("Tanggal Cetak: " + tglCetak.toString());
        System.out.println("IPK:" + ipk );
        for(KartuHasilStudi khs : kartuHasilStudi){
            System.out.println(khs.display());
        }
        
    }

}
