public class Vaca extends Animal{
    protected String som;
    protected String nome;
    public Vaca(String name){
        super("Azevém");
        nome = name;
        som = "Muuuh";
    }
    public String Mugir(){
        return som;
    }
    public String getNome(){
        return nome;
    }
}