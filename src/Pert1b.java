import java.util.Scanner;

public class Pert1b {
    public static void main(String[] args) {
        Scanner terserah=new Scanner(System.in);

        double pi,r,luas;
        String nama;
        System.out.println("Masukkan nama anda : ");
        nama = terserah.nextLine();

        System.out.println("Masukkan pi : ");
        pi=terserah.nextDouble();
        System.out.println("Masukkan Jari-jari : ");
        r=terserah.nextDouble();

        System.out.println();
        System.out.println("Luas lingkaran : " + (pi*r*r));
    }
}
