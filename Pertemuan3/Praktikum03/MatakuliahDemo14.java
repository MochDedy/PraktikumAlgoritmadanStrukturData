import java.util.Scanner;
public class MatakuliahDemo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlah = Integer.parseInt(sc.nextLine());
        Matakuliah14[] arrayOfMatakuliah = new Matakuliah14[jumlah];


        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Masukkan data mata kuliah ke-" + (i+1));
            arrayOfMatakuliah[i] = new Matakuliah14();
            arrayOfMatakuliah[i].tambahData(sc);
        }
        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Data Mata Kuliah Ke-" + (i+1));
            arrayOfMatakuliah[i].cetakInfo();
            System.out.println("---------------------------------");
        }
    }
}