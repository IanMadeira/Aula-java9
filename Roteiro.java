public class Roteiro {
    public String disciplina;
    public String nomeAula;
    public String conteudo;

    Roteiro(String disciplina, String nomeAula, String conteudo) {
        this.disciplina = disciplina;
        this.nomeAula = nomeAula;
        this.conteudo = conteudo;
    }

    public String exibir() {
        return "Disciplina: " + disciplina + ", Aula: " + nomeAula + ", Conteudo: " + conteudo;
    }
}