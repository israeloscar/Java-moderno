package text_blocks;

public class MensagemBoasVindas {
    public static void main(String[] args) {

        // Utiliza Text Block para criar Strings multilinha.
        // O texto é escrito de forma mais legível que usando \n e concatenação.
        var mensagem = """
                Olá!
                
                Seja bem-vindo aos estudos de Java Moderno
                
                Este é um exercício de Text Blocks
                """;

        System.out.println(mensagem);

    }
}
