import java.util.ArrayList;

public class CadastroComVar {
    public static void main(String[] args) {

        var nome = "Israel";
        var idade = 15;
        var salario = 3500.00;
        var jogos = new ArrayList<String>();

        jogos.add("Roblox");
        jogos.add("Red Dead Redemption 2");
        jogos.add("GTA");

        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Idade: %d%n", idade);
        System.out.printf("Salário: %.2f%n",salario);
        System.out.printf("Jogos: %s%n",jogos);

    }
}