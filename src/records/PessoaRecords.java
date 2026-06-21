package records;

public record PessoaRecords(

        // Componentes do Record.
        // O Java gera automaticamente construtor,
        // métodos de acesso, toString, equals e hashCode.
        String nome,
        int idade

) {
    public static void main(String[] args) {

        // Cria um objeto utilizando o construtor
        // gerado automaticamente pelo Record.
        PessoaRecords pessoa =
                new PessoaRecords("Alfredo", 32);

        // Acessa os valores através dos métodos
        // gerados automaticamente pelo Record.
        System.out.println(pessoa.nome());
        System.out.println(pessoa.idade());

        // Utiliza o método toString()
        // gerado automaticamente pelo Java.
        System.out.println(pessoa);

    }
}