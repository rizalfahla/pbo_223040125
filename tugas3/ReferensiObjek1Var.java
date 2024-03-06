package tugas3;

public class ReferensiObjek1Var {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = l1;

        System.out.println(l1.getJari2()); // Output: 5.0
        System.out.println(l2.getJari2()); // Output: 5.0

        l2.setJari2(10);

        System.out.println(l1.getJari2()); // Output: 10.0
        System.out.println(l2.getJari2()); // Output: 10.0
    }
}