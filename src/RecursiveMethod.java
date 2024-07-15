public class RecursiveMethod {
    public static void main(String[] args) {

        System.out.println(factorialLoop(5));
        System.out.println(factorialRecursive(5));
        loop(10);
    }
    static int factorialLoop (int value) {
        var result = 1;
        for (int i = 1; i <=value;i++) {
            result *= i; // atau = result * i;
        }
        return result;
    }

    static int factorialRecursive(int value){
        if(value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value-1);
        }
    }

    static void loop(int value) {
        if(value == 0){
            System.out.println("Selesai");
        } else {
            System.out.println("Loop " + value);
            loop(value-5);
        }
    }

}
