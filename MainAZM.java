public class MainAZM {
    public static void main(String[] args) {
        Gato cat = new Gato("preto");
        cat.Alimentar("frango");
        cat.Alimentar("peixe");
        System.out.println(cat.getCor());
    }
}
