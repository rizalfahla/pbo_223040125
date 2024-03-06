package Tugas2;

import java.util.Scanner;

class PersegiPanjang {
    private double panjang;
    private double lebar;

    // Konstruktor
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Method untuk menghitung luas
    public double hitungLuas() {
        return panjang * lebar;
    }

    // Method untuk menghitung keliling
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Panjang: ");
        double panjang = scanner.nextDouble();

        System.out.print("Lebar: ");
        double lebar = scanner.nextDouble();

        PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);

        System.out.println("Luas: " + persegiPanjang.hitungLuas());
        System.out.println("Keliling: " + persegiPanjang.hitungKeliling());

        scanner.close();
    }
}
