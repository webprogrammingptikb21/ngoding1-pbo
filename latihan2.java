public class latihan2 {
    public static void main(String[] args) {
      int kecepatan = 100; // contoh nilai kecepatan
  
      if (kecepatan > 120) {
        System.out.println("Kendaraan sangat cepat");
      } else if (kecepatan >= 100) {
        System.out.println("Kendaraan cepat");
      } else if (kecepatan > 80) {
        System.out.println("Kendaraan sedang ");
      } else if (kecepatan > 40) {
        System.out.println("Kendaraan lambat");
      } else {
        System.out.println("Kendaraan  sangat lambat");
      }
    }
  }
//   Program ini menginisialisasi nilai kecepatan secara langsung dengan 60 sebagai contoh.

// Kita menggunakan struktur percabangan if-else untuk menentukan kategori kecepatan kendaraan. Kategori kecepatan ditentukan berdasarkan nilai kecepatan yang telah diinisialisasi.

// Jika kecepatan kendaraan lebih besar dari 120 km/jam, maka kita mencetak pesan "Kendaraan sangat cepat". Jika kecepatan kendaraan lebih besar dari 100 km/jam tetapi tidak lebih besar dari 120 km/jam, maka kita mencetak pesan "Kendaraan cepat", dan seterusnya.

// program ini mencetak kategori kecepatan kendaraan sesuai dengan nilai yang telah diinisialisasi. kalo kita ingin menggunakan nilai kecepatan yang berbeda, cukup di ubah nilai pada baris yang menyatakan inisialisasi variabel "kecepatan".
  