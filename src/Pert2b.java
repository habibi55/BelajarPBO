import java.util.Scanner;

public class Pert2b {
    static Scanner OK = new Scanner(System.in);
    public static void main(String[] args) {
        int x,y;
        System.out.println("Masukkan Nilai x : ");
        x = OK.nextInt();
        System.out.println("Masukkan Nilai y : ");
        y = OK.nextInt();
        System.out.println("");
        if (x>y){
            System.out.println(x+ " Lebih besar dari : " +y);
        } else if (x<y){
            System.out.println(x + " Lebih kecil dari : " +y);
        }
        else {
            System.out.println(x+ " Sama dengan " + y);
        }

    }
}
