public class NivelFuncionario {
    public static void main(String[] args) {

        // Representa o nível do funcionário.
        var nivel = 2;

        // Utiliza Switch Expression para retornar
        // o cargo correspondente ao nível informado.
        var cargo = switch (nivel) {

            case 1 -> "Júnior";
            case 2 -> "Pleno";
            case 3 -> "Sênior";
            case 4 -> "Especialista";

            // Executado quando o nível não existe.
            default -> "Nível desconhecido";

        };

        // Exibe o cargo retornado pelo switch.
        System.out.println("Cargo: " + cargo);

    }
}