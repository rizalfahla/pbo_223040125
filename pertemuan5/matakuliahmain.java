package pertemuan5;

public class matakuliahmain {
	public static void main(String[] args)
    {
        matakuliah mk1 = new matakuliah("001","Algoritma Pemograman 1", "A", 3);
        matakuliah mk2 = new matakuliah("002","Algoritma Pemograman 2", "BC", 3);
        matakuliah mk3 = new matakuliah("003","Pemograman Berorientasi Objek", "B", 3);

        System.out.println("--- DAFTAR matakuliah ---");
        System.out.println(mk1.display());
        System.out.println(mk2.display());
        System.out.println(mk3.display());

        System.out.println("--- NILAI IPK ---");
        // Bagaimana Rumus IPK ?
        // Rumus: (index nilai*sks) + (index nilai*sks) +..+ (index nilai*sks)/total_sks
    }
}
