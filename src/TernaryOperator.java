public class TernaryOperator {
    public static void main(String[] args) {
    var nilai = 75;
    String ucapan;

    if (nilai >=75) {
        ucapan = "Selamat anda lulus";
    } else {
        ucapan = "Silahkan Coba Lagi";
    }

        System.out.println(ucapan);

    var nilai2 = 75;
    String ucapan2 = nilai >= 75 ? "Lulus" : "Tidak Lulus";
        System.out.println(ucapan2);
    }
}
