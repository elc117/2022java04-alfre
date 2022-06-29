import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        Vaca v1 = new Vaca("Bebel");
        Vaca v2 = new Vaca("Mimosa");
        Vaca v3 = new Vaca("Beta");
        List<Vaca> Boiada = new ArrayList<Vaca>();
        Boiada.add(v1);
        Boiada.add(v2);
        Boiada.add(v3);
        for (Vaca v : Boiada){
            System.out.println(v.getNome() + " recebe azevém e diz: " + v.Mugir() + " ");
            v.Alimentar("Azevém");
        }
    }
}