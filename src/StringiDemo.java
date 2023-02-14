public class StringiDemo {
    public static void main(String[] args) {
        String name = "Zdzisek";

        int dlugosc = name.length();

        char inicjal = name.charAt(3);
        System.out.println("Inicjał " + inicjal);

        String male, duze;

        name = name.toLowerCase();
        duze = name.toUpperCase();

        System.out.println(" " + name);


    }
}
