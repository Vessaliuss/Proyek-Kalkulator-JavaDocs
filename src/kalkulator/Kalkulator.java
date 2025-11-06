package kalkulator;
/**
 *
 * @author Muhammad Naufal Hilman
 * @version 1.1
 */
public class Kalkulator {
    /*
     * Metode ini menjumlahkan dua bilangan bulat.
     * Nama variabel 'angkaPertama' dan 'angkaKedua' digunakan untuk kejelasan maksimal.
     *
     * @param angkaPertama  Bilangan bulat pertama yang akan dijumlahkan.
     * @param angkaKedua    Bilangan bulat kedua yang akan dijumlahkan.
     * @return              Hasil numerik dari 'angkaPertama' ditambah 'angkaKedua'.
     */
    public int tambah(int angkaPertama, int angkaKedua) {
        return angkaPertama + angkaKedua;
    }
    /*
     * Metode ini membagi dua bilangan bulat.
     * Menggunakan nama 'dividend' (yang dibagi) dan 'divisor' (pembagi)
     * yang merupakan terminologi standar.
     *
     * @param dividend  Bilangan yang akan dibagi (nilai total).
     * @param divisor   Bilangan pembagi (tidak boleh nol).
     * @return          Hasil bagi (integer) dari dividend oleh divisor.
     * @throws ArithmeticException jika 'divisor' (pembagi) adalah nol. 
     */
    public int bagi(int dividend, int divisor) {
        if (divisor == 0) {
            // Melempar exception jika terjadi pembagian oleh nol
            throw new ArithmeticException("Error: Pembagi tidak boleh nol!");
        }
        return dividend / divisor;
    }
    /*
     * Metode main untuk mendemonstrasikan fungsionalitas kelas Kalkulator.
     *
     * @param args
     */
    public static void main(String[] args) {

        Kalkulator kalkulatorSaya = new Kalkulator();
        System.out.println("Mulai demonstrasi Kalkulator...");
        
        
        int hasilPenjumlahan = kalkulatorSaya.tambah(10, 5);
        System.out.println("Hasil 10 + 5 = " + hasilPenjumlahan);

        try {
            // Kasus sukses
            int hasilPembagianNormal = kalkulatorSaya.bagi(10, 2);
            System.out.println("Hasil 10 / 2 = " + hasilPembagianNormal);
            
            // Kasus yang akan melempar exception
            System.out.println("Mencoba 10 / 0...");
            int hasilPembagianError = kalkulatorSaya.bagi(10, 0);
            System.out.println("Baris ini tidak akan tercetak."); // Tidak akan dieksekusi
            
        } catch (ArithmeticException e) {
            System.out.println("Terjadi error: " + e.getMessage());
        }
        
        System.out.println("Demonstrasi Kalkulator selesai.");
    }
}