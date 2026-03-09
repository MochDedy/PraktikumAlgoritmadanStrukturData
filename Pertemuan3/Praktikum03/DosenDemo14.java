import java.util.Scanner;

public class DosenDemo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = sc.nextInt();
        sc.nextLine();

        Dosen14[] arrayDosen14 = new Dosen14[jumlahDosen];
        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.print("Kode            : ");
            String kode = sc.nextLine();
            System.out.print("Nama            : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin   : ");
            boolean jenisKelamin = sc.nextLine().equalsIgnoreCase("Pria");
            System.out.print("Usia            : ");
            int usia = sc.nextInt();
            System.out.println("-------------------------");
            sc.nextLine();
            arrayDosen14[i] = new Dosen14(kode, nama, jenisKelamin, usia);
        }

        int no = 1;
        for (Dosen14 d : arrayDosen14) {
            System.out.println("Data Dosen ke-" + no);
            d.tampilData();
            System.out.println();
            no++;
        }

        DataDosen14.jumlahDosenPerJenisKelamin(arrayDosen14);
        DataDosen14.rataRataUsiaDosen(arrayDosen14);
        DataDosen14.infoDosenPalingTua(arrayDosen14);
        DataDosen14.infoDosenPalingMuda(arrayDosen14);
    }
}