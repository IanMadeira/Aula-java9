import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner leitorDeDados = new Scanner(System.in);
        System.out.println("Digite seu nome professor :");
        String nome = leitorDeDados.nextLine();

        ArrayList<Roteiro> roteiros = new ArrayList<>();

        int opcao = 1;


        while (opcao==1) {

            System.out.println("Digite sua disciplina minisrada:");
            String disciplina = leitorDeDados.nextLine();

            System.out.println("digite o nome da aula:");
            String nomeAula = leitorDeDados.nextLine();

            System.out.println("digite o seu conteudo:");
            String conteudo = leitorDeDados.nextLine();

            Roteiro roteiro = new Roteiro(disciplina, nomeAula, conteudo);
            roteiros.add(roteiro);
            Professor professor = new Professor (nome,roteiros);

            System.out.println("Roteiro cadastrado Prof" + nome + ".deseja cadastrar mais roteiros 1-Sim 2-Não");
            opcao=leitorDeDados.nextInt();
            leitorDeDados=new Scanner(System.in);
            if(opcao!=1)
                break;
            for (Roteiro r : professor.getRoteiros()){
                System.out.println(r.exibir());
            }


        }
    }
}
