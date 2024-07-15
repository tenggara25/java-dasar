public class soal1 {
    public static void main(String[] args) {

        // tapi pake scanf di c
        int [] a = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        int i;

        for(i=0; i < a.length; i++){
            sum += a[i];
        }

        System.out.println("Total " + sum);
        System.out.println("Rata-rata " + sum / a.length);

    }
}
