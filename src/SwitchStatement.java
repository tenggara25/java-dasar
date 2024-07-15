public class SwitchStatement {
    public static void main(String[] args) {
         String nilai = "A";

       /* switch (nilai){
            case "A":
                System.out.println("Anda Lulus Dengan Baik");
                break;
            case "B":
            case "C":
                System.out.println("Anda Lulus dengan nilai cukup baik");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Mungkin anda salah jurusan"); */
        switch (nilai) {
            case "A" -> System.out.println("Sangat baik");
            case "B", "C" -> System.out.println("Cukup");
            case "D" -> System.out.println("Tidak lulus");
            default -> {
                System.out.println("Anda pasti salah jurusan");
                         }
        }
        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = ("Sangat baik");
            case "B", "C" -> ucapan = ("Cukup");
            case "D" -> ucapan = ("Tidak lulus");
            default -> {
                ucapan = ("Anda pasti salah jurusan");
            }
        }

        System.out.println(ucapan);

        ucapan = switch (nilai) {
            case "A":
                yield ("Sangat baik");
            case "B", "C":
                yield ("Cukup");
            case "D":
                yield  ("Tidak lulus");
            default:
                yield  ("Anda pasti salah jurusan");

        };

        System.out.println(ucapan);
    }
}
