class aritmatika {
    public int penjumlahan(int a, int b)
    {
        return a + b;
    }
}

public class nonstatic {
    public static void main(String[] args) {
        int x = 5, y = 6;
        aritmatika object1 = new aritmatika();
        int s = object1.penjumlahan(x, y);
        System.out.println("Hasil Penjumlahan = " + s);
    }
}