public class DataDosen14 {
    public static void dataSemuaDosen(Dosen14[] arrayofDosen14) {
        int no = 1;
        for (Dosen14 d : arrayofDosen14) {
            System.out.println("Data Dosen ke-" + no);
            d.tampilData();
            System.out.println();
            no++;
        }

    }

    public static void jumlahDosenPerJenisKelamin(Dosen14[] arrayOfDosen) {
        int jumlahPria = 0;
        int jumlahWanita = 0;

        for (Dosen14 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                jumlahPria++;
            } else {
                jumlahWanita++;
            }
        }

        System.out.println("Jumlah Dosen Pria   : " + jumlahPria);
        System.out.println("Jumlah Dosen Wanita : " + jumlahWanita);

    }

    public static void rataRataUsiaDosen(Dosen14[] arrayOfDosen) {
        int totalUsia = 0;
        for (Dosen14 d : arrayOfDosen) {
            totalUsia += d.usia;
        }
        double rataRataUsia = (double) totalUsia / arrayOfDosen.length;
        System.out.println("Rata-rata Usia Dosen: " + rataRataUsia);
    }

    public static void infoDosenPalingTua(Dosen14[] arrayOfDosen) {
        Dosen14 palingTua = arrayOfDosen[0];
        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia > palingTua.usia) {
                palingTua = arrayOfDosen[i];
            }
        }
        System.out.println("Dosen paling tua : ");
        palingTua.tampilData();
    }

    public static void infoDosenPalingMuda(Dosen14[] arrayOfDosen) {
        Dosen14 palingMuda = arrayOfDosen[0];
        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia < palingMuda.usia) {
                palingMuda = arrayOfDosen[i];
            }
        }
        System.out.println("Dosen paling muda : ");
        palingMuda.tampilData();
    }

}
