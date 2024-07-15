public class MethodParameter {
    public static void main(String[] args) {

    sayHello("Alamsyah", "Hutama");
    sayHello("Dikri", "Maulana");
    sayHello("Hani", "Bassam");

    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }

}
