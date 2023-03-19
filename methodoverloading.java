class aritmetika {
    static int penjumlahan (int a, int b)
    {
        return a + b;
    }

    static double penjumlahan(double a, double b)
    {
        return a + b;
    }
}

public class methodoverloading {
    public static void main(String[] args) {
        int hasil1 = aritmetika.penjumlahan(5, 6);
        double hasil2 = aritmetika.penjumlahan(5.5, 6.0);
        System.out.println("hasil penjumlahan int = " + hasil1);
        System.out.println("hasil Penjumlahan double = " + hasil2);
    }
}