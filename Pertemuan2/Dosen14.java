
public class Dosen14 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    //Konstruktor default
    public Dosen14(){

    }

    //Konstruktor berparameter
    public Dosen14(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian){
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilInformasi(){
        System.out.println("ID Dosen        : " +idDosen);
        System.out.println("Nama            : " +nama);
        System.out.println("Status Aktif    : " +statusAktif);
        System.out.println("Tahun Bergabung : " +tahunBergabung);
        System.out.println("Bidang Keahlian : " +bidangKeahlian);
    }

    void setStatusAktif(boolean status){
        statusAktif = status;
        System.out.println("Status aktif dosen telah diubah menjadi: " +statusAktif);
    }

    int hitungMasaKerja(int thnSkrg){
        int masaKerja = thnSkrg - tahunBergabung;
        return masaKerja;
    }

    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
        System.out.println("Bidang Keahlian berhasil diubah menjadi: " +bidangKeahlian);
    }
}
