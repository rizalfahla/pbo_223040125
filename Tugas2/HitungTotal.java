package Tugas2;

import java.util.Scanner;

public class HitungTotal {
    public static void main(String[] args) {
        hitungTotal();
    }

    public static void hitungTotal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("N tidak boleh nol atau minus");
            return;
        }

        System.out.print("Masukkan bilangan : ");
        int[] bilangan = new int[N];
        for (int i = 0; i < N; i++) {
            bilangan[i] = scanner.nextInt();
        }

        int total = 0;
        for (int i = 0; i < N; i++) {
            total += bilangan[i];
        }
        System.out.println("Total = " + total);
    }
}

