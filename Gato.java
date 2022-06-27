public class Gato extends Animal {
    private String cor;
    public Gato(String cor){
        super("peixe");
        this.cor = cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCor() {
        return cor;
    }
    public void miar(){
        System.out.println("Miau!");
    }
}
