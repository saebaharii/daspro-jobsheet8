import java.util.Scanner;
public class tugas3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int jumlahToko;
        do {
            System.out.print("Masukkan jumlah toko (minimal 1): ");
            jumlahToko = sc.nextInt();
        } while (jumlahToko < 1);
            int totalBarangSemuaToko = 0;
            int tokoTerbanyak = 1;
            int barangTerbanyak = -1;
        for (int toko = 1; toko <= jumlahToko; toko++) {
            int jumlahPelanggan;
            do {
                System.out.print("Masukkan jumlah pelanggan Toko " + toko + ": ");
                jumlahPelanggan = sc.nextInt();
            } while (jumlahPelanggan < 0);

            int totalBarangToko = 0;
            for (int pelanggan = 1; pelanggan <= jumlahPelanggan; pelanggan++) {
                int jumlahBarang;
                do {
                    System.out.print("  Barang yang dibeli Pelanggan " + pelanggan + ": ");
                    jumlahBarang = sc.nextInt();
                } while (jumlahBarang < 0);

                totalBarangToko += jumlahBarang;
            }

            System.out.println("Toko " + toko + " - pelanggan: " + jumlahPelanggan
                    + ", total barang: " + totalBarangToko);

            totalBarangSemuaToko += totalBarangToko;
            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = toko;
            }
        }

        System.out.println("Total barang seluruh toko: " + totalBarangSemuaToko);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        sc.close();
    }
}
