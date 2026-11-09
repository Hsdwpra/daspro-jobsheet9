import java.util.Scanner;

public class tugas19 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan banyaknya nilai mahasiswa: ");
    int n = sc.nextInt();

    int[] nilai = new int[n];
    int total = 0;

    for (int i = 0; i < n; i++) {
    System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
    nilai[i] = sc.nextInt();
    total += nilai[i];
        }

    double rata2 = (double) total / n;

    int tertinggi = nilai[0];
    int terendah = nilai[0];
    for (int i = 1; i < n; i++) {
    if (nilai[i] > tertinggi) tertinggi = nilai[i];
    if (nilai[i] < terendah) terendah = nilai[i];
    }

    System.out.println();
    System.out.println("Rata-rata: " + rata2);
    System.out.println("Nilai tertinggi: " + tertinggi);
    System.out.println("Nilai terendah: " + terendah);
    System.out.println();
    for (int i = 0; i < n; i++) {
    String status = (nilai[i] > 70) ? "LULUS" : "TIDAK LULUS";
    System.out.println("Nilai " + nilai[i] + " (" + status + ")");
    }
    }

}
