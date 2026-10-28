import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n (minimal 3): ");
        int n = sc.nextInt();
        if (n < 3) {
            System.out.println("Nilai n harus minimal 3.");
            sc.close();
            return;
        }
        int lebar = String.valueOf((long) n * n).length();
        long total = 0;
        for (int baris = 1; baris <= n; baris++) {
            for (int kolom = 1; kolom <= n; kolom++) {
                long hasil = (long) baris * kolom;
                System.out.printf("%" + lebar + "d ", hasil);
                total += hasil;
            }
            System.out.println();
        }
        System.out.println("Jumlah seluruh angka pada tabel: " + total);
        sc.close();
    }
}
