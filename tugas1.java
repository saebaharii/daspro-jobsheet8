import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        int totalAngkaTercetak = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
                totalAngkaTercetak++;
            }
            System.out.println();
        }
        System.out.println("Total angka tercetak: " + totalAngkaTercetak);
    }
}
