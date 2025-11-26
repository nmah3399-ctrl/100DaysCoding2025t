import java.util.Scanner;

public class Day80 {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("masukkan jumlah: ");
        int jumlah = n.nextInt();
        
        int[] angka = new int[jumlah];
        for (int i = 0; i < angka.length; i++) {
            angka[i] = n.nextInt();
        }   
        System.out.println("Isi array:");
        for (int i = 0; i < angka.length; i++) {
            System.out.println("angka[" + i + "] ="+ angka[i]);
        }         
    }
    
}
