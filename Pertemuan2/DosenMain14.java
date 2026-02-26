public class DosenMain14 {
    public static void main(String[] args) {
        
        //Objek 1 menggunakan konstruktor default
        Dosen14 dsn1 = new Dosen14();
        dsn1.idDosen = "D112";
        dsn1.nama = "Dimas Anugrah";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2016;
        dsn1.bidangKeahlian = "Basis Data";

        dsn1.tampilInformasi();
        dsn1.setStatusAktif(false);
        System.out.println("Masa Kerja: " + dsn1.hitungMasaKerja(2026) + " tahun");
        dsn1.ubahKeahlian("Pemrograman");

        System.out.println();

        //Objek 2 menggunakan konstruktor parameter
        Dosen14 dsn2 = new Dosen14("D196", "Moch Dedy Triagwi", true, 2019, "Pemrograman");
        dsn2.tampilInformasi();
        dsn2.setStatusAktif(true);
        System.out.println("Masa Kerja: " + dsn2.hitungMasaKerja(2026) + " tahun");
        dsn2.ubahKeahlian("Sistem Operasi");
    }
}
