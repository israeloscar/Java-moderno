// Records são ideais para representar objetos que apenas armazenam dados.
// O Java gera automaticamente construtor, métodos de acesso,
// toString, equals e hashCode.

public record LivroRecords(

        // Componentes do Record.
        String titulo,
        String autor,
        int ano

) {
    public static void main(String[] args) {

        // Utiliza inferência de tipo (var) para criar objetos Record.
        var romeuJulieta =
                new LivroRecords(
                        "Romeu e Julieta",
                        "Shakespeare",
                        1594
                );

        // Objeto com os mesmos dados do primeiro.
        // Será considerado igual pelo método equals().
        var romeuJulieta2 =
                new LivroRecords(
                        "Romeu e Julieta",
                        "Shakespeare",
                        1594
                );

        // Objeto com dados diferentes.
        var harryPotter =
                new LivroRecords(
                        "Harry Potter",
                        "J.K. Rowling",
                        1997
                );

        // Utiliza o toString() gerado automaticamente pelo Record.
        System.out.println(romeuJulieta);
        System.out.println(romeuJulieta2);
        System.out.println(harryPotter);

        // Compara os valores internos dos objetos.
        // Como os dados são iguais, retorna true.
        System.out.println(
                romeuJulieta.equals(romeuJulieta2)
        );

        // Como os dados são diferentes, retorna false.
        System.out.println(
                romeuJulieta.equals(harryPotter)
        );
    }
}