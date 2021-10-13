import java.util.Scanner;

public class Pert2d {
    public static void main(String[] args) {
        Scanner P = new Scanner(System.in);
        String nama;
        System.out.println("Masukkan Nama anda : ");
        nama = P.nextLine();
        System.out.println("Masukkan 1 Jika umur anda kurang dari 20 Tahun" + "\n"
                            + "Masukkan 2 Jika umur anda adalah 20 Tahun"+"\n"
                            + "Masukkan 3 Jika umur anda lebih dari 20 Tahun");
        int pilih = P.nextInt();
        switch (pilih){
            case 1:
                System.out.println(nama + " " + " memiliki umur kurang dari 20 Tahun");
                break;
            case 2:
                System.out.println(nama + " " + " memiliki umur 20 Tahun");
                break;
            case 3:
                System.out.println(nama + " " + " memiliki umur lebih dari 20 Tahun");
                break;
            default:
                System.out.println("Masukkan pilihan [1-3]");
        }

    }
}
