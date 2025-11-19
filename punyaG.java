import java.util.Scanner;

public class punyaG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] jumlahPelanggan = new int[5];
        System.out.println("Masukkan jumlah pelanggan untuk 5 cabang:");
        
        for (int i = 0; i < jumlahPelanggan.length; i++) {
            System.out.print("Cabang " + (i + 1) + ": ");
            jumlahPelanggan[i] = sc.nextInt();
        }

        System.out.println();
        sc.close();
    }

}
