import java.util.Scanner;

public class SearchNilai9 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan banyaknya elemen: ");
    int n = sc.nextInt();

    int[] nilai = new int[n];
    for (int i = 0; i < n; i++) {
    System.out.print("Nilai ke-" + (i + 1) + ": ");
    nilai[i] = sc.nextInt();
        }

    System.out.print("Masukkan nilai yang dicari: ");
    int key = sc.nextInt();

    boolean ditemukan = false;
    for (int i = 0; i < nilai.length; i++) {
    if (nilai[i] == key) {
    System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
    ditemukan = true;
    break;
        }
    }

    if (!ditemukan) {
    System.out.println("Nilai " + key + " tidak ditemukan dalam array.");
    System.out.println("Pencarian selesai tanpa hasil untuk nilai " + key + ".");
    }
    }

}
