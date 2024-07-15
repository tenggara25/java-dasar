import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {

        int inputNilai;
        System.out.println("Masukan nilai :");
        Scanner scanner = new Scanner(System.in);
        inputNilai = scanner.nextInt();



        for (int i = 1; i <= inputNilai; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
