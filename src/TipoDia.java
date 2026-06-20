public class TipoDia {
    public static void main(String[] args) {

        // Representa um dia da semana.
        var dia = 6;

        // Utiliza Switch Expression com múltiplos valores
        // em um mesmo case para agrupar comportamentos.
        var tipo = switch (dia) {

            case 1, 2, 3, 4, 5 -> "Dia útil";

            case 6, 7 -> "Fim de semana";

            // Executado quando o valor informado
            // não corresponde a nenhum caso.
            default -> "Dia inválido";
        };

        // Exibe o resultado retornado pelo switch.
        System.out.println(tipo);
    }
}