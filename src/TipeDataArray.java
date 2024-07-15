public class TipeDataArray {
    public static void main(String[] args) {
        String[] arrayString;
        arrayString = new String[3];
        arrayString[0] = "Alamsyah";
        arrayString[1] = "Tenggara";
        arrayString[2] = "Hutama";

        arrayString[2]= "DR";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        arrayString[1] = "Krishna";

        System.out.println(arrayString[1]);

        int[] arrayInt = new int[] {
                1,2,3,4,5,6
        };

       long[] arrayLong = {
               10L,20L,
       };

        System.out.println(arrayLong.length);

        String[][] members = {
                {"Adi", "Alam", "Dikri"},
                {"Hendri", "Kukuh",  "Jeje"},
                {"Oman"}

        };

        System.out.println(members[0][2]);
        System.out.println(members[1][1]);

    }
}
