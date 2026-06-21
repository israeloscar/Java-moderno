package switch_expressions;

public class MenuUsuario {
    public static void main(String[] args) {

        // Opção escolhida pelo usuário.
        var opcao = 2;

        // Utiliza Switch Expression.
        // Cada caso retorna um valor diretamente,
        // eliminando a necessidade de break.
        var resultado = switch (opcao) {

            case 1 -> "Cadastrar";
            case 2 -> "Listar";
            case 3 -> "Editar";

            // Executado quando nenhum case é encontrado.
            default -> "Opção inválida";

        };

        // Exibe o resultado retornado pelo switch.
        System.out.println(resultado);

    }
}
