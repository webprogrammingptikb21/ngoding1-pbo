import java.util.Scanner;

public class latihan1 {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    double total = 0;

    for (int i = 1; i <= 10; i++) {
      System.out.print("Masukkan bilangan ke-" + i + ": ");
      double bilangan = input.nextDouble();
      total += bilangan;
    }

    double rataRata = total / 10;
    System.out.println("Rata-rata dari 10 bilangan adalah " + rataRata);
  }
}

// Pertama-tama itu, kita mengimpor kelas Scanner untuk membaca masukan dari pengguna.

// Kemudian kita membuat objek Scanner baru dengan memanggil konstruktor kelas Scanner dan melewatkan objek Sistem.in sebagai argumennya. Ini menghasilkan objek input yang dapat kita gunakan untuk membaca masukan dari pengguna.

// Selanjutnya, kita mendeklarasikan variabel total dan menginisialisasinya dengan 0. Variabel ini akan digunakan untuk menyimpan total dari semua bilangan yang dimasukkan oleh pengguna.

// Kita menggunakan loop for untuk meminta pengguna memasukkan 10 bilangan. Di setiap iterasi, kita mencetak pesan "Masukkan bilangan ke-n:" dan membaca bilangan dari pengguna dengan memanggil metode nextDouble() pada objek input.

// Setiap bilangan yang dimasukkan oleh pengguna ditambahkan ke variabel total menggunakan operator +=.

// Setelah loop selesai, kita menghitung rata-rata dengan membagi total dengan 10.

// Terakhir, kita mencetak pesan "Rata-rata dari 10 bilangan adalah " dan nilai rata-rata.
