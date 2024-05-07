package pertemuan10;

public class Main {
    public static void main(String[] args) {
        Dosen dosen = new Dosen("111", "Aceng", "Agama Islam");
        System.out.println(dosen.getNip() + " - " + dosen.getNama() + " - " + dosen.getJurusan());
    }
}