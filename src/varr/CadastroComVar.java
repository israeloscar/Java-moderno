package varr;

import java.util.ArrayList;

public class CadastroComVar {
    public static void main(String[] args) {

        // Utiliza inferência de tipo.
        // O compilador identifica automaticamente os tipos das variáveis.
        var nome = "Israel";
        var idade = 15;
        var salario = 3500.00;

        // Cria uma lista dinâmica para armazenar os jogos favoritos.
        var jogos = new ArrayList<String>();

        // Adiciona elementos à lista utilizando o método add().
        jogos.add("Roblox");
        jogos.add("Red Dead Redemption 2");
        jogos.add("GTA");

        // Exibe os dados formatados utilizando printf.
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Idade: %d%n", idade);
        System.out.printf("Salário: %.2f%n", salario);
        System.out.printf("Jogos: %s%n", jogos);

    }
}