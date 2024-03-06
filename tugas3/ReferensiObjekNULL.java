package tugas3;

public class ReferensiObjekNULL {
    public static void main(String[] args) {
    	Lingkaran l1 = new Lingkaran(5);
    	Lingkaran l2 = l1;
    	Lingkaran l3 = new Lingkaran(7);
    	System.out.println(l1.getJari2());
    	System.out.println(l2.getJari2());
    	System.out.println(l3.getJari2());
    	l1 = null;
    	l2 = null;
    	l3 = null;

    }
}


//GARBAGE COLLECTION
//		Lingkaran l1 = new Lingkaran(5);
//		Lingkaran l2 = l1;
//		Lingkaran l3 = new Lingkaran(7);
//		System.out.println(l1.getJari2());
//		System.out.println(l2.getJari2());
//		System.out.println(l3.getJari2());
//		l2 = null;
//		System.out.println(l1.getJari2());
//		if (l2 != null) System.out.println(l2.getJari2());
//		System.out.println(l3.getJari2());

