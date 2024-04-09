import java.util.ArrayList;
public class Professor {
    public String nome;
    private ArrayList<Roteiro> roteiros;
    Professor(String nome,ArrayList<Roteiro> roteiros ){
        this.nome=nome;
        this.roteiros=roteiros;
    }
    public ArrayList<Roteiro> getRoteiros() {
        return roteiros;
    }
}
