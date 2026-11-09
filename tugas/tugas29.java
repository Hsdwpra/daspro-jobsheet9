import java.util.Scanner;

public class tugas29 {
    public static void main(String[] args) {
    String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
    int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};
    Scanner sc = new Scanner(System.in);

    System.out.println("===== DAFTAR MENU KAFE KAMPUS =====");
    for (int i = 0; i < menu.length; i++) {
    System.out.println((i + 1) + ". " + menu[i] + " - Rp" + harga[i]);
    }
    System.out.println();

    System.out.print("Mau cari menu? (nama menu): ");
    String cari = sc.nextLine();
    int idxCari = -1;
    for (int i = 0; i < menu.length; i++) {
    if (menu[i].equalsIgnoreCase(cari)) {
    idxCari = i;
    break;
    }
    }
    if (idxCari != -1) {
    System.out.println(menu[idxCari] + " tersedia, harga Rp" + harga[idxCari]);
    } else {
    System.out.println("Menu " + cari + " tidak tersedia.");
    }
    System.out.println();

    System.out.print("Masukkan jumlah item yang dipesan: ");
    int jumlah = sc.nextInt();
    sc.nextLine();

    String[] pesanan = new String[jumlah];
    int[] hargaPesanan = new int[jumlah];
    int total = 0;

    for (int i = 0; i < jumlah; i++) {
    int idx = -1;
    while (idx == -1) {
    System.out.print("Menu pesanan ke-" + (i + 1) + ": ");
    String pilih = sc.nextLine();
    for (int j = 0; j < menu.length; j++) {
    if (menu[j].equalsIgnoreCase(pilih)) {
    idx = j;
    break;
    }
    }
    if (idx == -1) {
    System.out.println("Menu tidak tersedia, pilih lagi!");
    }
    }
    pesanan[i] = menu[idx];
    hargaPesanan[i] = harga[idx];
    total += harga[idx];
    }

    System.out.println();
    System.out.println("========= STRUK PESANAN =========");
    for (int i = 0; i < jumlah; i++) {
    System.out.printf("%-2d %-16s Rp%,8d%n", (i + 1), pesanan[i], hargaPesanan[i]);
    }
    System.out.println("---------------------------------");
    System.out.printf("%-19s Rp%,8d%n", "TOTAL", total);
    System.out.println("=================================");
    }

}
