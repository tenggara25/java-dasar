public class ForEach {
    public static void main(String[] args) {
        String[] names = {
                "Alamsyah", "Hutama",
                "Universitas", "Al-Azhar", "Indonesia"
        };

        for (int i=0; i < names.length;i++) {
            System.out.println(names[i]+" ");
        }
        System.out.println("-------------");

        for(var name: names){
            System.out.println(name + " ");
        }
    }
}
