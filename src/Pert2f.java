import java.util.Scanner;

public class Pert2f {
    public static void main(String[] args) {
        Scanner A=new Scanner(System.in);
        String ulang="y";

        while (ulang.equals("y")){
            System.out.println("");
            String ul="",lagi;

            System.out.println("----- MENU MENGHITUNG LUAS BANGUN ------");
            System.out.println("1. Luas Persegi Panjang ");
            System.out.println("2. Luas Lingkaran");
            System.out.println("3. Luas Segitiga");
            System.out.println("4. Keluar");
            System.out.println("--------------");
            System.out.println("Masukkan Pilihan [1-4] : ");
            int pil=A.nextInt();
            switch (pil) {
                case 1:
                    System.out.println("Masukkan Panjang : ");
                    int p = A.nextInt();
                    System.out.println("Masukkan Lebar :");
                    int l = A.nextInt();
                    int luas = p * l;
                    System.out.println("Luas Persegi Panjang : " + luas);
                    break;

                case 2:
                    System.out.println("Masukkan jari-jari(r) : ");
                    double r = A.nextDouble();
                    break;
                case 3:
                    System.out.println("Masukkan Alas : ");
                    float a = A.nextFloat();
                    System.out.println("Masukkan Alas : ");
                    float t = A.nextFloat();
                    float luassegitiga = (a*t)/2;
                    System.out.println("Luas Segitiga : " + luassegitiga);
                    break;
                case 4:
                    System.exit(4);
                    System.out.println("Masukkan pilihan [1-4]");
                    break;
            }
                    System.out.println("");
                    System.out.print("Apakah anda ingin mengulang[y/t] : ");
                    ulang=A.next();
            }
        }
    }

