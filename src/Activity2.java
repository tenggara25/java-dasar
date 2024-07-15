import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Data : ");
        int percentageMark = scanner.nextInt();

        if (percentageMark < 0 | percentageMark > 20){
            System.out.println("Invalid Mark");
        } else if (percentageMark == 10){
            System.out.println("Lulus");
        } else {
            System.out.println("END");
        }
        System.out.println("Your Entered :" + percentageMark);
    }
}
