class aritmatika {
    public static int penjumlahan(int a, int b)
    {
        return a + b;
    }
}

public class staticmethod {
    public static void main(String[] args) {
        int x = 5, y = 6;
        int s = aritmatika.penjumlahan(x, y);
        System.out.println("hasil penjumlahan = " + s);
    }
}